package com.mycompany.figurasgeometricaspoo;

public class Triangulo {
    private double base;
    private double altura;
    double lado1;
    double lado2;
    double lado3;
    public double obtenerArea(){ 
        return base*altura/2;
    }
    public double obtenerPerimetro(){        
        return lado1+lado2+lado3;
    }
}
