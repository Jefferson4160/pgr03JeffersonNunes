/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author ADMIN
 */
public class Conta {
    // Atributos da conta (ninguém mexe direto neles, só com getters e setters)
    private String tipo;   // cc ou cp
    private boolean status;  // aberta ou fechada
    private double saldo;  // quanto tem na conta

    // Quando criar a conta, ela já começa fechada e com saldo zero
    public Conta() {
        this.status = false;
        this.saldo = 0;
    }

    // GETTERS E SETTERS (padrãozinho obrigatório)
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Abrir conta
    public void abrirConta(String tipo) {
        if (!this.status) { // só abre se tiver fechada
            if (tipo.equals("cc") || tipo.equals("cp")) { // valida tipo
                this.tipo = tipo;
                this.status = true;
                // Se for cp ganha 150, se for cc ganha 50
                if (tipo.equals("cp")) {
                    this.saldo = 150;
                } else {
                    this.saldo = 50;
                }
                System.out.println("Conta " + tipo + " aberta com sucesso! Saldo: " + this.saldo);
            } else {
                System.out.println("Tipo invalido. Use 'cc' ou 'cp'.");
            }
        } else {
            System.out.println("Conta ja esta aberta.");
        }
    }

    // Fechar conta
    public void fecharConta() {
        if (this.status) { // só fecha se tiver aberta
            if (this.saldo == 0) { // só fecha se saldo for zero
                this.status = false;
                System.out.println("Conta fechada com sucesso.");
            } else {
                System.out.println("Conta nao pode ser fechada. Saldo deve ser zero.");
            }
        } else {
            System.out.println("Conta ja esta fechada.");
        }
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        if (this.status) { // só deposita se conta estiver aberta
            this.saldo += valor;
            System.out.println("Deposito de " + valor + " realizado. Novo saldo: " + this.saldo);
        } else {
            System.out.println("Conta esta fechada. Nao eh possivel depositar.");
        }
    }

    // Sacar dinheiro
    public void sacar(double valor) {
        if (this.status) { // só saca se estiver aberta
            if (this.saldo >= valor) { // verifica se tem saldo
                this.saldo -= valor;
                System.out.println("Saque de " + valor + " realizado. Novo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta esta fechada. Nao eh possivel sacar.");
        }
    }

    // Pagar mensalidade
    public void pagarMensalidade() {
        if (this.status) { // só paga se conta estiver aberta
            double valorMensal = 0;
            // cc paga 12, cp paga 20
            if (this.tipo.equals("cc")) {
                valorMensal = 12;
            } else if (this.tipo.equals("cp")) {
                valorMensal = 20;
            }

            if (this.saldo >= valorMensal) { // precisa ter saldo
                this.saldo -= valorMensal;
                System.out.println("Mensalidade de " + valorMensal + " paga. Novo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade.");
            }
        } else {
            System.out.println("Conta esta fechada. Nao eh possivel pagar mensalidade.");
        }
    }
}
