package com.mycompany.exercicios01testes.exercicio02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bruno
 */
public class GerenciadorContasTest {
    
    private GerenciadorContas gerenciador = new GerenciadorContas();
    
    public GerenciadorContasTest() {
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
    void testAdicionarConta() {
        Conta conta = new Conta(1, 1000.0, "João");
        gerenciador.adicionarConta(conta);
        assertEquals(conta, gerenciador.buscarContaPorNumero(1));
    }

    @Test
    void testBuscarContaPorNumeroExistente() {
        Conta conta = new Conta(2, 500.0, "Maria");
        gerenciador.adicionarConta(conta);
        Conta encontrada = gerenciador.buscarContaPorNumero(2);
        assertEquals(conta, encontrada);
    }

    @Test
    void testTransferirComSaldoSuficiente() {
        Conta conta1 = new Conta(3, 200.0, "Carlos");
        Conta conta2 = new Conta(4, 300.0, "Ana");
        gerenciador.adicionarConta(conta1);
        gerenciador.adicionarConta(conta2);

        gerenciador.transferir(3, 4, 100.0);
        assertEquals(100.0, conta1.getSaldo());
        assertEquals(400.0, conta2.getSaldo());
    }

    @Test
    void testTransferirComSaldoInsuficiente() {
        Conta conta1 = new Conta(5, 50.0, "Pedro");
        Conta conta2 = new Conta(6, 150.0, "Luisa");
        gerenciador.adicionarConta(conta1);
        gerenciador.adicionarConta(conta2);

        assertThrows(IllegalArgumentException.class, () -> gerenciador.transferir(5, 6, 100.0));
    }

    @Test
    void testTransferirEntreContasInexistentes() {
        assertThrows(IllegalArgumentException.class, () -> gerenciador.transferir(7, 8, 50.0));
    }
}
