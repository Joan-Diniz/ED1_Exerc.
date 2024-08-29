/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filadeatendimento;

/**
 *
 * @author joanp
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class FiladeAtendimento {

    private static final int TOTAL_PESSOAS = 100;
    private static final int GRUPO_SIZE = 10;
    private static final int[] ATENDIMENTO_POR_GRUPO = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Deque<Pessoa> fila = new ArrayDeque<>();
        Queue<Pessoa> naoAtendidas = new LinkedList<>();
        Random random = new Random();

        // Gerar pessoas e adicionar na fila
        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            Pessoa p = new Pessoa(i, random.nextBoolean() ? "M" : "F", random.nextInt(100), random.nextBoolean(), random.nextBoolean(), random.nextBoolean());
            fila.add(p);
        }

        // Atender pessoas conforme a prioridade
        int atendidas = 0;
        for (int i = 0; i < TOTAL_PESSOAS / GRUPO_SIZE; i++) {
            int atender = ATENDIMENTO_POR_GRUPO[i];
            for (int j = 0; j < atender; j++) {
                if (!fila.isEmpty()) {
                    Pessoa p = fila.poll();
                    System.out.println("Atendendo: " + p);
                    atendidas++;
                }
            }
        }

        // Adicionar as pessoas não atendidas na fila de não atendidas
        while (!fila.isEmpty()) {
            naoAtendidas.add(fila.poll());
        }

        // Mostrar pessoas não atendidas
        System.out.println("\nPessoas não atendidas:");
        for (Pessoa p : naoAtendidas) {
            System.out.println(p);
        }
    }
}
