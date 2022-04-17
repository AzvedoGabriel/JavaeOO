package ModuloFundamentosDaLinguagem.Estrutura;

import java.util.Scanner;

public class EstruturaControleWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInicial, numeroFinal, numeroAtual;

        System.out.println("Digite o numero Inicial");
        numeroInicial = scan.nextInt();

        System.out.println("Digite o numero Final");
        numeroFinal = scan.nextInt();

        numeroAtual = numeroInicial;

        while (numeroAtual <= numeroFinal) {
            System.out.println(numeroAtual);
            numeroAtual++;
        }
        scan.close();
    }
}
