package com.gmail.elxande;

public abstract class Conta {
    //Atributos
    private int numero;
    private String titular;
    private double saldo;

    //Construtores
    public Conta(){

    }

    public Conta(int num, String tit){
        this.numero = num;
        this.titular = tit;
        this.saldo = 0;
    }

    //Métodos
    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumero(int numero){
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void sacar(double quantia){
        if(quantia <= saldo && quantia > 0){
            this.saldo = saldo - quantia;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double quantia){
        if(quantia > 0){
            this.saldo = saldo + quantia;
        }
        else{
            System.out.println("Valor não permitido!");
        }
    }

    public String toString(){
        return "Titular: "+titular+ "\nNúmero: "+numero+ "\nSaldo: "+saldo;
    }

}
