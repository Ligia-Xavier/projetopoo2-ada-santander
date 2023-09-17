package com.locax.model;

import java.math.BigDecimal;

public class Carro extends Veiculo{

    public Carro(String nomeVeiculo, String modelo, String placa, String tipo, BigDecimal valorBaseDiaria, boolean disponivelParaLocacao) {
        super(nomeVeiculo, modelo, placa, tipo, valorBaseDiaria, disponivelParaLocacao);

    }
    @Override
    public String toString(){
        return "Carro{" + "Nome:  " + getNomeVeiculo() + "\nModelo: " + getModelo() + "\nPlaca: " + getPlaca() + "\nTipo: " + getTipo() + "Valor da diária: " + getValorBaseDiaria() + "Está disponível para locação?" + estadisponivelParaLocacao() + "}";
    }
}
