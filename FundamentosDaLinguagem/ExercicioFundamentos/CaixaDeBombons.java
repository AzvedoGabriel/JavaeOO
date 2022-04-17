package ExercicioFundamentos;

import java.util.Scanner;

public class CaixaDeBombons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int preco1 = 0;
        int preco2 = 0;
        int preco3 = 0;

        System.out.print("Informe o valor da primeira caixa de bombom: ");
        preco1 = scan.nextInt();

        System.out.print("Informe o valor da segunda caixa de bombom: ");
        preco2 = scan.nextInt();

        System.out.print("Informe o valor da terceira caixa de bombom: ");
        preco3 = scan.nextInt();

        int mediaGeral = (preco1 + preco2 + preco3) / 3;

                System.out.println("\"Sistema de calculo de Media\"");
                        System.out.println("Preço 1: " + preco1);
                        System.out.println("Preço 2: " + preco2);
                        System.out.println("Preço 3: " + preco3);
                        System.out.print("\nMedia dos preços:\n" + mediaGeral );

    }
}
