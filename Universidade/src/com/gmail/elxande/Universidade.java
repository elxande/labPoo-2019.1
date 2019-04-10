package com.gmail.elxande;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidade implements Menu {
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private String nome;
    private String endereco;

    //Construtor
    public Universidade(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public boolean adcionarFuncionario(Funcionario f){
        this.funcionarios.add(f);
        return true;
    }

    public boolean removerFuncionario(int matricula){
        for(int i=0; i<funcionarios.size(); i++){
            if(funcionarios.get(i).getMatricula() == matricula){
                funcionarios.remove(i);
                return true;
            }
        }
        return false;
    }

    public void imprimirDadosFuncionarios(){
        System.out.println("Dados dos Funcionarios!\n");
        for (Funcionario f : this.funcionarios){
            System.out.println(f.toString());
        }
    }

    public int getQuantidadeFuncionarios(){
        return funcionarios.size();
    }

    @Override
    public void exibirMenu() {
        System.out.println("--- Opções ---");
        System.out.println("\n1. Adicionar Funcionário!"+
                            "\n2. Remover Funcionário!"+
                            "\n3. Imprimir Dados!"+
                            "\n4. Quantidade de Funcionários!"+
                            "\n5. Sair!");
    }

    @Override
    public String lerEntrada() {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        return entrada;
    }
}
