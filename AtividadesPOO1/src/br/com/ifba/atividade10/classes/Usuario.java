/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jefferson S
 */
import java.time.LocalDateTime;

public class Usuario {
    private Long id; // O RG do usuário no sistema
    private PerfilUsuario perfil; // Qual o "cargo" dele, quais as permissões (tá linkado com a classe PerfilUsuario)
    private String nomeUsuario; // O login que ele usa pra entrar
    private String senha; // A senha secreta dele
    private String email; // Pra contato e pra recuperar a senha, talvez
    private LocalDateTime ultimoLogin; // Pra saber a última vez que ele acessou
    private boolean ativo; // Se a conta dele tá valendo ou não

    // Construtor: quando a gente cria um novo Usuario, precisa dar essas infos básicas
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String senha, String email, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.ultimoLogin = null; // Por enquanto, ele nunca logou
    }

    // Getters: pra gente perguntar qual o ID, qual o perfil, etc.
    public Long getId() {
        return id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // Setters: pra gente poder mudar o ID, o perfil, etc. depois de criar o Usuario
    public void setId(Long id) {
        this.id = id;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Pra mostrar as infos do Usuario de um jeito mais legível
    @Override
    public String toString() {
        return "Usuario{" +
               "id=" + id +
               ", perfil=" + (perfil != null ? perfil.getDescricao() : "null") + // Se tiver perfil, mostra a descrição, senão mostra "null"
               ", nomeUsuario='" + nomeUsuario + '\'' +
               ", email='" + email + '\'' +
               ", ultimoLogin=" + ultimoLogin +
               ", ativo=" + ativo +
               '}';
    }

    
    // Quando o usuário tenta logar, a gente verifica a senha e atualiza a data do último login
    public void logar(String senha) {
        if (this.senha.equals(senha)) {
            this.ultimoLogin = LocalDateTime.now(); // Pega a hora e data de agora
            // Aqui a gente deveria criar um novo LogAuditoria pra registrar esse login
            System.out.println("Usuário " + this.nomeUsuario + " logou em " + this.ultimoLogin);
        } else {
            System.out.println("Senha incorreta para o usuário " + this.nomeUsuario);
        }
    }

    // Pra criar uma nova sessão pro usuário (tipo quando ele faz login e fica conectado)
    public Sessao criarSessao() {
        String token = gerarTokenUnico(); // Cria um código único pra essa sessão
        Sessao sessao = new Sessao(System.currentTimeMillis(), this, token); // Cria o objeto Sessao
        System.out.println("Sessão criada para o usuário " + this.nomeUsuario + ". Token: " + token);
        return sessao; // Devolve a sessão criada
    }

    // pra gerar aquele código único da sessão
    private String gerarTokenUnico() {
        // Isso aqui é um jeito meio padrão de gerar um código aleatório 
        return java.util.UUID.randomUUID().toString();
    }
}
