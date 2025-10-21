package lesson6_oop_start_homework.task_one;

import java.util.Scanner;

public class CreditCard {
    public long accountNumber;
    public int accountSum;
    public int newSum;

    public CreditCard(long accountNumber, int accountSum) {
        this.accountNumber = accountNumber;
        this.accountSum = accountSum;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", accountSum=" + accountSum +
                '}';
    }

    public void setMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nВведите сумму которую вы хотите начислить: ");
        int i = input.nextInt();
        newSum = accountSum + i;
        System.out.println("Вам начислено - " + i + "\n");
    }

    public void getMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nВведите сумму которую вы хотите снять: ");
        int i = input.nextInt();
        newSum = accountSum - i;
        System.out.println("У вас снято - " + i + "\n");
    }

    public void getInfo() {
        System.out.println("Текущая информация о карточке: ");
        System.out.println("\tНомер карты - " + accountNumber);
        System.out.println("\tСумма на карте(USD) - " + accountSum);
    }

    public void getNewInfo() {
        System.out.println("Новая информация о карточке: ");
        System.out.println("\tНомер карты - " + accountNumber);
        System.out.println("\tСумма на карте(USD) - " + newSum);
    }
}
