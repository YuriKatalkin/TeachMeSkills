package lesson13_exceptions;

public class ConfirmPassword {
    String confirmPassword;

    public ConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isValidConfirmPassword(String confirmPassword) {
        if (confirmPassword.length() >= 20 || confirmPassword.contains(" ") ||
                !confirmPassword.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль не подтвердился!");
        } else {
            System.out.print("Пароль подтвержден☺ - ");
          return true;
        }
    }
}
