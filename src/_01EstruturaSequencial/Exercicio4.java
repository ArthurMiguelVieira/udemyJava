package _01EstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hoursOfWork = scanner.nextInt();
        double hourlyPay = scanner.nextDouble();

        System.out.println("NUMBER = "+number);
        System.out.println("SALARY = "+(hoursOfWork*hourlyPay));
        scanner.close();
    }
}
