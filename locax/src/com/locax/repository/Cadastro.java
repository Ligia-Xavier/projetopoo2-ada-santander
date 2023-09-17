package com.locax.repository;

import com.locax.model.Pessoa;
import com.locax.model.Veiculo;

public interface Cadastro {


    boolean adicionarPessoa (Pessoa pessoa);

    boolean adicionarVeiculo (Veiculo veiculo);

    boolean alterarPessoa (Pessoa pessoa);

    boolean alterarVeiculo (Veiculo veiculo);


    boolean removerPessoa (Pessoa pessoa);

    boolean removerVeiculo (Veiculo veiculo);


}
