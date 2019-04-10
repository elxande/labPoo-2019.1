package com.gmail.elxande;

public class Main {

    public static void main(String[] args) {
	Universidade federal = new Universidade("UFCG", "Avenida Camoina");

	federal.adcionarFuncionario(new Gerente(10,"Alexandre", 25, 480, 1200));
	federal.adcionarFuncionario(new Professor(11, "Ruan", 30, 480, 12));
	federal.adcionarFuncionario(new Professor(22, "Cesar", 40, 480, 14));
	federal.adcionarFuncionario(new Professor(33, "Henrique", 35, 480, 13));
	System.out.println("Quantidade de Funcionário: "+federal.getQuantidadeFuncionarios()+"\n");
	federal.imprimirDadosFuncionarios();
	System.out.println("==================================");
	federal.removerFuncionario(33);
	System.out.println("Quantidade de Funcionário: "+federal.getQuantidadeFuncionarios()+"\n");
	federal.imprimirDadosFuncionarios();
    }
}
