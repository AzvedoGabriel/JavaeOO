package pacienteIMC;

import java.util.Scanner;

public class PacienteIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IMCinformacao pessoa = new IMCinformacao();

        pessoa.peso = 0;
        pessoa.altura = 0;

        System.out.println("Informe o peso do paciente: ");
        pessoa.peso = scan.nextDouble();

        System.out.println("Informe a Altura do paciente: ");
        pessoa.altura = scan.nextDouble();


        IMC imc = pessoa.calcularIndice();

        System.out.println("pacienteIMC.IMC abaixo do peso ideal: " + imc.abaixodoPeso);
        System.out.println("pacienteIMC.IMC peso ideal: " + imc.pesoIdeal);
        System.out.println("pacienteIMC.IMC obeso(a/e): " + imc.obeso);
        System.out.println("Imc Grau da Obesidade: " + imc.GrauObesidade);

        scan.close();
    }
}
