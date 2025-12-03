package SpecialTask;

import java.io.*;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //1. Создать программу, которая принимает через переменную args n-ое количество параметров.
        //2. Эти параметры сохранить в Объекте "Терминал"
        //3. Сериализовать объект и сохранить его в текстовом документе.

        Terminal t = new Terminal(args);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("terminal.txt"))) {
            oos.writeObject(t);
            System.out.println("Сериализовано!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("terminal.txt"))) {
            Terminal readT = (Terminal) ois.readObject();
            System.out.println("Десериализовано!" + readT);
            System.out.println(Arrays.toString(readT.parameters));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Пример без сериализации:
        //try (PrintWriter pw = new PrintWriter("terminal.txt", "UTF-8")) {
        //            pw.println("Параметры терминала: " + Arrays.toString(args));
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
    }
}
