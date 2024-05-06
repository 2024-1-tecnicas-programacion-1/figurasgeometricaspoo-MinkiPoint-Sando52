package com.mycompany.figurasgeometricaspoo;

public class Rectangulo {
    private double lado1;
    private double lado2;
    double base;
    double altura;
    public double obtenerArea(){    
        return base*altura;
    }
    public double obtenerPerimetro(){
        return base+altura+lado1+lado2;
    }
}
