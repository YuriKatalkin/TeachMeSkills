package lesson10_homework;

import lesson8_homework.Rabbit;

import java.util.Locale;
import java.util.Objects;

public class User implements Cloneable {
    private String username;
    private String email;
    private String userId;
    AliveHuman aliveHuman;
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public User(String userId, AliveHuman aliveHuman) {
        //System.out.println("Конструктор на 2");
        this.userId = userId;
        this.aliveHuman = aliveHuman;
    }

    @Override
    public String toString() {
        return "..." + aliveHuman + " , " + userId + age;
    }
    //user1.equals(user2) - комментарий для себя.
    @Override
    public boolean equals(Object o) {
        //System.out.println(o);
        if (!(o instanceof User passedUser)) return false; // (является ли о, объектом класса user)
        return this.age == passedUser.age && Objects.equals(this.username, passedUser.username)
                && Objects.equals(this.email, passedUser.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }


    public User shallowClone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User clonedUser = (User) super.clone();
        clonedUser.aliveHuman = new AliveHuman(this.aliveHuman.name);
        return clonedUser;
    }
}
