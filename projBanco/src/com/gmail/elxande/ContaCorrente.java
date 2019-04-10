package com.gmail.elxande;

public class ContaCorrente extends Conta {
    private double cpmf=1;//Porcentagem do valor do cpmf
    private double quantiaSacada;
    //Construtor
    public ContaCorrente(int numero, String titular){
        super(numero, titular);
    }

    public double getQuantiaSacada() {
        return quantiaSacada;
    }

    @Override
    public void sacar(double quantia) {
        super.sacar(quantia);
        this.quantiaSacada = quantia;
        calculaCPMF();
        descontaCPMF();
    }

    //Métodos
    public double calculaCPMF(){
        return getQuantiaSacada()*(cpmf/100);
    }
    public void descontaCPMF(){
        super.setSaldo(super.getSaldo() - calculaCPMF());
    }
    public String extrato(){

        return toString()+
                "\nCPMF: "+getCpmf();
    }

    public double getCpmf() {
        return cpmf;
    }

    public void setCpmf(double cpmf) {
        this.cpmf = cpmf;
    }
}
