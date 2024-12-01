package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sq = scanner.nextInt();

        for (int i = 0; i < sq; i++) {
            double v1 = scanner.nextDouble();
            double v2 = scanner.nextDouble();
            double v3 = scanner.nextDouble();
            System.out.println((v1*2+v2*3+v3*5)/10);
        }


    }
}
