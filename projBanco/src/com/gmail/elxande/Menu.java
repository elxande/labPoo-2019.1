package com.gmail.elxande;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ContaCorrente c = new ContaCorrente(0012, "Alexandre");

    private int opcao;

    public void exibirMenu(){
        System.out.println("--- Projeto Conta Corrente ---");
        System.out.println("1. Saque"+
                "\n2. Deposito"+
                "\n3. Saldo na tela"+
                "\n4. Extrato na tela"+
                "\n5. Sair");
        System.out.println("---------------------------");
        System.out.print("Digite uma opção: ");
        opcao = sc.nextInt();
        while(opcao>0){
            if(opcao == 5){
                break;
            }
            else if(opcao == 1){
                double valor = sc.nextDouble();
                c.sacar(valor);
            }
            else if(opcao == 2){
                double valor = sc.nextDouble();
                c.depositar(valor);
            }
            else if(opcao == 3){
                System.out.println(c.getSaldo()+"\n");
            }
            else if(opcao == 4){
                System.out.println(c.extrato());
            }
            else if(opcao > 5){
                System.out.print("Opção inválida!");
            }
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
        }
    }

}
