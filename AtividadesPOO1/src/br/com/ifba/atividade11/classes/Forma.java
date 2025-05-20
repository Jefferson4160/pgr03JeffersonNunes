/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public abstract class Forma {
    String nome;
    
    // Construtor passando o nome
    public Forma(String nome){
        this.nome = nome;
    };
    
    //Getters e Setters
    public String getNome(){
        return nome;
    };
    public void setNome(String nome){
        this.nome = nome;
    };
    
    @Override
    public abstract String toString();
    
}
