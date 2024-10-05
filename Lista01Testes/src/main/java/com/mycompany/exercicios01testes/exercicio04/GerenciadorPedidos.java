package com.mycompany.exercicios01testes.exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorPedidos {
  
    private List<Pedido> pedidos;
    
    public GerenciadorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularValorTotal(int idPedido) {
        Pedido pedido = pedidos.stream()
                .filter(p -> p.getId() == idPedido)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado."));
        
        return pedido.getItens().stream()
                .mapToDouble(ItemPedido::calcularValor)
                .sum();
    }

    public List<Pedido> listarPedidosPorCliente(String nomeCliente) {
        return pedidos.stream()
                .filter(p -> p.getNomeCliente().equalsIgnoreCase(nomeCliente))
                .collect(Collectors.toList());
    }
}
