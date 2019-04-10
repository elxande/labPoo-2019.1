package com.gmail.elxande;

public class TestarCatalogo {
    public static void main( String[] args ){
        CatalogoLivros bibliotecaXande = new CatalogoLivros();

        bibliotecaXande.catalogar("Matemática", "Joamir", 9);
        bibliotecaXande.catalogar("Bananão", "Alexandre", 12);
        bibliotecaXande.catalogar("Arduino", "Arden", 24);


        bibliotecaXande.exibirCatalogo();
        System.out.println("================================================");
        bibliotecaXande.buscarLivro(12);
        bibliotecaXande.remover(12);
        System.out.println("================================================");
        bibliotecaXande.exibirCatalogo();
    }
}
