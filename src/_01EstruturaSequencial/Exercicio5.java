package _01EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idProduct = scanner.nextInt();
        int quantityProduct = scanner.nextInt();
        double valueProduct = scanner.nextDouble();

        int idProduct2 = scanner.nextInt();
        int quantityProduct2 = scanner.nextInt();
        double valueProduct2 = scanner.nextDouble();

        double total = ((quantityProduct*valueProduct)+(quantityProduct2*valueProduct2));

        System.out.println("Valor a pagar : R$ "+ total);

    }
}
