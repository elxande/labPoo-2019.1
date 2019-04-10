package com.company;

public class Calculadora {
    //Atributos
    private String nome;
    private int modelo;

    //Construtor
    Calculadora(String nome, int modelo){
        this.nome = nome;
        this.modelo = modelo;
    }

    //Métodos getters e setters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    //Métodos

    public double soma(double num1, double num2){
        return num1+num2;
    }

    public double subtracao(double num1, double num2){
        return num1-num2;
    }

    public double divisao(double num1, double num2){
        return num1/num2;
    }

    public double multiplicacao(double num1, double num2){
        return num1*num2;
    }

}
