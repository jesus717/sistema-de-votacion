
package com.utp.sistemav;

import java.util.Scanner;

public class Sistemav {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Integer opcion;
        Boolean continuar=true;
        while(continuar){
            System.out.println("------Elecciones electores 2026----------------");
            System.out.println("1. Ingresar votos emitidos por region y partido");
            System.out.println("2. Informe de votos emitidos por region");
            System.out.println("7. Salir ");
            System.out.println("Seleccione una opcion: ");
            opcion = datos.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    
                }
                case 2 -> {
                    
                }
                case 7 -> {
                    continuar=false; 
                    System.out.println("Fin del sistema");
                    
                }

            }
                
            
            
            
        }
        


    
  }
}