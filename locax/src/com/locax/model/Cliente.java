package com.locax.model;

public class Cliente implements Pessoa{

    private String nome;
    private String Id;
    private String tipoId;


    public Cliente (String nome, String Id, String tipoId){
        this.nome = nome;
        this.Id = Id;
        this.tipoId = tipoId;

    }

    @Override
    public void cadastrarCliente() {

    }
    @Override
    public void cadastrarVeiculo() {

    }
    @Override
    public void alugarVeiculo() {

    }



    @Override
    public void devolverVeiculo() {

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public String getTipoId() {
        return tipoId;
    }
    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nId: " + Id + "\nTipo de Id: " + tipoId;
    }
}
