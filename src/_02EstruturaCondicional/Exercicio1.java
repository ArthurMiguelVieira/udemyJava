package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(x<0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("POSITIVO");
        }
    }
}
