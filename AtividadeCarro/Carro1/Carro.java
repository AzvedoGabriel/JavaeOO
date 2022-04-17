package Carro1;

import Carro2.Proprietario;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;

    Proprietario dono;

    void LigarCarro() {

        System.out.println("Ligando o carro: " + modelo);

    }
}
