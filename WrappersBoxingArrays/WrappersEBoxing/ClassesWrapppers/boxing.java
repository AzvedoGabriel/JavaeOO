package WrappersEBoxing.ClassesWrapppers;

import java.util.Scanner;

public class boxing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // boxing
        Integer i = 0;

        // unboxing "Tirar do objeto para o tipo primitivo"
        int x = i;

        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;
                            // metodo de comparação entre variavel
        System.out.println(i1.equals(i2));

        System.out.println(i3 == i4);

        //char \u0000 a \ u007f
    }
}
