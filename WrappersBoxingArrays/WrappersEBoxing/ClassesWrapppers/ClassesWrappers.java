package WrappersEBoxing.ClassesWrapppers;

public class ClassesWrappers {
    
    public static void main(String[] args) {
        // byte, short, int,    long,  float, double e char
        // Byte, Short, Integer, Long, Float, Double e Character


        int x = 5;

        //Associação de objeto
         Integer i = Integer.valueOf(5);

        byte y = i.byteValue();
        //xxxValue();

        String valor = "15.5";

        Float valor1 = Float.valueOf(valor);


        System.out.println(valor1 + 3);

        int idade = Integer.parseInt("27"); //parseXXX

        System.out.println(idade + 1);

        double custo = Double.parseDouble("35");
        System.out.println("Custo total: " + custo );
    }
}

