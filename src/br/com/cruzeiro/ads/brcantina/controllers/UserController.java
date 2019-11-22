package br.com.cruzeiro.ads.brcantina.controllers;

import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IUserController;
import br.com.cruzeiro.ads.brcantina.dao.UsuarioDAO;
import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;
import br.com.cruzeiro.ads.brcantina.models.Usuario;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController implements IUserController {

    private IUsuarioDAO mUsuarioDAO;

    public UserController() {
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
    public void insertAndUpdate(Usuario usuario) {
        try {
            if (usuario.getIdUsuario() != null) this.mUsuarioDAO.update(usuario);
            else this.mUsuarioDAO.insert(usuario);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

    @Override
    public Usuario getUserByEmail(String email) {
        try {
            return this.mUsuarioDAO.getUserByEmail(email);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
