package lesson8_homework;

public class Runner {
    public static void main(String[] args) {
        //Задача 1:
        //Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        //Переопределить методы voice(), eat(String food) чтобы они выводили верную
        //информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        //Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        //туда “Grass” он должен написать в консоль, что любит есть травку. Если передадим “Meat”
        //или другую строку, то он будет недоволен.
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        dog.voice();
        dog.eat("Meat");
        rabbit.voice();
        rabbit.eat("Meat");
        tiger.voice();
        tiger.eat("Grass");
    }
}
