package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import java.util.List;

public interface IGenericDAO<T> {
    void insertAndUpdate(T model);
    List<T> all();
}
