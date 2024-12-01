package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua renda: ");
        double income = scanner.nextDouble();
        double tax;

        if (income <= 2000) {
            tax = 0; // Isento de imposto
        } else if (income <= 3000) {
            tax = (income - 2000) * 0.08; // 8% sobre o valor acima de R$ 2000
        } else if (income <= 4500) {
            tax = (1000 * 0.08) + ((income - 3000) * 0.18); // 8% nos primeiros R$ 1000 acima de R$ 2000 e 18% no restante
        } else {
            tax = (1000 * 0.08) + (1500 * 0.18) + ((income - 4500) * 0.28); // 8% nos primeiros R$ 1000, 18% nos próximos R$ 1500 e 28% no restante
        }

        System.out.printf("R$ %.2f%n", tax); // Exibe o valor formatado com duas casas decimais
        scanner.close();
    }
}
