/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public final class Triangulo extends Forma2D{
    double base;
    double altura;
    
    public Triangulo(String nome, double base, double altura) {
        super(nome);
        setBase(base);
        setAltura(altura);
    }
     //Getters e Setters 
    public double getBase(){
        return base;
    }
    public final void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    @Override
    public String obterArea() {
        //Calculo da area
        double area = (base*altura)/2;
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        
        return areaFormatada;
        
    }

    @Override
    public String toString() {
        return "Triangulo:\n\tNome: "+getNome()+"\n\tBase: "+base+"\n\tAltura: "+altura+"Area: "+this.obterArea();
    }
}
