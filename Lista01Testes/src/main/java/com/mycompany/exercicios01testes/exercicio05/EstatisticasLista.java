package com.mycompany.exercicios01testes.exercicio05;

import java.util.Collections;
import java.util.List;

public class EstatisticasLista {
    
    public double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia ou ser nula.");
        }

        double soma = 0;
        int count = 0;

        for (Double numero : numeros) {
            if (numero != null) {
                soma += numero;
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("A lista de números contém apenas valores nulos.");
        }

        return soma / count;
    }

    public double calcularMediana(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia ou ser nula.");
        }

        numeros.removeIf(num -> num == null);

        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números contém apenas valores nulos.");
        }

        Collections.sort(numeros);
        int tamanho = numeros.size();
        if (tamanho % 2 == 0) {
            return (numeros.get(tamanho / 2 - 1) + numeros.get(tamanho / 2)) / 2.0;
        } else {
            return numeros.get(tamanho / 2);
        }
    }

    public double calcularDesvioPadrao(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia ou ser nula.");
        }

        double media = calcularMedia(numeros);
        double somaQuadrados = 0;
        int count = 0;

        for (Double numero : numeros) {
            if (numero != null) {
                somaQuadrados += Math.pow(numero - media, 2);
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("A lista de números contém apenas valores nulos.");
        }

        return Math.sqrt(somaQuadrados / count);
    }
}
