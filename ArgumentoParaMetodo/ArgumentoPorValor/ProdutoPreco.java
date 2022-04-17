package ArgumentoPorValor;

import java.util.Scanner;

public class ProdutoPreco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco = 0;

        System.out.println("Informe o valor: ");
        preco = scan.nextDouble();

        Produto valor = new Produto();

        valor.PrecoProduto(preco);

        System.out.println("Preço: " + preco);

        scan.close();
    }
}
