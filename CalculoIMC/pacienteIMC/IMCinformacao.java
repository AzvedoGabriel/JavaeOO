package pacienteIMC;

import pacienteIMC.IMC;

public class IMCinformacao {
    double peso;
    double altura;

    IMC calcularIndice() {
        IMC imc = new IMC();
        double indice = peso / (altura * altura);
        imc.indice = indice;

        if (indice < 18.5) {
            imc.abaixodoPeso = true;
        } else if (indice < 25) {
            imc.pesoIdeal = true;
        } else {
            imc.obeso = true;

            if(indice < 35) {
                imc.GrauObesidade = "Acima do Peso";
            } else if (indice < 35) {
                imc.GrauObesidade = "I";
            } else if (indice < 35) {
                imc.GrauObesidade = "II";
            } else {
                imc.GrauObesidade = "III";
            }
        }
        return imc;
    }
}
