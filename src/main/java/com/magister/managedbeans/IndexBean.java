package com.magister.managedbeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fernando
 */
@ManagedBean
@SessionScoped
public class IndexBean implements Serializable {

    private String nome;
    private String email;
    private String mensagem;

    public IndexBean() {
        System.out.println("Construtor!");
    }

    public String salvar() {
        System.out.println("Método salvar...");
        mensagem = "Olá " + nome + ", seu email é: " + email;
        System.out.println(mensagem);
        return "hello?faces-redirect=true";
    }

    public String goToIndex() {
        System.out.println("goToIndex()");
        return "index?faces-redirect=true";
    }

    public String getNome() {
        System.out.println("getNome();");
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("setNome();");
        this.nome = nome;
    }

    public String getEmail() {
        System.out.println("getEmail();");
        return email;
    }

    public void setEmail(String email) {
        System.out.println("setEmail();");
        this.email = email;
    }

    public String getMensagem() {
        System.out.println("getMensagem();");
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        System.out.println("setMensagem();");
        this.mensagem = mensagem;
    }

}
