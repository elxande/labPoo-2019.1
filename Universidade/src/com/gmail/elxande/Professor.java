package com.gmail.elxande;

public class Professor extends Funcionario {
    private int numHoras;

    //Construtores
    public Professor(){

    }
    public Professor(int matricula, String nome, int idade, double salario, int numHoras){
        super(matricula, nome, idade, salario);
        this.numHoras = numHoras;
    }

    //Métodos
    public double getSalario(){
        return getSalarioBase()+(100*getNumHoras());
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public String toString(){
        return super.toString()+"\nSalário Final: "+getSalario()+"\nHoras: "+getNumHoras()+"\n";
    }
}
