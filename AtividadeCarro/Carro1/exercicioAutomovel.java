package Carro1;

import java.util.Scanner;

public class exercicioAutomovel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Carro meuCarroUM, seuCarroUM; // declaração da variável

        meuCarroUM = new Carro(); // instanciamos a variavel com um objeto do tipo Carro
        meuCarroUM.fabricante = "";
        meuCarroUM.modelo = "";
        meuCarroUM.anoDeFabricacao = 0;
        meuCarroUM.cor = "";

        System.out.println("Meu carro");

        System.out.println();

        System.out.print("Informe o modelo: ");
        meuCarroUM.modelo = scan.nextLine();

        System.out.print("Informe o Fabricante: ");
        meuCarroUM.fabricante = scan.nextLine();

        System.out.print("Informe a cor do carro: ");
        meuCarroUM.cor = scan.nextLine();

        System.out.print("Informe o ano de fabricação: ");
        meuCarroUM.anoDeFabricacao = scan.nextInt();

        System.out.print("-------------------------------");
        System.out.println();

        System.out.print("Meu carro é: " + meuCarroUM.fabricante + "," + meuCarroUM.modelo + "," + meuCarroUM.anoDeFabricacao + "," + meuCarroUM.cor +".");

        System.out.println();

        System.out.println("-------------------------------");

        seuCarroUM = new Carro();

        seuCarroUM.fabricante = "";
        seuCarroUM.modelo = "";
        seuCarroUM.anoDeFabricacao = 0;
        seuCarroUM.cor = "";


        System.out.println("Seu carro");

        System.out.println();

        System.out.print("Informe o modelo: ");
        scan.nextLine();
        seuCarroUM.modelo = scan.nextLine();


        System.out.print("Informe o  Fabricante: ");
        seuCarroUM.fabricante = scan.nextLine();

        System.out.print("Informe a cor do carro: ");
        seuCarroUM.cor = scan.nextLine();

        System.out.print("Informe o ano de fabricação: ");
        seuCarroUM.anoDeFabricacao = scan.nextInt();

        System.out.print("-------------------------------");
        System.out.println();

        System.out.println("Seu carro é: " + seuCarroUM.fabricante + "," + seuCarroUM.modelo + "," + seuCarroUM.anoDeFabricacao + "," + seuCarroUM.cor +"." );

        System.out.println("-------------------------------");

        System.out.println("Fim do código");

        scan.close();

    }
}
