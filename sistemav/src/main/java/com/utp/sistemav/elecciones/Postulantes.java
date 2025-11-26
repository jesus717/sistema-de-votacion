
package com.utp.sistemav.elecciones;

public class Postulantes extends Persona {
    public String partido; 
    public String[] propuestas; 

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String[] getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(String[] propuestas) {
        this.propuestas = propuestas;
    }

    
}