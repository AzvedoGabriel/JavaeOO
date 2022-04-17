package calculoIMC;

public class PacienteCalculoIMC {
    double peso;
    double altura;

    double calcularIMC() {
        double imc = peso / (altura * altura);

        return imc;
    }
}
