package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Endereco;

public interface IEnderecoController {
    void insertAndUpdate(Endereco e);
    Endereco getById(int id);
}
