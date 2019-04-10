package com.gmail.elxande;

public abstract class Funcionario {
    //Atributos
    private int matricula;
    private String nome;
    private int idade;
    private double salarioBase;

    //Construtores
    public Funcionario(){

    }
    public Funcionario(int matricula, String nome, int idade, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salario;
    }

    //Métodos

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String toString(){
        return "Matrícula: "+getMatricula()+
                "\nNome: "+getNome()+
                "\nIdade: "+getIdade()+
                "\nSalário Base: "+getSalarioBase();
    }
}
