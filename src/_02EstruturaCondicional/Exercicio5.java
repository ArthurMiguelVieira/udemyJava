package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        int quantity = scanner.nextInt();
        double price;

        switch (id) {
            case 1:
                price = 4;
                break;
            case 2:
                price = 4.5;
                break;
            case 3:
                price = 5;
                break;
            case 4:
                price = 2;
                break;
            case 5:
                price = 1.5;
                break;

            default:
                System.out.println("ID inválido");
                price=0;
        }

        System.out.println("Total: R$ " + (quantity * price));

    }
}
