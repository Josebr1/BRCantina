package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Usuario;

import java.util.List;

public interface IUserController {
    boolean primeiroAdm();
    void cadastrar(Usuario usuario);
    List<Usuario> all();
}
