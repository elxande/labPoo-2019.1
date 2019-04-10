package com.company;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class TesteConta {
    //Testes

    @Test
    public void testeSetTitular(){
        Conta c1 = new Conta();
        c1.setTitular("ana");
        Assert.assertEquals( c1.getTitular(), "ana");
    }

    @Test
    public void testeToString(){
        Conta c2 = new Conta();
        Assert.assertEquals("Conta: 0; Titular: Sem nome; Saldo: R$ 0.0", c2.toString());
    }
}
