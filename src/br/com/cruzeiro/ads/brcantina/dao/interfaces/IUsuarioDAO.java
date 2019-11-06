package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Usuario;
import java.sql.SQLException;

public interface IUsuarioDAO {
    boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void insert(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
