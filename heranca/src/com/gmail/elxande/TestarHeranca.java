package com.gmail.elxande;

import java.sql.SQLOutput;

public class TestarHeranca {

    public static void main( String[] args )
    {
        Professor p = new Professor(); // 900
        Professor p2 = new Professor(123, "ana", 1000, 40, 25);
        Gerente g = new Gerente(1212, "Xande", 25, 1000.00,300.00);

        System.out.println( p.toString() );
        System.out.println( p2.toString() );
        System.out.println( p.getSalário() );
        System.out.println( p2.getSalário() );
        System.out.println("==================");
        System.out.println( g.toString() );
    }
}
