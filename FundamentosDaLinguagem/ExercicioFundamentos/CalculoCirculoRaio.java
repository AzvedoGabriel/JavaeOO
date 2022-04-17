package ExercicioFundamentos;

import java.util.Scanner;

public class CalculoCirculoRaio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float pi = 3.14f;
        // raio será informado
        float raio = 0f;

        // informando valor do raio
        System.out.print("Informe o raio do círculo: ");
        raio = scan.nextFloat();

        float area = raio*raio*pi;
        int  areaSemDecimal = (int) area;

        // print do calculo
        System.out.println("O resultado é: " + area);

        // print sem decimal
        System.out.println("O resultado sem casas decimais: " + areaSemDecimal);
    }
}
