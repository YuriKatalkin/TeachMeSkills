package lesson13_exceptions;

public class Login {
    String login;

    public Login(String login) {
        this.login = login;
    }

    public boolean isValidLogin() {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не содержать пробелов");
        } else {
            System.out.print("Логин совпадает с критериями - ");
            return true;
        }
    }
}
