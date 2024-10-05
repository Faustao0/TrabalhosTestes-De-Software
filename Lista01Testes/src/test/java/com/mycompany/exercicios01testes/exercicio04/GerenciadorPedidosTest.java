package com.mycompany.exercicios01testes.exercicio04;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorPedidosTest {
    
     private final GerenciadorPedidos gerenciador = new GerenciadorPedidos();
    
    public GerenciadorPedidosTest() {
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
    public void testAdicionarPedido() {
        Pedido pedido = new Pedido(1, "João", Arrays.asList(new ItemPedido("Produto A", 10.0, 2)));
        gerenciador.adicionarPedido(pedido);
        assertEquals(pedido, gerenciador.listarPedidosPorCliente("João").get(0));
    }

    @Test
    public void testCalcularValorTotal() {
        List<ItemPedido> itens = Arrays.asList(
                new ItemPedido("Produto A", 10.0, 2),
                new ItemPedido("Produto B", 20.0, 1)
         );
        Pedido pedido = new Pedido(2, "Maria", itens);
        gerenciador.adicionarPedido(pedido);

        double valorTotal = gerenciador.calcularValorTotal(2);
        assertEquals(40.0, valorTotal);
    }

    @Test
    public void testListarPedidosPorCliente() {
        
        Pedido pedido1 = new Pedido(3, "Carlos", Arrays.asList(new ItemPedido("Produto C", 15.0, 3)));
        Pedido pedido2 = new Pedido(4, "Carlos", Arrays.asList(new ItemPedido("Produto D", 25.0, 1)));
        gerenciador.adicionarPedido(pedido1);
        gerenciador.adicionarPedido(pedido2);

        List<Pedido> pedidosCarlos = gerenciador.listarPedidosPorCliente("Carlos");
        assertEquals(2, pedidosCarlos.size());
        assertTrue(pedidosCarlos.contains(pedido1));
        assertTrue(pedidosCarlos.contains(pedido2));
    }
    
    @Test
    void testCalcularValorTotalDePedidoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> gerenciador.calcularValorTotal(99));
    }
}
