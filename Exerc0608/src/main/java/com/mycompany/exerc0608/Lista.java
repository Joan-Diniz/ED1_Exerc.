/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc0608;

/**
 *
 * @author joanp
 */


 //classe axiliar da questao 5 
    class Lista {
    No cabeca;
    int tamanho;

    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    // Inicializar a lista
    public void inicializar() {
        cabeca = null;
        tamanho = 0;
    }

    // Verificar se a lista é vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Inserir um dado elemento (mantendo a ordem)
    public void inserir(int elemento) {
        No novo = new No(elemento);

        if (cabeca == null || elemento < cabeca.info) {
            novo.prox = cabeca;
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info <= elemento) {
                atual = atual.prox;
            }
            novo.prox = atual.prox;
            atual.prox = novo;
        }

        tamanho++;
    }

    // Remover um dado elemento
    public void remover(int elemento) {
        if (cabeca == null) {
            return;
        }

        if (cabeca.info == elemento) {
            cabeca = cabeca.prox;
            tamanho--;
            return;
        }

        No atual = cabeca;
        while (atual.prox != null && atual.prox.info != elemento) {
            atual = atual.prox;
        }

        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            tamanho--;
        }
    }

    // Tamanho: retorna o número de elementos da lista
    public int tamanho() {
        return tamanho;
    }

    // Outros métodos (Iguais, Média, Busca, Elimina, Elimina_, Insere na direita, Insere na esquerda)
    // Implemente esses métodos conforme necessário.

    // Exemplo de método para imprimir a lista
    public void imprimir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
    }
    
