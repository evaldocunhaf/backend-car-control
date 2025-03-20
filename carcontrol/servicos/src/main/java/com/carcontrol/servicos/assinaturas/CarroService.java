package com.carcontrol.servicos.assinaturas;

import java.util.List;

import com.carcontrol.persistencia.entidades.Carro;

public interface CarroService {

    public Carro buscarCarroPorPlaca(String placa);
    public List<Carro> buscarCarroPorUsuario(String username);
    public List<Carro> buscarCarroPorCidade(String cidade);
    public List<Carro> buscarCarroPorModelo(String modelo);
    public List<Carro> buscarCarroPorEtapa(String etapa);

    public void inserirCarro(Carro carro);
    public void atualizarCarro(Carro carro);
    public void excluirCarro(Carro carro);

}
