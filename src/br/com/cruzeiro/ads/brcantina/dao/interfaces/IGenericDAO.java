package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Categoria;

import java.sql.SQLException;
import java.util.List;

public interface IGenericDAO<T> {
    void insert(T model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void update(T model) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<T> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
