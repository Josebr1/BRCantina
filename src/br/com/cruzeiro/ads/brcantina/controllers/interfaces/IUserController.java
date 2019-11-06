package br.com.cruzeiro.ads.brcantina.controllers.interfaces;

import br.com.cruzeiro.ads.brcantina.models.Usuario;

public interface IUserController {
    boolean primeiroAdm();
    void cadastrar(Usuario usuario);
}
