
package com.utp.sistemav;

import java.util.Scanner;

public class Sistemav {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Integer opcion;
        Boolean continuar=true;
        
        //Postulantes[] postulantes
        
        
        while(continuar){
            System.out.println("------Elecciones electores 2026----------------");
            System.out.println("1. Ingresar postulante");
            System.out.println("2. Ingresar voto");
            System.out.println("3. Ver resultados");
            System.out.println("0. Salir ");
            System.out.println("Seleccione una opcion: ");
            opcion = datos.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    
                }
                case 2 -> {
                    
                }
                case 3 -> {
                    
                }
                case 0 -> {
                    continuar=false; 
                    System.out.println("Fin del sistema");
                    
                }

            }
                
            
            
            
        }
        


    
  }
}