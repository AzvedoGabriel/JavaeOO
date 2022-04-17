package calculoIMC;

import java.util.Scanner;

public class CalculoIMChumano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        PacienteCalculoIMC pessoa = new PacienteCalculoIMC ();

        pessoa.peso = 0;

        pessoa.altura = 0;

        System.out.print("Informe o peso do paciente: ");
        pessoa.peso = scan.nextDouble();

        System.out.print("Informe a altura do paciente: ");
        pessoa.altura = scan.nextDouble();


        double IMCcalculo = pessoa.calcularIMC();

        System.out.println("O Imc do paciente: " + IMCcalculo);


        scan.close();

    }
}
