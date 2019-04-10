package com.company;

public class Conta
{
    // área de atributos
    private int    número;
    private String titular;
    private double saldo;

    // construtores
    public Conta(){
        setNúmero( 0 );
        setTitular( "Sem nome" );
        setSaldo( 0 );
    }

    public Conta( int n, String tit, double s ){
        setNúmero( n );
        setTitular( tit );
        // setSaldo( s );
    }

    // área de métodos (get/set == métodos de acesso)
    public void setNúmero( int umNúmero ){
        if ( umNúmero > 0 )
            número = umNúmero;
    }

    public int getNúmero() {  return número;  }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular( String titular )
    {
        this.titular = titular;
    }

    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double valor){
        this.saldo = saldo+valor;
    }

    public String toString(){
        return "Conta: " + getNúmero() + "; " + "Titular: " + getTitular() + "; " + "Saldo: R$ " + getSaldo();
    }

}
