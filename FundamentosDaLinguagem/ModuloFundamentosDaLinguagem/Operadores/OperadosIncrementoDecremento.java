package ModuloFundamentosDaLinguagem.Operadores;

import java.util.Scanner;

public class OperadosIncrementoDecremento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade");
        idade = scan.nextInt();

        int novaIdade = idade++;

        System.out.println("Idade: " + idade);
        System.out.println("Nova idade: " + novaIdade);


        scan.close();
    }
}
