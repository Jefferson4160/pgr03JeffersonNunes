/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jefferson S
 */
public class Sessao {
    private Long id; // Identificador da sessão
    private Usuario usuario; // Qual usuário tá nessa sessão (link com Usuario)
    private String token; // Uma "chave" única pra identificar essa sessão

    // Construtor: quando a gente cria uma nova Sessao
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    // Getters pra pegar as infos da sessão
    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    // Setters pra mudar alguma info da sessão (se precisar)
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // Pra mostrar as infos da Sessao de um jeito simples
    @Override
    public String toString() {
        return "Sessao{" +
               "id=" + id +
               ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") + // Mostra o nome do usuário
               ", token='" + token + '\'' +
               '}';
    }
}
