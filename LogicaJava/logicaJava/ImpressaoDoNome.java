package logicaJava;

import java.util.Scanner;

public class ImpressaoDoNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = entrada.nextLine();

        System.out.print("Digite seu Sobrenome: ");

        String sobrenome = entrada.nextLine();

        System.out.println("Olá "+nome.trim()+" "+sobrenome.trim()+"!");

        entrada.close();


    }
}
