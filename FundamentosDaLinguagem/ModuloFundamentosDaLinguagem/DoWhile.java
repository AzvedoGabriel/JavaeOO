package ModuloFundamentosDaLinguagem;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        do {
            System.out.println("Digite 0 para sair ou qualquer numero para somar: ");
            valor = scan.nextInt();

            soma += valor;
            System.out.println("Soma: " + soma);
        } while(valor !=0);
        scan.close();
    }
}
