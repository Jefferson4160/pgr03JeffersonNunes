/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class PagamentoPix implements ItfPagamento {
    //Declaração de variável
    private double valor = 0.0;
    
    public PagamentoPix(double valor){
        this.valor = valor; //seta o valor a ser pago
    }
    
    @Override
    public double calcularTotal(){
        double cashback = valor;
        return cashback * 0.02; //aplica a regra do pagamento em dinheiro, dando 10% de desconto
    }
    @Override
    public void imprimirRecibo(){
        //Criação de uma string para guardas as informações do pagamento
        String recibo = "<html><div style='text-align: center;'>Pagamento Dinheiro</div><br><br>";
        //String.format me permite formatar o valor com duas casas decimais e depois inserir na String
        recibo += String.format("Valor pagamento: R$ %.2f<br><br>Valor de cashback para proxima compra: R$ %.2f<br><br><html>", valor, calcularTotal());
        //Crio um icone com uma imagem personalizada, para usar no JOptionPane
        //esse getClass não entendi ao certo como funciona, mas busca de forma correta um arquivo dentro da estrutura de pacotes do proeto
        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/ifba/atividade09/imagens/icons8-pix-60.png"));
        //Um popup apenas com o Titulo e o texto, no centro da tela
        JOptionPane.showMessageDialog(null, recibo, "Recibo",JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
