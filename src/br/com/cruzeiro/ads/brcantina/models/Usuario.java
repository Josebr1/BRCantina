package br.com.cruzeiro.ads.brcantina.models;

import br.com.cruzeiro.ads.brcantina.annotations.Email;
import br.com.cruzeiro.ads.brcantina.annotations.Password;
import br.com.cruzeiro.ads.brcantina.annotations.Required;
import br.com.cruzeiro.ads.brcantina.models.enums.TipoUsuario;
import br.com.cruzeiro.ads.brcantina.utils.PasswordUtils;
import java.util.UUID;

public class Usuario{
    
    private UUID idUsuario;
    @Required
    private String nome;
    @Email
    private String email;
    @Required
    private String fone;
    @Required
    private boolean temAcessoAoSistema;
    @Required
    private String login;
    @Required
    @Password
    private String senha;
    @Required
    private boolean ativo;
    @Required
    private TipoUsuario tipoUsuario;

    public Usuario(){}

    public Usuario(String nome, String email, String login, boolean ativo, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
    }

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

    public String getFone() {
        return fone.replace("-", "").replace("(", "").replace(")", "");
    }

    public void setFone(String fone) {
        this.fone = fone;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", temAcessoAoSistema=" + temAcessoAoSistema +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", ativo=" + ativo +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }
}
