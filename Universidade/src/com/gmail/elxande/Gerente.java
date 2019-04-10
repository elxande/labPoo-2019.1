package com.gmail.elxande;

public class Gerente extends Funcionario {
    private double comissao;

    //Construtores
    public Gerente(){

    }
    public Gerente(int matricula, String nome, int idade, double salario,double comissao){
        super(matricula, nome, idade, salario);
        this.comissao = comissao;
    }

    //Métodos
    public double getSalario(){
        return getSalarioBase()+getComissao();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString(){
        return super.toString()+"\nSalário Final: "+getSalario()+"\nComissão: "+getComissao()+"\n";
    }
}
