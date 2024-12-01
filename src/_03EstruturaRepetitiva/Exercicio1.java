package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            int password = scanner.nextInt();
            System.out.println("Senha Invalida");
            if(password == 2002){
                System.out.println("Acesso Permitido");
                break;
            }
        }

        scanner.close();
    }
}
