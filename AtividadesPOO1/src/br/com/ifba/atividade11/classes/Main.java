/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.classes;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int op2;
        String nome;
        
        do{ 
            System.out.print("---MENU---\n\n1 - Forma 2D\n2 - Forma 3D\n0 - Sair\nOpcao: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    do{
                        System.out.print("---FORMAS 2D---\n\n1- Circulo\n2- Quadrado\n3- Triangulo\n0- Sair\nOpcao: ");
                        op2 = sc.nextInt();
                        sc.nextLine();//Serve para pegar o \n que fica após pressionar o enter
                        switch(op2){
                            case 1:
                                double raio;
                                System.out.println("Informe o nome identificador do circulo: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o raio: ");
                                //Garante que sempre seja informado um valor maior que zero
                                do{
                                    raio = sc.nextDouble();
                                    sc.nextLine();
                                    if(raio<0){
                                        System.out.println("O raio não pode ser negativo\n");
                                        System.out.println("Informe um valor valido para o raio: ");
                                    }
                                }while(raio<0);
                                
                                Circulo circulo1 = new Circulo(nome, raio);
                                System.out.println(circulo1.toString());
                                break;
                            case 2:
                                double lados;
                                System.out.println("Informe o nome identificador do quadrado: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o valor dos lados: ");
                                lados = sc.nextDouble();
                                sc.nextLine();
                                Quadrado quadrado1 = new Quadrado(nome, lados);
                                System.out.println(quadrado1.toString());
                                break;
                            case 3:
                                double base;
                                double altura;
                                System.out.println("Informe o nome identificador do triangulo: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o valor da base ");
                                base = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Informe o valor da altura ");
                                altura = sc.nextDouble();
                                sc.nextLine();
                                Triangulo trialgulo1 = new Triangulo(nome, base, altura);
                                System.out.println(trialgulo1.toString());
                                break;
                            default:
                                System.out.println("Opcao invalida.\n\n");
                                break;
                        }
                    }while(op2 != 0);
                    
                    break;
                case 2:
                    do{
                        System.out.print("---FORMAS 3D---\n\n1-Esfera\n2- Cubo\n3- Piramide de base quadrada\n0- Sair\nOpcao: ");
                        op2 = sc.nextInt();
                        sc.nextLine();//Serve para pegar o \n que fica após pressionar o enter
                        switch(op2){
                            case 1:
                                double raio;
                                System.out.println("Informe o nome identificador da Esfera: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o raio: ");
                                raio = sc.nextDouble();
                                sc.nextLine();
                                Esfera esfera1 = new Esfera(nome, raio);
                                System.out.println(esfera1.toString());
                                break;
                            case 2:
                                double lados;
                                System.out.println("Informe o nome identificador do cubo: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o valor dos lados: ");
                                lados = sc.nextDouble();
                                sc.nextLine();
                                Cubo cubo1 = new Cubo(nome, lados);
                                System.out.println(cubo1.toString());
                                break;
                            
                            case 3:
                                double altura;
                                System.out.println("Informe o nome identificador da piramide: ");
                                nome = sc.nextLine();
                                System.out.println("Informe o valor dos lados da base: ");
                                lados = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Informe a altura: ");
                                altura = sc.nextDouble();
                                sc.nextLine();
                                Piramide piramide1 = new Piramide(nome, lados, altura);
                                System.out.println(piramide1.toString());
                                break;
       
                        }
                    }while(op2 != 0);

                    break;
                    
            }
        }while(op!=0);
       
        
        

        
    }
    
        
}
