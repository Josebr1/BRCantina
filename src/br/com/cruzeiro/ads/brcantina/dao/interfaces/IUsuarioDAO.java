package br.com.cruzeiro.ads.brcantina.dao.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Usuario;
import java.sql.SQLException;
import java.util.List;

public interface IUsuarioDAO extends IGenericDAO<Usuario>{
    boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    List<Usuario> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
    Usuario getUserByEmail(String email) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException;
}
