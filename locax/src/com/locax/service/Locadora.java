package com.locax.service;

import com.locax.model.Pessoa;
import com.locax.model.Veiculo;
import com.locax.repository.Cadastro;
import com.locax.repository.PessoaRepository;
import com.locax.repository.VeiculoRepository;

public class Locadora implements Cadastro {
    public Locadora(PessoaRepository veiculoRepository) {
    }

    public Locadora(VeiculoRepository veiculoRepository) {
    }

    /*private final PessoaRepository pessoaRepository;

    public Locadora (VeiculoRepository veiculoRepository) {
        return veiculoRepository;
    }

     */

   /* public PessoaRepository getPessoaRepository() {
        return pessoaRepository;
    }

    */

    /*public VeiculoRepository getVeiculoRepository() {
        return veiculoRepository;
    }

    public void setPessoaRepository(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public void setVeiculoRepository (VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

     */

    @Override
    public boolean adicionarPessoa (Pessoa pessoa) {
        return false; //TODO: adicionar condicional se a pessoa já existir (?)
    }

    @Override
    public boolean adicionarVeiculo (Veiculo veiculo) {
        /*String nomeVeiculo = veiculo.getNomeVeiculo();
        if (buscarVeiculo(nomeVeiculo)) == null){
            VeiculoRepository.adicionarVeiculo(veiculo);
            return true;
        }

         */
        return false; //TODO Resolver buscar veículo
    }

    private boolean buscarVeiculo(String nomeVeiculo) { //TODO Preciso disso aqui?
        return false;
    }

    @Override
    public boolean alterarPessoa (Pessoa pessoa) {
        return false; //TODO: adicionar condicional se a pessoa já existir (?)
    }

    @Override
    public boolean alterarVeiculo (Veiculo veiculo) {
        return false;
    }
    @Override
    public boolean removerPessoa (Pessoa pessoa) {
        return false;
    }

    @Override
    public boolean removerVeiculo (Veiculo veiculo) {
        return false;
    }



}

