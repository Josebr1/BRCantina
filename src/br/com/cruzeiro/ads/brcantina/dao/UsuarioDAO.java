package br.com.cruzeiro.ads.brcantina.dao;

import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;
import br.com.cruzeiro.ads.brcantina.models.enums.TipoUsuario;
import br.com.cruzeiro.ads.brcantina.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements IUsuarioDAO{

    private Connection mConnection = null;
    
    @Override
    public boolean isFirstUserCreate() {
        ResultSet resultSet;
        
        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM usuario WHERE usuario.fk_tipo_usuario = ?";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, TipoUsuario.get(TipoUsuario.ADMINISTRADOR));
            
            resultSet = statement.executeQuery();
            return !resultSet.next();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
