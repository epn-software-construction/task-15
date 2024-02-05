package com.group6;


public class Escaleno extends Triangulo {

    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        tipoTraingulo = "Escaleno";
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}