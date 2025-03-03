package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.FormasPagamento;

import java.sql.SQLException;
import java.util.List;

public interface IFormasPagamentoDAO extends IGenericDAO<FormasPagamento> {
    List<FormasPagamento> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void deleteByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    FormasPagamento getByDescription(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
