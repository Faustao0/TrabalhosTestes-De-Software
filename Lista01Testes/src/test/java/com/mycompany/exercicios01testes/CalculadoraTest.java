package com.mycompany.exercicios01testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
   private final Calculadora calculadora = new Calculadora();
    
    public CalculadoraTest() {
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
    public void testPotencia() {
        double resultado = calculadora.potencia(2.0, 3.0);
        assertEquals(8.0, resultado);
    }

    @Test
    public void testRaizQuadrada() {
       double resultado = calculadora.raizQuadrada(9.0);
        assertEquals(3.0, resultado);
    }

    @Test
    public void testLogaritmoNatural() {
        double resultado = calculadora.logaritmoNatural(2.718281828);
        assertEquals(1.0, resultado, 1e-6);
    }
    
     @Test
    void testLogaritmoNaturalDeNumeroNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.logaritmoNatural(-2.0));
    }

    @Test
    void testLogaritmoNaturalDeZeroLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.logaritmoNatural(0.0));
    }
    
}
