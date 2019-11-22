package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Categoria;

import java.util.List;

public interface ICategoriaController {

    void insertAndUpdate(Categoria categoria);
    List<Categoria> all();
    Categoria getByDescription(String s);
    void delete(String s);
}
