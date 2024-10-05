package com.mycompany.exercicios01testes.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContas {
    
    private List<Conta> contas;

    public GerenciadorContas() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Conta não encontrada."));
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta contaOrigem = buscarContaPorNumero(numeroContaOrigem);
        Conta contaDestino = buscarContaPorNumero(numeroContaDestino);

        if (contaOrigem == null || contaDestino == null) {
            throw new IllegalArgumentException("Conta de origem ou destino não encontrada.");
        }

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }
}
