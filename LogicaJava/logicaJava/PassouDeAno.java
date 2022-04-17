package logicaJava;

import java.util.Scanner;

public class PassouDeAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a nota do aluno : ");
        Integer nota = scanner.nextInt();

        Boolean resultado = nota >= 70;

        if (resultado) {
            System.out.println("O aluno" + nome +  "foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
        scanner.close();
    }
}
