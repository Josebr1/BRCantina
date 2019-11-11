package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Usuario;
import java.sql.SQLException;
import java.util.List;

public interface IUsuarioDAO {
    boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<Usuario> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    void insert(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
