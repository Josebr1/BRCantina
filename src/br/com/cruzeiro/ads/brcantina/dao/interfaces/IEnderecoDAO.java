package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Endereco;
import java.sql.SQLException;

public interface IEnderecoDAO {
    Endereco insert(Endereco endereco) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Endereco update(Endereco endereco) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Endereco getById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
