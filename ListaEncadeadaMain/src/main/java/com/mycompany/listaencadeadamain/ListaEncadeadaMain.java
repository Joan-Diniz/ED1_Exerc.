/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaencadeadamain;

/**
 *
 * @author joanp
 */
public class ListaEncadeadaMain {

   public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // 1. Adicione Homer e Marge na lista e depois imprima o resultado.
        lista.inserir(1); // Homer
        lista.inserir(2); // Marge
        lista.exibir();

        lista.esvaziar();
        lista.exibir();

        // 3. Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        lista.inserir(1); // Homer
        lista.inserirNaPosicao(0, 3); // Bart
        lista.inserirNaPosicao(1, 4); // Moll
        lista.exibir();

        lista.esvaziar();

        // 5. Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        lista.inserir(1); // Homer
        lista.inserir(3); // Bart
        lista.inserirNoInicio(5); // Lisa
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();

        // 7. Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        lista.inserir(1); // Homer
        lista.inserir(6); // Maggie
        lista.inserirNaPosicao(0, 3); // Bart
        lista.inserirNaPosicao(1, 2); // Marge
        lista.exibir();
        System.out.println("Lisa está na lista: " + lista.contains(5));

        lista.esvaziar();

        // 9. Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        lista.inserir(1); // Homer
        lista.inserir(3); // Bart
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // 10. Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("Marge está na lista: " + lista.contains(2));
        System.out.println("Homer está na lista: " + lista.contains(1));
        System.out.println("Bart está na lista: " + lista.contains(3));
        System.out.println("Maggie está na lista: " + lista.contains(6));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();

        // 12. Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
        lista.inserirNoInicio(1); // Homer
        lista.inserirNoInicio(3); // Bart
        lista.inserir(2); // Marge
        lista.inserirNaPosicao(1, 6); // Maggie
        lista.inserirNoInicio(7); // Ned Flanders
        lista.inserir(8); // Sr. Burns
        lista.exibir();

        // 13. Remova do fim da lista e imprima a lista.
        lista.remover(8);
        lista.exibir();

        // 14. Remova a posição 1, depois imprima a lista e o tamanho da lista.
        lista.remover(6);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // 15. Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("Marge está na lista: " + lista.contains(2));
        System.out.println("Homer está na lista: " + lista.contains(1));
        System.out.println("Bart está na lista: " + lista.contains(3));
        System.out.println("Maggie está na lista: " + lista.contains(6));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // 16. Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        lista.remover(7);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // 17. Verifique se Marge, Homer, Bart e Maggie na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println("Marge está na lista: " + lista.contains(2));
        System.out.println("Homer está na lista: " + lista.contains(1));
        System.out.println("Bart está na lista: " + lista.contains(3));
        System.out.println("Maggie está na lista: " + lista.contains(6));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();
    }

}
