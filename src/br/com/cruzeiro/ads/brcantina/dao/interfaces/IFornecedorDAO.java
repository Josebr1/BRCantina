package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Fornecedor;

import java.sql.SQLException;
import java.util.List;

public interface IFornecedorDAO {
    Fornecedor insert(Fornecedor f) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Fornecedor update(Fornecedor f) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Fornecedor getById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<Fornecedor> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
