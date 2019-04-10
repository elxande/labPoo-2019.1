package com.gmail.elxande;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoLivros {
    private ArrayList<Livro> livros = new ArrayList();
    Scanner sc = new Scanner(System.in);
//    private String nome, autor;
//    private int id;

    //metodos
    public void catalogar(String nome, String autor, int id){
//        System.out.print("Nome do Livro: ");
//        nome = sc.nextLine();
//        System.out.print("Nome do Autoro: ");
//        autor = sc.nextLine();
//        System.out.print("ID do Livro: ");
//        id = sc.nextInt();
        livros.add(new Livro(nome, autor, id));
    }

    public void remover(int id){
        int tamanho;
        tamanho = livros.size();

        for(int i=0; i<tamanho; i++){
            if(id == livros.get(i).getId()){
                livros.remove(i);
                break;
            }
        }
    }

    public void buscarLivro(int id){
        int tamanho;
        tamanho = livros.size();

        for(int i=0; i<tamanho; i++){
            if(id == livros.get(i).getId()){
                System.out.println("Livro: " + livros.get(i).exibirLivro());
            }
        }
    }

    public void exibirCatalogo(){
        int tamanho;
        tamanho = livros.size();

        for(int i=0; i<tamanho; i++){
            if(tamanho > 0){
                System.out.println(livros.get(i).exibirLivro());
                System.out.println("--------------------------------------");
            }
            else{
                System.out.println("Catalogo vazio!");
            }
        }
    }

}