package com.group6;

public class Isoceles extends Triangulo{

    public Isoceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        tipoTraingulo = "Isoceles";
    }

    @Override
    public double calcularArea() {
        double altura = 2 * Math.sqrt(lado1 * lado1 - (lado3 * lado3) / 4); // Cálculo de la altura
        return (lado3 * altura) / 2;
    }

    
}