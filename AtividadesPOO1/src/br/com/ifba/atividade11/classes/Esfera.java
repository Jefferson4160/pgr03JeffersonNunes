/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public class Esfera extends Forma3D{
    double raio;
    
    
    public Esfera(String nome, double raio) {
        super(nome);
        setRaio(raio);
    }
    
    //Getters e Setters
    public double getRaio(){
        return raio;
    }
    public final void setRaio(double raio){
        this.raio = raio;
    }
    
    @Override
    public String obterArea() {
        //Calculo da area
        double area = 4*Math.PI*Math.pow(raio,2);
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        
        return areaFormatada;
    }

    @Override
    public String obterVolume() {
        //Calculo do volume
        double volume = (4/3)*Math.PI*Math.pow(raio,3);
        //Formatação do valor para duas casas decimais
        String volumeFormatado = String.format("%.2f", volume);
        
        return volumeFormatado;
    }

    @Override
    public String toString() {
        return "Esfera:\n\tNome: "+getNome()+"\n\tRaio: "+raio+"\n\tArea: "+this.obterArea()+"\n\tVolume: "+this.obterVolume();
    }
    
}
