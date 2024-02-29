package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        System.out.println("Digite o número da sua conta: ");
        Scanner sc = new Scanner(System.in);
        conta.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite por favor o número da sua agência");
        conta.setAgencia(sc.nextLine());
        System.out.println("Digite por favor o seu nome completo");
        conta.setNomeCliente(sc.nextLine());
        System.out.println("O saldo inicial é de R$0,00");


        System.out.println(conta.toString());




        sc.close();
    }
}