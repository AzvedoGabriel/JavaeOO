package logicaJava;

import java.util.Scanner;

public class ValorEDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scan.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int valorQuantidade = scan.nextInt();

        double desconto = 0.0;

        boolean descontoT = valorQuantidade >= 10;

        if (descontoT) {
            desconto = 10;
        }
        double subtotal = valorProduto * valorQuantidade;
        double valorDesconto = (subtotal * desconto) / 100;
        double valorTotal = subtotal - valorDesconto;

        System.out.println("O valor final da compra é R$" + valorTotal);


    }
}