package com.locax.repository;

import com.locax.model.Carro;
import com.locax.model.Veiculo;
import java.util.*;

public class VeiculoRepository {

    private final List<Veiculo> veiculoList;
    private final List<Carro> carroList;

    public VeiculoRepository(List<Veiculo> veiculoList, List<Carro> carroList) {
        this.veiculoList = new ArrayList<>();
        this.carroList = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculoList.add(veiculo);
        if (veiculo instanceof Carro) {
            this.carroList.add((Carro) veiculo);
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculoList.remove(veiculo);
        if (veiculo instanceof Carro) {
            this.carroList.remove((Carro) veiculo);
        }
    }

    public List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>(carroList);
        carros.sort(Comparator.comparing(Carro::getNomeVeiculo));
        return Collections.unmodifiableList(carros);
    }

    public Veiculo buscarVeiculo(String nomeVeiculo) {
        for (Veiculo veiculo : veiculoList) {
            if (veiculo.getNomeVeiculo().equalsIgnoreCase(nomeVeiculo) || veiculo.getModelo().equalsIgnoreCase(nomeVeiculo)) {
                return veiculo;
            }
        }

        return null;
    }

    public boolean alterarVeiculo(Veiculo veiculo){
        veiculo.setNomeVeiculo(veiculo.getNomeVeiculo());
        veiculo.setModelo(veiculo.getModelo());
        veiculo.setPlaca(veiculo.getPlaca());
        veiculo.setTipo(veiculo.getTipo());
        veiculo.setEstaDisponivelParaLocacao(veiculo.estadisponivelParaLocacao());
        return true;
        //if?
    }

    //public boolean ?

}





