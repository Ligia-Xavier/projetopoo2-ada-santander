package com.locax.model;

import java.math.BigDecimal;

public abstract class Veiculo {

    private String nomeVeiculo;
    private String modelo;
    private String placa;
    private String tipo;
    private BigDecimal valorBaseDiaria;

    private boolean estaDisponivelParaLocacao;

    public Veiculo (String nomeVeiculo, String modelo, String placa, String tipo, BigDecimal valorBaseDiaria, boolean estaDisponivelParaLocacao){

        this.nomeVeiculo = nomeVeiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.tipo = tipo;
        this.valorBaseDiaria = valorBaseDiaria;
        this.estaDisponivelParaLocacao = estaDisponivelParaLocacao;
    }
    public String getNomeVeiculo(){
        return nomeVeiculo;
    }
    public void setNomeVeiculo(String nomeVeiculo){
        this.nomeVeiculo = nomeVeiculo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getPlaca (){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa =placa;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public BigDecimal getValorBaseDiaria (){
        return valorBaseDiaria;
    }
    public void setValorBaseDiaria(BigDecimal valorBaseDiaria){
        this.valorBaseDiaria = valorBaseDiaria;
    }
    public boolean estadisponivelParaLocacao(){
        return estaDisponivelParaLocacao;
    }
    public void setEstaDisponivelParaLocacao(boolean disponivelParaLocacao ){
        estaDisponivelParaLocacao = disponivelParaLocacao;
    }

}

