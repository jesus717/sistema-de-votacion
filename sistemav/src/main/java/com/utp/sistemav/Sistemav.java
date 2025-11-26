
package com.utp.sistemav;

import com.utp.sistemav.elecciones.Electores;
import com.utp.sistemav.elecciones.Postulantes;
import com.utp.sistemav.elecciones.Registro;
import java.util.Scanner;

public class Sistemav {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Integer opcion;
        Boolean continuar=true;
        
        Postulantes[] postulantes = new Postulantes[3];
        Integer conteo_de_postulantes=0;
        
        Registro[] registros = new Registro[10];
        Integer votos=0;
        
        while(continuar){
            System.out.println("------Elecciones electores 2026----------------");
            System.out.println("1. Ingresar postulante");
            System.out.println("2. Ingresar voto");
            System.out.println("3. Ver resultados");
            System.out.println("0. Salir ");
            System.out.print("Seleccione una opcion: ");
            opcion = datos.nextInt();
            datos.nextLine();//limpia el buffer
            
            switch (opcion) {
                case 1 -> {
                    if (conteo_de_postulantes < 3) {
                        Postulantes postulante = new Postulantes();
                        System.out.print("Dni: ");
                        postulante.setDni(datos.nextLine());
                        System.out.print("Nombres: ");
                        postulante.setNombres(datos.nextLine());
                        System.out.print("Apellidos: ");
                        postulante.setApellidos(datos.nextLine());
                        System.out.print("Partido: ");
                        postulante.setPartido(datos.nextLine());
                        System.out.print("Propuesta: ");
                        postulante.setPropuesta(datos.nextLine());
                        
                        postulantes[conteo_de_postulantes] = postulante;
                        conteo_de_postulantes = conteo_de_postulantes + 1;
                        /*
                        System.out.println("----------------------------------");
                        System.out.println("Dni: "+postulante.getDni());
                        System.out.println("Nombres: "+postulante.getNombres());
                        System.out.println("Apellidos: "+postulante.getApellidos());
                        System.out.println("Partido: "+postulante.getPartido());
                        System.out.println("Propuesta: "+postulante.getPropuesta());
                        System.out.println("-----------------------------------");
                        */
                        System.out.println("Registrado correctamente");
                    }else {
                        System.out.println("--------------------------");
                        System.out.println("Maximo de postulantes es 3");
                        System.out.println("--------------------------");
                    }
                }
                case 2 -> {
                    if (conteo_de_postulantes > 0 && votos <=10) {
                        Electores elector = new Electores();
                        System.out.print("Dni: ");
                        elector.setDni(datos.nextLine());
                        System.out.print("Nombres: ");
                        elector.setNombres(datos.nextLine());
                        System.out.print("Apellidos: ");
                        elector.setApellidos(datos.nextLine());
                        System.out.print("Dni electronico: ");
                        elector.setEs_dni_electronico(datos.nextBoolean());
                        
                        Registro registro = new Registro ();
                        registro.setElector(elector);
                        
                        System.out.println("El Partido: ");
                        registro.setPartido(datos.nextLine());
                        
                        registros[votos] = registro;
                        votos = votos + 1;
                    }else {
                        if (conteo_de_postulantes > 0) {
                            System.out.println("------------------------------");
                            System.out.println("Ningun postulante inscrito :( ");
                            System.out.println("------------------------------");
                        }else {
                            System.out.println("------------------------");
                            System.out.println("    Maximo de votos     ");
                            System.out.println("------------------------");
                        }                      
                    }
                }
                case 3 -> {
                    if (conteo_de_postulantes > 0 &&  votos > 0 ) {
                        
                    }else {
                        if (conteo_de_postulantes > 0) {
                            System.out.println("------------------------------");
                            System.out.println("Ningun postulante inscrito :( ");
                            System.out.println("------------------------------");
                        }else {
                            System.out.println("------------------------");
                            System.out.println("      Ningun voto       ");
                            System.out.println("------------------------");
                        }
                    }
                }
                case 0 -> {
                    continuar=false; 
                    System.out.println("Fin del sistema");                    
                }
            }                                                   
        }       
    }
    
    public static void ingresar_postulantes(Scanner datos){
        
    }
    public static void ingresar_votos(Scanner datos){
        
    }
    public static void ver_resultado(Scanner datos){
        
    }
}