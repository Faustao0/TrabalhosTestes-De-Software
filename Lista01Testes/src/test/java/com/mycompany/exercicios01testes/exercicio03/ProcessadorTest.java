package com.mycompany.exercicios01testes.exercicio03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorTest {
    
    private final  Processador processador = new Processador();
    
    public ProcessadorTest() {
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
    public void testSomeMethod() {
    }
    
    @Test
    void testInverterPalavrasFraseNormal() {
        String frase = "Olá Mundo";
        String resultado = processador.inverterPalavras(frase);
        assertEquals("Mundo Olá", resultado);
    }

    @Test
    void testSubstituirPalavrasEmFrase() {
        String frase = "O gato preto está no telhado";
        String resultado = processador.substituirPalavras(frase, "gato", "cachorro");
        assertEquals("O cachorro preto está no telhado", resultado);
    }

    @Test
    void testContarOcorrenciasDePalavra() {
        String frase = "o sol brilha para todos o tempo todo";
        int resultado = processador.contarOcorrenciasDePalavra(frase, "o");
        assertEquals(3, resultado);
    }

    @Test
    void testInverterPalavrasFraseVazia() {
        String frase = "";
        String resultado = processador.inverterPalavras(frase);
        assertEquals("", resultado);
    }

    @Test
    void testSubstituirPalavrasEmFraseVazia() {
        String frase = "";
        String resultado = processador.substituirPalavras(frase, "gato", "cachorro");
        assertEquals("", resultado);
    }

    @Test
    void testContarOcorrenciasDePalavraEmFraseVazia() {
        String frase = "";
        int resultado = processador.contarOcorrenciasDePalavra(frase, "o");
        assertEquals(0, resultado);
    }

    @Test
    void testComportamentoComStringNula() {
        assertNull(processador.inverterPalavras(null));
        assertNull(processador.substituirPalavras(null, "gato", "cachorro"));
        assertEquals(0, processador.contarOcorrenciasDePalavra(null, "o"));
    }
    
}
