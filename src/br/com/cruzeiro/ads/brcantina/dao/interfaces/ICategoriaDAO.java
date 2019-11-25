package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Categoria;
import br.com.cruzeiro.ads.brcantina.models.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface ICategoriaDAO extends IGenericDAO<Categoria>{
    List<Categoria> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Categoria getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
