package lesson13_exceptions;

public class Password {
    String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValidPassword() {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов, не содержать пробелов и содержать хотя бы одну цифру");
        } else {
            System.out.print("Пароль совпадает с критериями - ");
            return true;
        }
    }
}
