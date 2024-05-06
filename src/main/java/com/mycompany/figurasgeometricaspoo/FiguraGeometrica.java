package com.mycompany.figurasgeometricaspoo;


import java.util.logging.Logger;


public class FiguraGeometrica {
   private String nombre;
   private String color;
   
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    private static final Logger LOG = Logger.getLogger(FiguraGeometrica.class.getName());

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }       
    public double obtenerArea(){
        return 0;
    }
    
    public double obtenerPerimetro(){
        return 0;
    }

    
  
    
   
}
