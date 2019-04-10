package com.gmail.elxande;

public class Gerente extends Funcionario {
    //Atributos
    private double comissao;

    //Construtores
    public Gerente(){
        super();
        this.setComissao(5);
    }

    public Gerente (int matrícula, String nome, int idade, double salárioBase, double comissao){
        super(matrícula, nome, salárioBase, idade);
        this.setComissao(comissao);
    }

    public void setComissao(double comissao){

        this.comissao = comissao;
    }

    @Override
    public double getSalário(){
        return super.getSalário() + getComissao();
    }

    public double getComissao() {
        return this.comissao;
    }

    @Override
    public String toString(){
        return super.toString() + ", Comissão: " + getComissao();
    }
}
