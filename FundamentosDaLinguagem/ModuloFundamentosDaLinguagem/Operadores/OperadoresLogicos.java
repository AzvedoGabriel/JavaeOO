package ModuloFundamentosDaLinguagem.Operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0#");

        System.out.print("Nome: ");
        String Nome ="";
        Nome = entrada.nextLine();


        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Sexo ( 1 Para 'M' ou 2 para 'F' ): ");
        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

        double  imc = peso / (altura * altura);

        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.println("Olá " + Nome +" você está com"+ "" +" Abaixo do peso: " + df.format(imc));
        } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)){
            System.out.println("Olá " + Nome +" você está com"+ "" +" Peso Ideal: " + df.format(imc));
        } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
            System.out.println("Olá " + Nome +" você está com"+ "" +" Um pouco Acima do peso: " + df.format(imc));
        } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
            System.out.println("Olá " + Nome +" você está com"+ "" +" Acima do peso ideal: " + df.format(imc));
        } else if ((sexo == 'F' &&  imc <= 32.4 ) || (sexo == 'M' && imc <= 31.2)){
            System.out.println("Olá " + Nome +" você está com "+ "" + "Obeso(a): " + df.format(imc));
        } else {
            System.out.println("Olá " + Nome +" você está com"+ "" +" Obesidade Morbida ");
        }

        entrada.close();

    }
}
