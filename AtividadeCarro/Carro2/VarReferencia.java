package Carro2;

import java.util.Scanner;

public class VarReferencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Proprietario dono1 = new Proprietario();

        dono1.nome ="";

        Carro meuCarro = new Carro();

        System.out.print("Informe seu nome: ");
        meuCarro.dono = dono1;
        meuCarro.dono.nome = scan.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Informe o modelo do carro: ");
        meuCarro.modelo = scan.nextLine();
        meuCarro.LigarCarro();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Modelo: " + meuCarro.modelo +"," + " Pertence a: " +meuCarro.dono.nome );
        System.out.println("----------------------------------------------------------------------");

        Carro seuCarro = new Carro();
        System.out.print("Informe seu nome: ");
        seuCarro.dono = dono1;
        seuCarro.dono.nome = scan.nextLine();
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Informe o modelo do carro: ");
        seuCarro.modelo = scan.nextLine();
        seuCarro.LigarCarro();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Modelo: " + seuCarro.modelo +"," + " Pertence a: " + seuCarro.dono.nome);
        System.out.println("----------------------------------------------------------------------");

        scan.close();
    }
}
