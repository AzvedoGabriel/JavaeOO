package logicaJava;

import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite quantidade passada pelo cliente: ");
        Double valorPassado = scanner.nextDouble();

        Double resultado = valorPassado - valorProduto;

        System.out.println("Troco: " + resultado);

        scanner.close();
    }

}
