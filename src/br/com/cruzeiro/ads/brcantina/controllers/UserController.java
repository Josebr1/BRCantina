package br.com.cruzeiro.ads.brcantina.controllers;

import br.com.cruzeiro.ads.brcantina.controllers.interfaces.IUserController;
import br.com.cruzeiro.ads.brcantina.dao.UsuarioDAO;
import br.com.cruzeiro.ads.brcantina.dao.interfaces.IUsuarioDAO;

public class UserController implements IUserController{

    private IUsuarioDAO mUsuarioDAO;
    
    public UserController(){
        this.mUsuarioDAO = new UsuarioDAO();
    }
    
    @Override
    public boolean primeiroAdm() {
        return this.mUsuarioDAO.isFirstUserCreate();
    }

    @Override
    public void cadastrarPrimeiroAdm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
