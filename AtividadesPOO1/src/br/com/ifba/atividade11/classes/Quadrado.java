/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public final class Quadrado extends Forma2D{
    double lados;
    
    public Quadrado(String nome, double lados) {
        super(nome);
        setLados(lados);
    }
     //Getters e Setters 
    public double getLados(){
        return lados;
    }
    public void setLados(double lados){
        this.lados = lados;
    }

    @Override
    public String obterArea() {
        //Calculo da area
        double area = Math.pow(this.lados, 2);
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        
        return areaFormatada;
        
    }

    @Override
    public String toString() {
        return "Quadrado:\n\tNome: "+getNome()+"\n\tLados: "+lados+"\n\tArea: "+this.obterArea();
    }
    
}
