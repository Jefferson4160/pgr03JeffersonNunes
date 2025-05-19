/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author Jefferson S
 */
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Vamos criar uns perfis de usuário pra testar
        List<String> permissoesAdmin = Arrays.asList("criar", "editar", "excluir", "listar"); // Permissões do admin
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permissoesAdmin); // Criando o perfil de admin

        List<String> permissoesBasico = Arrays.asList("listar", "visualizar"); // Permissões do usuário básico
        PerfilUsuario perfilBasico = new PerfilUsuario(2L, "Básico", permissoesBasico); // Criando o perfil básico

        System.out.println("Perfis criados:");
        System.out.println(perfilAdmin); // Mostrar o perfil de admin
        System.out.println(perfilBasico); // Mostrar o perfil básico
        System.out.println("--------------------");

        // Agora vamos criar os usuários e dizer qual perfil cada um tem
        Usuario usuarioAdmin = new Usuario(101L, perfilAdmin, "admin", "senha123", "admin@email.com", true); // Criando o usuário admin
        Usuario usuarioBasico = new Usuario(102L, perfilBasico, "usuario", "senha456", "usuario@email.com", true); // Criando o usuário básico

        System.out.println("\nUsuários criados:");
        System.out.println(usuarioAdmin); // Mostrar o usuário admin
        System.out.println(usuarioBasico); // Mostrar o usuário básico
        System.out.println("--------------------");

        // Vamos simular a criação de sessões quando os usuários logam
        Sessao sessaoAdmin = usuarioAdmin.criarSessao(); // Admin logou e ganhou uma sessão
        Sessao sessaoBasico = usuarioBasico.criarSessao(); // Usuário básico logou e ganhou outra sessão

        System.out.println("\nSessões criadas:");
        System.out.println(sessaoAdmin); // Mostrar a sessão do admin
        System.out.println(sessaoBasico); // Mostrar a sessão do básico
        System.out.println("--------------------");

        // Simulando uns registros de auditoria pra ver quem fez o quê
        LogAuditoria logAdminCriou = new LogAuditoria(201L, usuarioAdmin, "Criou um novo usuário", java.time.LocalDateTime.now(), "192.168.1.10");
        LogAuditoria logBasicoVisualizou = new LogAuditoria(202L, usuarioBasico, "Visualizou um relatório", java.time.LocalDateTime.now(), "192.168.1.20");

        System.out.println("\nLogs de auditoria:");
        System.out.println(logAdminCriou); // Mostrar o log do admin criando
        System.out.println(logBasicoVisualizou); // Mostrar o log do básico visualizando
        System.out.println("--------------------");

        // Testando aquele método de logar do usuário
        System.out.println("\nTestando o método logar:");
        usuarioBasico.logar("senha456"); // Tentativa de login com a senha certa
        usuarioBasico.logar("senhaerrada"); // Tentativa com a senha errada
        System.out.println(usuarioBasico); // Pra ver se a data do último login mudou
        System.out.println("--------------------");
    }
}