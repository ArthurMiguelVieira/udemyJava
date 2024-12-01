package _03EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool =0;
        int gasolina =0;
        int diesel =0;

        while (true){
            int typeOfFuel = scanner.nextInt();

            if(typeOfFuel==1){
                alcool++;
            }else if(typeOfFuel==2){
                gasolina++;
            }else if(typeOfFuel==3){
                diesel++;
            }else if(typeOfFuel ==4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: "+alcool);
                System.out.println("Gasolina: "+gasolina);
                System.out.println("Diesel: "+diesel);
                break;
            }else{
                System.out.println("Codigo Invalido");
            }

        }
        scanner.close();
    }
}
