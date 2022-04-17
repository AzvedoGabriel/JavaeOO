package ModuloFundamentosDaLinguagem.Estrutura;

import java.util.Scanner;

public class EstruturaSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o final da Placa: ");
        int finalPlaca = scan.nextInt();

        switch (finalPlaca) {
            case 1:
                System.out.println("Vencimento dia 11 de Janeiro");
                break;
            case 2:
                System.out.println("Vencimento dia 12 de Janeiro");
                break;
            case 3:
                System.out.println("Vencimento dia 13 de Janeiro");
                break;
            default:
                System.out.println("Vencimento sem data, desculpe");
        }
        scan.close();
    }
}
