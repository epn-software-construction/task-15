package com.group6;

public class TRectangulo extends Triangulo {

    public TRectangulo(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
        tipoTraingulo = "Triangulo";
    }

    @Override
    public double calcularArea() {
        return (lado1 * lado2) / 2;
    }
}
