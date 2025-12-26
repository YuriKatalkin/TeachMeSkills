package lesson20_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskTwo {
    private static final int ARRAY_SIZE = 10;
    private static final int[] originalArray = generateRandomDigits();

    private static int[] generateRandomDigits() {
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Исходный массив: " + Arrays.toString(originalArray));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<int[]> insertionFuture = executor.submit(new InsertionSortTask(originalArray.clone()));
        Future<int[]> selectionFuture = executor.submit(new SelectionSortTask(originalArray.clone()));
        Future<int[]> bubbleFuture = executor.submit(new BubbleSortTask(originalArray.clone()));

        int[] insertionResult = insertionFuture.get();
        int[] selectionResult = selectionFuture.get();
        int[] bubbleResult = bubbleFuture.get();

        executor.shutdown();

        System.out.println("Сортировка вставками: " + Arrays.toString(insertionResult));
        System.out.println("Сортировка выбором: " + Arrays.toString(selectionResult));
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubbleResult));
        System.out.println("Все сортировки завершены.");
    }

    static class InsertionSortTask implements Callable<int[]> {
        private final int[] array;
        public InsertionSortTask(int[] array) {
            this.array = array;
        }

        @Override
        public int[] call() throws Exception {
            System.out.println("Запущена сортировка вставками в потоке: " + Thread.currentThread().getName());

            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
            return array;
        }
    }

    static class SelectionSortTask implements Callable<int[]> {
        private final int[] array;

        public SelectionSortTask(int[] array) {
            this.array = array;
        }

        @Override
        public int[] call() throws Exception {
            System.out.println("Запущена сортировка выбором в потоке: " + Thread.currentThread().getName());

            for (int i = 0; i < array.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = array[minIdx];
                array[minIdx] = array[i];
                array[i] = temp;
            }
            return array;
        }
    }

    static class BubbleSortTask implements Callable<int[]> {
        private final int[] array;

        public BubbleSortTask(int[] array) {
            this.array = array;
        }

        @Override
        public int[] call() throws Exception {
            System.out.println("Запущена сортировка пузырьком в потоке: " + Thread.currentThread().getName());

            boolean swapped;
            for (int i = 0; i < array.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
            return array;
        }
    }
}
