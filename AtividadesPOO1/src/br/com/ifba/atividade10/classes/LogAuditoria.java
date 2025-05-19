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

public class LogAuditoria {
    private Long id; // O número de identificação desse log
    private Usuario usuario; // Quem fez a ação (tá linkado com a classe Usuario)
    private String acao; // O que o usuário fez (ex: "tentativa de login", "alteração de senha")
    private LocalDateTime dataHora; // Quando aconteceu
    private String ip; // De qual computador/internet veio a ação

    // Construtor: pra criar um novo registro de LogAuditoria
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }

    // Getters pra pegar as informações do log
    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getAcao() {
        return acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getIp() {
        return ip;
    }

    // Setters pra (se precisar) mudar alguma informação do log
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    // Pra mostrar as infos do LogAuditoria de um jeito fácil
    @Override
    public String toString() {
        return "LogAuditoria{" +
               "id=" + id +
               ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") + // Mostra o nome do usuário, se tiver
               ", acao='" + acao + '\'' +
               ", dataHora=" + dataHora +
               ", ip='" + ip + '\'' +
               '}';
    }
}
