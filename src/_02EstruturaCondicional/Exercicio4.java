package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das horas
        double hour01 = scanner.nextDouble();
        double hour02 = scanner.nextDouble();

        double quantityOfHours;

        // Cálculo do intervalo
        if (hour01 > hour02) {
            quantityOfHours = (24 - hour01) + hour02;
        } else {
            quantityOfHours = hour02 - hour01;
        }
        if(hour01 == 0&&hour02 == 0){
            System.out.println(24);
        }

        // Saída do resultado
        System.out.println(quantityOfHours);
    }
}
