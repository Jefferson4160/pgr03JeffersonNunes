/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public abstract class Forma2D extends Forma {
    //Não tem atributos extras e herda tudo que tem em Forma
    //Chama o construtor da classe mãe Forma
    public Forma2D(String nome){
        super(nome);
    };
    
    //Metodo abstrato para ser implementado em seus filhos
    public abstract String obterArea();
    
}
