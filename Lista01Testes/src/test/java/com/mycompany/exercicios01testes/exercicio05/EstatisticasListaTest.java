package com.mycompany.exercicios01testes.exercicio05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstatisticasListaTest {
    
    private final EstatisticasLista estatisticas = new EstatisticasLista();
    
    public EstatisticasListaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularMedia() {
        List<Double> numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double resultado = estatisticas.calcularMedia(numeros);
        assertEquals(3.0, resultado);
    }

    @Test
    void testCalcularMedianaImpar() {
        List<Double> numeros = Arrays.asList(1.0, 3.0, 5.0);
        double resultado = estatisticas.calcularMediana(numeros);
        assertEquals(3.0, resultado);
    }

    @Test
    void testCalcularMedianaPar() {
        List<Double> numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double resultado = estatisticas.calcularMediana(numeros);
        assertEquals(2.5, resultado);
    }

    @Test
    void testCalcularDesvioPadrao() {
        List<Double> numeros = Arrays.asList(2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0);
        double resultado = estatisticas.calcularDesvioPadrao(numeros);
        assertEquals(2.0, resultado, 1e-6);
    }

    @Test
    void testComportamentoComListaVazia() {
        List<Double> numerosVazia = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularMedia(numerosVazia));
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularMediana(numerosVazia));
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularDesvioPadrao(numerosVazia));
    }

    @Test
    void testComportamentoComValoresNulos() {
        List<Double> numerosComNulos = Arrays.asList(null, null, null);
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularMedia(numerosComNulos));
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularMediana(numerosComNulos));
        assertThrows(IllegalArgumentException.class, () -> estatisticas.calcularDesvioPadrao(numerosComNulos));
    }
}
