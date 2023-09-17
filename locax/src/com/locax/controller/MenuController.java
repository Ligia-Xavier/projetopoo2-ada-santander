package com.locax.controller;

import java.util.Scanner;

public class MenuController {
    Scanner scan = new Scanner(System.in);

    public void exibirMenuPrincial() {
        System.out.println("\n====== Bem-vinde à LOCA-X! =======");
        System.out.println("A única locadora de automóveis onde");
        System.out.println("você pode alugar um carro ou por");
        System.out.println("seu carro para alugar e ganhar $$!");
        System.out.println("===================================");
        System.out.println("Escolha uma opção do menu abaixo:");
        System.out.println("1. Alugar veículo");
        System.out.println("2. Devolver veículo");
        System.out.println("3. Por meu carro para aluguel");
        System.out.println("4. Sair");

    }


    public void exibirMenuEscolha() {
        Scanner scan = new Scanner(System.in);
        int escolhaMenuPrincipal = scan.nextInt();
        scan.nextLine();

        switch (escolhaMenuPrincipal) {
            case 1 -> {
                System.out.println("\n=============================");
                System.out.println("Escolha uma opção do menu abaixo:");
                System.out.println("1. Listar Veículos disponíveis");
                System.out.println("2. Buscar veículo pelo nome");
                System.out.println("3. Voltar");

            }
            case 2 -> {
                //TODO Listar Veículos alugados
                System.out.println("\n\nInsira a placa do veículo a ser devolvido:");

            }

            case 3 -> {
                System.out.println("\n\nVocê deseja:");
                System.out.println("1. Cadastrar Veículo");
                System.out.println("2. Alterar Cadastro");
                System.out.println("3. Voltar");

            }
            case 4 -> System.out.println("Saindo do sistema.... \nAgradecemos sua preferência. :)");

            default -> System.out.println("Opção inválida. Saindo do sistema.... \nAgradecemos sua preferência. :)");
        }
        // scan.close();
    }

    public void exibirMenuAlugar() {
        Scanner scan = new Scanner(System.in);
        int escolhaMenuAlugar = scan.nextInt();
        scan.nextLine();


    }
}
