package WrappersEBoxing.Exercicio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Televisor tv = new Televisor();






        System.out.println("Informe o valor que gostaria de mudar o canal: ");
        tv.canal = scan.nextInt();

        System.out.println("Informe o volume desejado: ");
        tv.volume = scan.nextInt();


    }

}
