package ModuloFundamentosDaLinguagem.Estrutura;

import java.util.Scanner;

public class EstruturaDeDecisão {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua Altura: ");
        double altura = scan.nextDouble();

        System.out.print("Informe seu Peso: ");
        int peso = scan.nextInt();

        double imc = peso /  (altura * altura);

        System.out.println("Oi " + nome + " Seu pacienteIMC.IMC é: " + imc);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc <25) {
            System.out.println("Peso Ideal");
        } else if (imc <30) {
            System.out.println("Acima do peso ideal");
        } else if (imc <40) {
            System.out.println("Obesidade grave 1 ou 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

        scan.close();
    }

}
