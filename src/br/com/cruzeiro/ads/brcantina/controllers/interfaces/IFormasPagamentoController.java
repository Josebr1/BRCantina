package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.FormasPagamento;

import java.util.List;

public interface IFormasPagamentoController {
    void insertAndUpdate(FormasPagamento formasPagamento);
    List<FormasPagamento> all();
    void delete(String selectedValue);
    FormasPagamento getByDescription(String descricao);
}
