package com.locax.repository;

import com.locax.model.Cliente;
import com.locax.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {

    private final List<Pessoa> pessoaList;
    private final List<Cliente> clienteList;

    public PessoaRepository(List<Pessoa> pessoaList, List<Cliente> clienteList) {
        this.pessoaList = new ArrayList<>();
        this.clienteList = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoaList.add(pessoa);
        if (pessoa instanceof Cliente) {
            this.clienteList.add((Cliente) pessoa);
        }
    }

    public void removerPessoa(Pessoa pessoa) {
        this.pessoaList.remove(pessoa);
        if (pessoa instanceof Cliente) {
            this.clienteList.remove((Cliente) pessoa);
        }
        //buscarpessoa?
    }
}