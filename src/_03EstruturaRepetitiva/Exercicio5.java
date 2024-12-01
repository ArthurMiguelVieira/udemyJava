package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sq = scanner.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < sq; i++) {
            int sv = scanner.nextInt();
            if (sv >= 10 && sv <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("in: " + in + " out: " + out);
    }
}
