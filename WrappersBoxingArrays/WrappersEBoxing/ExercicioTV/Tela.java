package WrappersEBoxing.ExercicioTV;

public class Tela {

    Integer canal = 0;

    Integer volume = 0;

    void mudarCanal(Integer novocanal){
        if (canal.equals(novocanal)){
            System.out.println("Novo Canal é também o canal atual.");
        } else {
            canal = novocanal;
            System.out.println("Canal alterado para: " + canal);
        }

   }
    void mudarVolume (Integer novoVolume){
        if (novoVolume.equals(volume)){
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para: " + volume);
        }
    }
}
