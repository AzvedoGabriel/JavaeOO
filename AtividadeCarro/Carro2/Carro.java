package Carro2;


public class Carro {
    String fabricante;
    public String modelo;
    String cor;
    int anoDeFabricacao;

    public Proprietario dono;

   public void LigarCarro() {
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}

