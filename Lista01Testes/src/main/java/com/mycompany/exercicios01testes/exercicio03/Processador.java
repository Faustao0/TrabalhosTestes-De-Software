package com.mycompany.exercicios01testes.exercicio03;

public class Processador {
    
    public String inverterPalavras(String frase) {
        if (frase == null || frase.isEmpty()) {
            return frase;
        }
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]);
            if (i > 0) {
                fraseInvertida.append(" ");
            }
        }
        return fraseInvertida.toString();
    }

    public String substituirPalavras(String frase, String palavraAntiga, String palavraNova) {
        if (frase == null || frase.isEmpty() || palavraAntiga == null || palavraNova == null) {
            return frase;
        }
        return frase.replace(palavraAntiga, palavraNova);
    }

    public int contarOcorrenciasDePalavra(String frase, String palavra) {
        if (frase == null || frase.isEmpty() || palavra == null || palavra.isEmpty()) {
            return 0;
        }
        String[] palavras = frase.split(" ");
        int contador = 0;
        for (String p : palavras) {
            if (p.equals(palavra)) {
                contador++;
            }
        }
        return contador;
    }
}
