package br.com.cruzeiro.ads.brcantina.dao;

import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;
import br.com.cruzeiro.ads.brcantina.models.Usuario;
import br.com.cruzeiro.ads.brcantina.models.enums.TipoUsuario;
import br.com.cruzeiro.ads.brcantina.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO implements IUsuarioDAO{

    private Connection mConnection = null;
    
    @Override
    public boolean isFirstUserCreate() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        ResultSet resultSet;
        
        try {
            mConnection = DBUtils.getConnection();
            String sql = "SELECT * FROM usuario WHERE usuario.fk_tipo_usuario = ?";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setInt(1, TipoUsuario.get(TipoUsuario.ADMINISTRADOR));
            
            resultSet = statement.executeQuery();
            return !resultSet.next();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public void insert(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        mConnection = DBUtils.getConnection();
        
        try {
            String sql = "INSERT INTO usuario(id_usuario, nome, email, tem_acesso_programa, login, senha, ativo, fk_tipo_usuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);
            statement.setObject(1, UUID.randomUUID());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getEmail());
            statement.setBoolean(4, usuario.isTemAcessoAoSistema());
            statement.setString(5, usuario.getLogin());
            statement.setString(6, usuario.getSenha());
            statement.setBoolean(7, usuario.isAtivo());
            statement.setInt(8, 1);
            
            statement.execute();
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }

    @Override
    public List<Usuario> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        ResultSet resultSet;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            mConnection = DBUtils.getConnection();
            String sql = "select * from usuario as user inner join tipo_usuario tp on tp.id_tipo_usuario = user.fk_tipo_usuario;";
            
            PreparedStatement statement = DBUtils.getPreparedStatement(mConnection, sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                   usuarios.add(new Usuario(
                           resultSet.getString("nome"),
                           resultSet.getString("email"),
                           resultSet.getString("login"),
                           resultSet.getBoolean("ativo"),
                           TipoUsuario.ADMINISTRADOR));
            }
            return usuarios;
        } finally {
            if (mConnection != null)
                mConnection.close();
        }
    }
    
}
