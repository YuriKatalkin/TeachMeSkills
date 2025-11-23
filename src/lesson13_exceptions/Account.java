package lesson13_exceptions;

import java.util.Scanner;

public class Account {

    public static void authorization() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите логин: ");
        Login login = new Login(input.nextLine());
        System.out.println(login.isValidLogin());

        System.out.println("Введите пароль: ");
        Password password = new Password(input.nextLine());
        System.out.println(password.isValidPassword());

        ConfirmPassword confirmPassword = new ConfirmPassword(password.getPassword());
        System.out.println(confirmPassword.isValidConfirmPassword(password.getPassword()));
    }
}

