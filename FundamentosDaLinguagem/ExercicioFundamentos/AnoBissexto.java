package ExercicioFundamentos;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Informe o ano desejado: ");
        ano = scan.nextInt();

        if(ano % 400 == 0){
            System.out.println("O ano informado: " + ano + " é um ano bissexto");
        } else if (ano % 4 == 0){
            if ( ano % 100 !=0) {
                System.out.println("O ano informado: " + ano + " é um ano bissexto");
            }
        }else {
            System.out.println("O ano informado: " + ano + " não é um ano bissexto");
        }
    }
}
