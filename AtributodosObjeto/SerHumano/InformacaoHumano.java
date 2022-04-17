package SerHumano;

import java.util.Scanner;

public class InformacaoHumano {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Humano humano = new Humano();

            humano.nome ="";
            humano.estado = "";
            humano.sexo = 'M';
            humano.sexo2 = 'F';
            humano.idade = 0;

            System.out.println("Informe o nome da pessoa: ");
            humano.nome = scan.nextLine();

            System.out.println("Informe o estado que ela mora: ");
            humano.estado = scan.nextLine();

            System.out.println("Informe a idade da pessoa: ");
            humano.idade = scan.nextInt();


            System.out.print("Sexo ( 1 Para 'M' ou 2 para 'F' ): ");
            humano.sexo = scan.nextShort() == 1 ? 'M' : 'F';

            System.out.println("A pessoa de nome: " + humano.nome + "" + " de idade: " + humano.idade +" anos" + "" +
                    " que mora no estado: " + humano.estado +
                    "" + " do sexo: " + humano.sexo);



            scan.close();
    }
}
