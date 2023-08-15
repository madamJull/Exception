package org.example;
import java.util.Scanner;
public class Dz_21 {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            sc.nextLine();
            int result = divide(a, b);
            System.out.println("Результат деления: "+ result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        sc.nextLine();
        System.out.println();
    }
}

