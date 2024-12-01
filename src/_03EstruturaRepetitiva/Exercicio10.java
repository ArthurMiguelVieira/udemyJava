package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.print(i+" ");
            System.out.print(i*i+" ");
            System.out.println(i*i*i);
        }

    }
}
