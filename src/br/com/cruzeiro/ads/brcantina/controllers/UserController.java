package br.com.cruzeiro.ads.brcantina.controllers;

import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IUserController;
import br.com.cruzeiro.ads.brcantina.dao.UsuarioDAO;
import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;
import br.com.cruzeiro.ads.brcantina.models.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController implements IUserController{

    private IUsuarioDAO mUsuarioDAO;
    
    public UserController(){
        this.mUsuarioDAO = new UsuarioDAO();
    }
    
    @Override
    public boolean primeiroAdm() {
        try {
            return this.mUsuarioDAO.isFirstUserCreate();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void cadastrar(Usuario usuario) {
        try {
            this.mUsuarioDAO.insert(usuario);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Usuario> all() {
        try {
            return this.mUsuarioDAO.all();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

}
