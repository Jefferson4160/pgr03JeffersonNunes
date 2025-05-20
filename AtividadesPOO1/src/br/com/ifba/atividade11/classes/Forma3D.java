/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public abstract class Forma3D extends Forma{

    public Forma3D(String nome) {
        super(nome);
    }
    
    public abstract String obterArea();
    
    public abstract String obterVolume();
    
    
}
