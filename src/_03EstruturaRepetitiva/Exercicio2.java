package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            String x2 = scanner.nextLine();
            String y2 = scanner.nextLine();

            if(y2==""||x2==""){
                break;
            }
            double x = Double.parseDouble(x2);
            double y = Double.parseDouble(y2);



            if (x > 0 && y > 0){
                System.out.println("Primeiro");
            }else if(x > 0 && y < 0){
                System.out.println("Quarto");
            }else if(x < 0 && y > 0){
                System.out.println("Segundo");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }else{
                System.out.println("Origem");
            }


        }
    }
}
