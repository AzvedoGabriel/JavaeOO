package ModuloFundamentosDaLinguagem.Estrutura;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int numerofim;

        System.out.print("Ultimo numero: ");
        numerofim = scan.nextInt();

        for (int i = -8; i <= numerofim; i++) {
            System.out.println(i);

            scan.close();
        }
    }
}
