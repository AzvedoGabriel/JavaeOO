package Arrays;

public class Carro {
    String fabricante;
    public String modelo;
    String cor;
    public int anoDeFabricacao;


   public void LigarCarro() {
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}

