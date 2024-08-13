/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeadamain;

/**
 *
 * @author joanp
 */
public class ListaDuplamenteEncadeada {
    
    No inicio;
    No fim;

    ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    void inserir(int valor) {
        No novoNo = new No(valor);
        if (this.inicio == null) { // Lista vazia
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
    }

    void exibir() {
        No atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    void remover(int valor) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    this.inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    this.fim = atual.anterior;
                }
                atual = null;
                return;
            }
            atual = atual.proximo;
        }
    }

    boolean contains(int valor) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    int tamanho() {
        int tamanho = 0;
        No atual = this.inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    void esvaziar() {
        this.inicio = null;
        this.fim = null;
    }

    void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (this.inicio == null) { 
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = this.inicio;
            this.inicio.anterior = novoNo;
            this.inicio = novoNo;
        }
    }

    void inserirNaPosicao(int posicao, int valor) {
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No atual = this.inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null || atual.proximo == null) {
            inserir(valor);
        } else {
            No novoNo = new No(valor);
            novoNo.proximo = atual.proximo;
            novoNo.anterior = atual;
            atual.proximo.anterior = novoNo;
            atual.proximo = novoNo;
        }
    }
    
}
