package br.com.cruzeiro.ads.brcantina.models;

import br.com.cruzeiro.ads.brcantina.annotations.Required;
import org.h2.util.StringUtils;

public class Endereco {
    
    private int id;
    @Required
    private String cep;
    
    @Required
    private String logradouro;
    
    @Required
    private String bairro;
    
    @Required
    private String cidade;
    
    private String referencia;
    
    @Required
    private String numero;
    
    private String complemento;
    
    @Required
    private String uf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        if(!StringUtils.isNullOrEmpty(cep))
            return cep.replace("-", "");
        else
            return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
}
