package logicaJava;

import java.util.Scanner;

public class CalculandoQuadrado3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o número para fazer o cálculo: ");
        int número = scan.nextInt();

        int resultado = (número*número);

        System.out.println("O resultado do Quadrado é: " + resultado);

        scan.close();



    }
}
