package AulaMetodos;

public class FolhaPagamento {
    double calcularSalario(int horasNormais, int horasExtras, double ValorhoraNormais, double ValorhoraEextras) {

        double valorHoraN = horasNormais * ValorhoraNormais;
        double valorHoraE = horasExtras * ValorhoraEextras;

        return valorHoraN + valorHoraE;
    }
}
