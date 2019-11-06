package br.com.cruzeiro.ads.brcantina.models;

import br.com.cruzeiro.ads.brcantina.models.enums.TipoUsuario;
import br.com.cruzeiro.ads.brcantina.utils.PasswordUtils;
import java.util.UUID;

public class Usuario {
    
    private UUID idUsuario;
    private String nome;
    private String email;
    private boolean temAcessoAoSistema;
    private String login;
    private String senha;
    private boolean ativo;
    private TipoUsuario tipoUsuario;

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTemAcessoAoSistema() {
        return temAcessoAoSistema;
    }

    public void setTemAcessoAoSistema(boolean temAcessoAoSistema) {
        this.temAcessoAoSistema = temAcessoAoSistema;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return PasswordUtils.generateSecurePassword(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
