package Exercicio;

import java.util.Scanner;

public class Informacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos Produtos deseja informar?");
        int quantidadeDeProdutos = scan.nextInt();
        scan.nextLine();
        Estoque estoque = new Estoque();

        estoque.produtos = new Produto[quantidadeDeProdutos];

        for(int i = 0; i < estoque.produtos.length; i++){

            estoque.produtos[i] = new Produto();

            System.out.println("Descrição: ");
            estoque.produtos[i].descricao = scan.nextLine();
            System.out.println("------------------");

            System.out.println("Produto: ");
            estoque.produtos[i].quantidade = scan.nextInt();
            scan.nextLine();
        }
        estoque.listarProdutos();
     }
}