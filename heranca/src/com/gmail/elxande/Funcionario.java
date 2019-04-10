package com.gmail.elxande;

public class Funcionario extends Object {

    private int matrícula;
    private String nome;
    private double salárioBase;
    private int idade;

    public Funcionario()
    {
        this( 0, "--- sem nome ---", 900, 0 );
    }

    public Funcionario( int matrícula, String nome, double salárioBase, int idade )
    {
        setMatrícula( matrícula );
        setNome( nome );
        setSalário( salárioBase );
        setIdade( idade );
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getMatrícula()
    {
        return matrícula;
    }

    public void setMatrícula( int matrícula )
    {
        this.matrícula = matrícula;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public double getSalário()
    {
        return salárioBase;
    }

    public void setSalário( double salário )
    {
        this.salárioBase = salário;
    }

    @Override
    public String toString()
    {
        return
                "matrícula=" + getMatrícula() +
                        ", nome='" + getNome() + '\'' +
                        ", Idade = " +getIdade() +
                        ", salárioBase=" + getSalário();
    }
}
