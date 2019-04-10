package com.company;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Calculadora cal = new Calculadora("Ling Ling", 2019);

    private int numero;
    double n1, n2;

    public void exibirMenu(){
        System.out.println("CALCULDORA\n==============================");
        System.out.println("1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR\n5 - SAIR");
        System.out.print("Digite sua opção: ");
        numero = sc.nextInt();

        if (getNumero() == 1){
            System.out.print("Digite n1: ");
            n1 = sc.nextDouble();
            System.out.print("Digite n2: ");
            n2 = sc.nextDouble();
            System.out.println(cal.soma(n1,n2));
        }
        else if (getNumero() == 2){
            System.out.print("Digite n1: ");
            n1 = sc.nextDouble();
            System.out.print("Digite n2: ");
            n2 = sc.nextDouble();
            System.out.println(cal.subtracao(n1,n2));
        }
        else if (getNumero() == 3){
            System.out.print("Digite n1: ");
            n1 = sc.nextDouble();
            System.out.print("Digite n2: ");
            n2 = sc.nextDouble();
            System.out.println(cal.multiplicacao(n1,n2));
        }
        else if (getNumero() == 4){
            System.out.print("Digite n1: ");
            n1 = sc.nextDouble();
            System.out.print("Digite n2: ");
            n2 = sc.nextDouble();
            System.out.println(cal.divisao(n1,n2));
        }
        else if (getNumero() == 5){
            System.out.print("SAIU!");
//            n1 = sc.nextDouble();
//            System.out.print("Digite n2: ");
//            n2 = sc.nextDouble();
//            System.out.println(cal.subtracao(n1,n2));
        }
        else{
            System.out.print("OPÇÃO INVÁLIDA!");
        }
    }

    //Método getter
    public int getNumero(){
        return numero;
    }
}
