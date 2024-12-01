package _02EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(x%2==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}
