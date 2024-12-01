package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int fat = 1;
        for (int i = 1; i <= x; i++) {
            fat *= i;
        }
        System.out.println(fat);

        scanner.close();
    }
}
