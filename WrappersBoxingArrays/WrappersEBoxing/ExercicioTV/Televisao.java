package WrappersEBoxing.ExercicioTV;

import java.util.Scanner;

public class Televisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Tela tv = new Tela();

        Marca informacao = new Marca();

        System.out.println("Informe o Proprietario da televisão: ");
        informacao.Proprietario = scan.nextLine();

        System.out.println("Informe a Marca da televisão: ");
        informacao.Nome = scan.nextLine();

        System.out.println("Informe a Polegada da televisão:");
        informacao.Tamanho = scan.nextLine();

        System.out.println("Informe o canal desejado: ");
        tv.canal = scan.nextInt();

        System.out.println("Informe o Volume");
        tv.volume = scan.nextInt();


        System.out.println("Canal que queira trocar: ");
        tv.mudarCanal (0);

        System.out.println("Volume desejado: ");
        tv.mudarVolume(0);

    }
}
