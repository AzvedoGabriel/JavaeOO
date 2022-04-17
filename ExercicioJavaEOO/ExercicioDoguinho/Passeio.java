package ExercicioDoguinho;

import java.util.Scanner;

public class Passeio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PasseioDog pessoa = new PasseioDog();

        pessoa.nome = "";

        System.out.println("Informe o nome do dono: ");
        pessoa.nome = scan.nextLine();

        pessoa.cachorro = new Cachorro();

        System.out.println("Informe o nome do cachorro: ");
        pessoa.cachorro.nome = scan.nextLine();

        System.out.println("Informe a idade do cachorro: ");
        pessoa.cachorro.idade = scan.nextInt();

        System.out.println("Informe a raça do cachorro: ");
        scan.nextLine();
        pessoa.cachorro.raca = scan.nextLine();

        System.out.println("Informe o sexo do cachorro: ");
        pessoa.cachorro.sexo = scan.nextLine();
        System.out.println();

        CaminhadaDog passear = new CaminhadaDog();

        passear.andar(pessoa);

        scan.close();
    }
}
