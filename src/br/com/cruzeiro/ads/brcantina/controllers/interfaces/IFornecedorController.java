/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Fornecedor;

import java.util.List;

/**
 *
 * @author antonio
 */
public interface IFornecedorController {
    void insertAndUpdate(Fornecedor f);
    List<Fornecedor> all();
    Fornecedor getById(int id);
}
