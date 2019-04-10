package com.gmail.elxande;

public class Livro {
    //atributos
    private String nome;
    private String autor;
//    private String editora;
//    private String tipo;
//    private int edicao;
    private int id;

    //construtores

    //com argumentos
    public Livro(String nome, String autor, int id){
        this.nome = nome;
        this.autor = autor;
        this.id = id;
    }

    //sem argumentos
    public Livro(){

    }

    //metodos
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String exibirLivro(){
        return "Nome: "+this.nome+ "\nAutor: "+this.autor+ "\nID: "+this.id;
    }

//    public String getEditora(){
//        return this.editora;
//    }
//    public void setEditora(String editora){
//        this.editora = editora;
//    }
//    public String getTipo(){
//        return this.tipo;
//    }
//    public void setTipo(String tipo){
//        this.tipo = tipo;
//    }
//    public int edicao(){
//        return this.edicao;
//    }
//    public void setEdicao(int edicao){
//        this.edicao = edicao;
//    }

}
