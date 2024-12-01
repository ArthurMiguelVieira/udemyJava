package _01EstruturaSequencial;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangle = (A*C)/2;
        double circle = Math.PI*(C*C);
        double trapeze = ((A+B)*C)/2;
        double square = B*B;
        double rectangle = A*B;

        System.out.println("TRIANGULO: "+triangle+"\n"+
                            "CIRCULO: "+circle+"\n"+
                            "TRAPEZIO: "+trapeze+"\n"+
                            "QUADRADO: "+square+"\n"+
                            "RETANGULO: "+rectangle);
    }
}
