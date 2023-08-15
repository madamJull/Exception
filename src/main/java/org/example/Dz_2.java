package org.example;
import java.util.Scanner;
public class Dz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            sc.nextLine();
            checkNumber(number);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        sc.nextLine();
        System.out.println();
    }
    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.println("Число корректно.");
        }
    }
}
