/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public class Cubo extends Forma3D{
    double lados;
    
    public Cubo(String nome, double lados) {
        super(nome);
        setLados(lados);
    }
     //Getters e Setters 
    public double getLados(){
        return lados;
    }
    public final void setLados(double lados){
        this.lados = lados;
    }

    @Override
    public String obterArea() {
        //Calculo da area
        double area = 6*Math.pow(this.lados, 2);
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        
        return areaFormatada;
        
    }
    
    @Override
    public String obterVolume() {
        //Calculo da area
        double volume = Math.pow(this.lados, 3);
        //Formatação do valor para duas casas decimais
        String volumeFormatado = String.format("%.2f", volume);
        
        return volumeFormatado;
    }
        
    @Override
    public String toString() {
        return "Cubo:\n\tNome: "+getNome()+
                "\n\tLados: "+getLados()+
                "\n\tArea: "+this.obterArea()+
                "\n\tVolume: "+obterVolume();
    }

    
}
