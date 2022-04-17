package logicaJava;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        System.out.println("Informe seu Peso");
        Double peso = scanner.nextDouble();

        //calculo usado para ver o pacienteIMC.IMC
        Double IMC = peso / (altura * altura);
        System.out.println("Seu pacienteIMC.IMC atual: " + IMC);

        scanner.close();
    }

}
