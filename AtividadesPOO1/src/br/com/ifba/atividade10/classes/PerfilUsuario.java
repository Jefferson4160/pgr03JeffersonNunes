/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jefferson S
 */
import java.util.List;

public class PerfilUsuario {
    private Long id; // Identificador único desse perfil, tipo um RG
    private String descricao; // Pra saber qual é a função desse perfil (ex: "Administrador", "Usuário Comum")
    private List<String> permissoes; // Uma lista das coisas que esse perfil pode fazer no sistema

    // Construtor: é tipo quando a gente cria um novo PerfilUsuario
    // A gente precisa dizer o ID, a descrição e quais as permissões
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    // Métodos pra pegar o valor dos atributos (tipo "me diz qual é o ID?")
    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    // Métodos pra mudar o valor dos atributos (tipo "agora o ID vai ser outro!")
    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    // Esse aqui serve pra quando a gente quiser mostrar o objeto PerfilUsuario de um jeito fácil de ler
    @Override
    public String toString() {
        return "PerfilUsuario{" +
               "id=" + id +
               ", descricao='" + descricao + '\'' +
               ", permissoes=" + permissoes +
               '}';
    }
}
