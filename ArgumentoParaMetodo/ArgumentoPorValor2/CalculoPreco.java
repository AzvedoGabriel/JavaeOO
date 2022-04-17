package ArgumentoPorValor2;

import java.util.Scanner;

public class CalculoPreco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Preco preco = new Preco();

        preco.valorCustos = 0;

        System.out.println("Informe o valor do Produto: ");
        preco.valorCustos = scan.nextDouble();

        Produto1 produto = new Produto1();

        produto.precoProduto1(preco, 20, 35);

        System.out.println("Informe o Valor do custo: " + preco.valorCustos);
        System.out.println("Informe o Imposto no produto: " + preco.valorImpostos);
        System.out.println("Informe o Lucro: " + preco.valorLucro);
        System.out.println("Informe a Venda: " + preco.precoVenda);

        scan.close();

    }
}
