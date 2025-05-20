/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

/**
 *
 * @author ADMIN
 */
public class Piramide extends Forma3D{
    double lados;
    double altura;
    double apotema; //metade da base
    double alturaFace; //calculado através do teorema de pitagoras
    
    public Piramide(String nome, double lados, double altura) {
        super(nome);
        setLados(lados);
        setAltura(altura);
        setApotema(apotema, lados);
        setAlturaFace(alturaFace, apotema, altura);  
    }
     //Getters e Setters 
    public double getLados(){
        return lados;
    }
    public final void setLados(double lados){
        this.lados = lados;
    }
    
    public double getAltura(){
        return altura;
    }
    public final void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getApotema(){
        return apotema;
    }
    private void setApotema(double apotema, double lados){
        this.apotema = lados/2;
    }
    
    public double getAlturaFace(){
        return alturaFace;
    }
    private void setAlturaFace(double alturaFace, double apotema, double altura){
        this.alturaFace = Math.sqrt(Math.pow(apotema, 2)+Math.pow(altura, 2));
    }
    
    @Override
    public String obterArea() {
        //Calculo da area
        double area = Math.pow(this.lados, 2)+(4*((lados*alturaFace)/2));
        //Formatação do valor para duas casas decimais
        String areaFormatada = String.format("%.2f", area);
        
        return areaFormatada;
        
    }
    
    @Override
    public String obterVolume() {
        //Calculo da area
        double volume = (Math.pow(this.lados, 2)*altura)/3;
        //Formatação do valor para duas casas decimais
        String volumeFormatado = String.format("%.2f", volume);
        
        return volumeFormatado;
    }
        
    @Override
    public String toString() {
        return "Piramide:\n\tNome: "+getNome()+
                "\n\tLados: "+getLados()+
                "\n\tAltura: "+getAltura()+
                "\n\tApotema: "+getApotema()+
                "\n\tAltura da Face: "+getAlturaFace()+
                "\n\tArea: "+this.obterArea()+
                "\n\tVolume: "+obterVolume();
    }
}
