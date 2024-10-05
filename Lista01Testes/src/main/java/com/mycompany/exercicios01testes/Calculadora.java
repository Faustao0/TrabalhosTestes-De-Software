package com.mycompany.exercicios01testes;

public class Calculadora {
    
     public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número negativo não possui raiz quadrada real.");
        }
        return Math.sqrt(numero);
    }

    public double logaritmoNatural(double numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Logaritmo natural não é definido para números menores ou iguais a zero.");
        }
        return Math.log(numero);
    }
}
