package _01EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        System.out.println("Area :"+(Math.PI*(raio*raio)));
        scanner.close();
    }
}
