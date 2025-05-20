/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public class Circulo extends Forma2D{
    private double raio;
    
    public Circulo(String nome, double raio) {
        super(nome);//chama o construtor da classe mãe
        //this.raio = raio;
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
        double area = Math.PI*Math.pow(this.raio, 2);
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        //calculo de área para o circulo
        return areaFormatada;
    }

    @Override
    public String toString() {
        return "Circulo:\n\tNome: "+getNome()+"\n\tRaio: "+raio+"\n\tArea: "+this.obterArea();
    }
    
}
