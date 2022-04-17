package ModuloFundamentosDaLinguagem.Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua Idade");

        idade = scan.nextInt();

        String indicacao = (idade >= 18) ? "adulto" : "criança/adolescente";

        System.out.println("Resultado: " + indicacao);


        scan.close();
    }
}
