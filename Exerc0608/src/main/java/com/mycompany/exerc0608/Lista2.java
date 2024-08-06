/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc0608;

/**
 *
 * @author joanp
 */
public class Lista2 {
    No2 inicio;

    public Lista2() {
        this.inicio = null;
    }

    // Adicionar elemento à lista (mantendo a ordenação)
    public void adicionar(int elemento2) {
        No2 novoo = new No2(elemento2);

        if (inicio == null || elemento2 < inicio.valor) {
            novoo.proximo = inicio;
            inicio = novoo;
        } else {
            No2 atual = inicio;
            while (atual.proximo != null && atual.proximo.valor <= elemento2) {
                atual = atual.proximo;
            }
            novoo.proximo = atual.proximo;
            atual.proximo = novoo;
        }
    }

    public boolean contem(int elemento2) {
    No2 atual = inicio;
    while (atual != null) {
        if (atual.valor == elemento2) {
            return true;
        }
        atual = atual.proximo;
    }
    return false;
}
    
   public Lista2 inverter(Lista2 lista) {
    Lista2 listaInvertida = new Lista2();
    No2 atual = lista.inicio;
    while (atual != null) {
        listaInvertida.adicionar(atual.valor);
        atual = atual.proximo;
    }
    return listaInvertida;
}
    public Lista2 impares(Lista2 lista1, Lista2 lista2) {
    Lista2 listaImpares = new Lista2();
    No2 atual1 = lista1.inicio;
    No2 atual2 = lista2.inicio;
    while (atual1 != null) {
        if (atual1.valor % 2 != 0) {
            listaImpares.adicionar(atual1.valor);
        }
        atual1 = atual1.proximo;
    }
    while (atual2 != null) {
        if (atual2.valor % 2 != 0) {
            listaImpares.adicionar(atual2.valor);
        }
        atual2 = atual2.proximo;
    }
    return listaImpares;
}
    
    public Lista2 concatenar(Lista2 lista1, Lista2 lista2) {
    Lista2 listaConcatenada = new Lista2();
    No2 atual1 = lista1.inicio;
    No2 atual2 = lista2.inicio;
    while (atual1 != null) {
        listaConcatenada.adicionar(atual1.valor);
        atual1 = atual1.proximo;
    }
    while (atual2 != null) {
        listaConcatenada.adicionar(atual2.valor);
        atual2 = atual2.proximo;
    }
    return listaConcatenada;
}
    
    public Lista2 intersecao(Lista2 lista1, Lista2 lista2) {
    Lista2 listaIntersecao = new Lista2();
    No2 atual1 = lista1.inicio;
    while (atual1 != null) {
        if (lista2.contem(atual1.valor)) {
            listaIntersecao.adicionar(atual1.valor);
        }
        atual1 = atual1.proximo;
    }
    return listaIntersecao;
}
    
   public Lista2 intercalarOrdenado(Lista2 lista1, Lista2 lista2) {
    Lista2 listaIntercalada = new Lista2();
    No2 atual1 = lista1.inicio;
    No2 atual2 = lista2.inicio;
    while (atual1 != null && atual2 != null) {
        listaIntercalada.adicionar(atual1.valor);
        listaIntercalada.adicionar(atual2.valor);
        atual1 = atual1.proximo;
        atual2 = atual2.proximo;
    }
    while (atual1 != null) {
        listaIntercalada.adicionar(atual1.valor);
        atual1 = atual1.proximo;
    }
    while (atual2 != null) {
        listaIntercalada.adicionar(atual2.valor);
        atual2 = atual2.proximo;
    }
    return listaIntercalada;
}
 
    public Lista2 intercalarOrdenadoCrescente(Lista2 lista1, Lista2 lista2) {
    Lista2 listaIntercalada = new Lista2();
    No2 atual1 = lista1.inicio;
    No2 atual2 = lista2.inicio;

    while (atual1 != null && atual2 != null) {
        if (atual1.valor < atual2.valor) {
            listaIntercalada.adicionar(atual1.valor);
            atual1 = atual1.proximo;
        } else {
            listaIntercalada.adicionar(atual2.valor);
            atual2 = atual2.proximo;
        }
    }

    while (atual1 != null) {
        listaIntercalada.adicionar(atual1.valor);
        atual1 = atual1.proximo;
    }

    while (atual2 != null) {
        listaIntercalada.adicionar(atual2.valor);
        atual2 = atual2.proximo;
    }

    return listaIntercalada;
}
    
}
