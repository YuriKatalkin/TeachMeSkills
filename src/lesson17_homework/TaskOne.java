package lesson17_homework;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskOne {
    //Задача 1:
    //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
    //когда пользователю исполнится 100 лет. Использовать Date/Time API.
    private String user;
    private LocalDate localDate;
    private LocalDate birthDate;

    public TaskOne(String user, LocalDate localDate, LocalDate birthDate) {
        this.user = user;
        this.localDate = localDate;
        this.birthDate = birthDate;
    }

    public static LocalDate getBirthDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год рождения:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения:");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения:");
        int day = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    public LocalDate getCentennialDate() {
        return birthDate.plusYears(100);
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + user + ";\n" +
                "Дата рождения: " + birthDate + ";\n" +
                "Текущая дата: " + localDate + ";\n" +
                "При достижении 100-летия, дата: " + getCentennialDate();
    }
}
