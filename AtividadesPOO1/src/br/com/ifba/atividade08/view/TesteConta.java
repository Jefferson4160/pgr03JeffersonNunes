/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author ADMIN
 */

public class TesteConta {
    public static void main(String[] args) {

        // Criando uma conta
        Conta c1 = new Conta();

        // Tentando depositar com conta fechada (vai dar erro)
        c1.depositar(100);

        // Agora abrindo a conta como poupança (cp)
        c1.abrirConta("cp");

        // Depositando 50 reais
        c1.depositar(50);

        // Sacando 100 reais
        c1.sacar(100);

        // Tentando sacar mais do que o saldo (vai dar erro)
        c1.sacar(200);

        // Pagando a mensalidade
        c1.pagarMensalidade();

        // Tentando fechar conta com saldo ainda (não fecha)
        c1.fecharConta();

        // Sacando tudo (pega saldo atual com getter)
        c1.sacar(c1.getSaldo());

        // Agora sim, fechando conta com saldo zero
        c1.fecharConta();
    }
}
