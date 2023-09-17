package com.locax.controller;

import java.io.IOException;

public class Main {
    public static MenuController menuController = new MenuController();

    public static void main(String[] args) throws IOException {

        menuController.exibirMenuPrincial();
        menuController.exibirMenuEscolha();
        menuController.exibirMenuAlugar();



    }
}
