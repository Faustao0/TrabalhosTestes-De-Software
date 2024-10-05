package com.mycompany.exercicios01testes.exercicio04;

import java.util.List;

public class Pedido {
    
    private int id;
    private String nomeCliente;
    private List<ItemPedido> itens;

    public Pedido(int id, String nomeCliente, List<ItemPedido> itens) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
    
}
