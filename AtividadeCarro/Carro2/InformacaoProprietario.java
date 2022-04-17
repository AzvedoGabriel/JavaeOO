package Carro2;

import java.util.Scanner;

public class InformacaoProprietario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 0;
        meuCarro.cor = "";
        meuCarro.fabricante = "";
        meuCarro.modelo = "";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "";
        meuCarro.dono.Bairro = "";
        meuCarro.dono.logradouro = "";
        meuCarro.dono.cidade = "";
        meuCarro.dono.cpf = "";
        meuCarro.dono.idade = 0;



        System.out.print("Informe o Ano de Fabricação do carro: ");
        meuCarro.anoDeFabricacao = scan.nextInt();

        System.out.print("Informe a Cor do carro: ");
        scan.nextLine();
        meuCarro.cor = scan.nextLine();

        System.out.print("Informe o Fabricante do carro: ");
        meuCarro.fabricante = scan.nextLine();

        System.out.print("Informe o Modelo do carro: ");
        meuCarro.modelo = scan.nextLine();
        System.out.println();

        System.out.print("---------------------------------");
        System.out.println();

        System.out.print("Informe o nome do Dono(a/e): ");
        meuCarro.dono.nome = scan.nextLine();

        System.out.print("Informe o Bairro do Dono(a/e): ");
        meuCarro.dono.Bairro = scan.nextLine();

        System.out.print("Informe a cidade do Dono(a/e): ");
        meuCarro.dono.cidade = scan.nextLine();

        System.out.print("Informe o logradouro: ");
        meuCarro.dono.logradouro = scan.nextLine();

        System.out.print("Informe o cpf do Dono(a/e): ");
        meuCarro.dono.cpf = scan.nextLine();

        System.out.print("Informe a idade do Dono(a/e): ");
        meuCarro.dono.idade = scan.nextInt();

        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("O Dono(a/e) é: " + meuCarro.dono.nome );
        System.out.println();

        System.out.println("Bairro onde ele mora: " + meuCarro.dono.Bairro);
        System.out.println();

        System.out.println("Cidade de onde ele mora: " + meuCarro.dono.cidade);
        System.out.println();

        System.out.println("Logradouro do proprietario(a/e): " + meuCarro.dono.logradouro);
        System.out.println();

        System.out.println("A Idade do proprietario(a/e): " + meuCarro.dono.idade);
        System.out.println();

        System.out.println("O carro é: " + meuCarro.modelo);
        System.out.println("Fabricante é: " + meuCarro.fabricante);
        System.out.println("Cor do veículo: " + meuCarro.cor);
        System.out.println("Ano do veículo:" + meuCarro.anoDeFabricacao);

        scan.close();
    }
}