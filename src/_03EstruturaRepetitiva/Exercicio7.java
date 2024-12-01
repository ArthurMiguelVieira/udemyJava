package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sq = scanner.nextInt();

        for (int i = 0; i < sq; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            if(y == 0){
                System.out.println("Divisao impossivel");
            }else{
                System.out.println(x/y);
            }
        }
    }
}
