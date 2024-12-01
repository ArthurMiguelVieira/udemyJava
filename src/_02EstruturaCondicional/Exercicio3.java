package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dois números inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Verificar se são múltiplos
        if (A % B == 0 || B % A == 0) {
            System.out.println("MULTIPLOS");
        } else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        scanner.close();
    }
}
