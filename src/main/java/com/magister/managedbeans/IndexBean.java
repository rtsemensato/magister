package com.magister.managedbeans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author fernando
 */
@ManagedBean
@ApplicationScoped
public class IndexBean implements Serializable {

    private String nome;
    private String email;
    private String mensagem;
    
    @PostConstruct
    public void init() {
        nome = "";
        email = "";
        mensagem = "";
    }
    
    public String salvar() {
        mensagem = "Olá " + nome + ", seu email é: " + email;
        System.out.println(mensagem);
        return "hello.xhtml?faces-redirect=true";
    }

    public String goToIndex() {
        return "index.xhtml?faces-redirect=true";
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
