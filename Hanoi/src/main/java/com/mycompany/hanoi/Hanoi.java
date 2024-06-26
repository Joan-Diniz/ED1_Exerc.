/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hanoi;

/**
 *
 * @author joanp
 */

import java.time.Duration;
import java.time.Instant;


public class Hanoi {

     private static int movimentos = 0;

    public static void main(String[] args) {
        
        int n = 10; // <===== coloque o numero de discos aq 
        
        // Marca o tempo inicial
        Instant inicio = Instant.now();
        
        // Resolver o problema das Torres de Hanói
        resolverTorresDeHanoi(n, 'A', 'C', 'B');
        
        // Marca o tempo final
        Instant fim = Instant.now();
        
        // Calcula a duração total
        Duration duracao = Duration.between(inicio, fim);
        
        // Formatação da duração no formato HH:MM:SS:mm
        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();
        long milissegundos = duracao.toMillisPart();
        
        // Exibir os resultados
        System.out.printf("Tempo gasto: %02d:%02d:%02d:%03d\n", horas, minutos, segundos, milissegundos);
        System.out.println("Quantidade de movimentos realizados: " + movimentos);
    }
    
    // Função recursiva para resolver o problema das Torres de Hanói
    public static void resolverTorresDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            // Movimento de um único disco
            System.out.println("Mover disco 1 da estaca " + origem + " para a estaca " + destino);
            movimentos++;
            return;
        }
        
        // Move n-1 discos da origem para a estaca auxiliar
        resolverTorresDeHanoi(n - 1, origem, auxiliar, destino);
        
        // Move o disco n da origem para a estaca destino
        System.out.println("Mover disco " + n + " da estaca " + origem + " para a estaca " + destino);
        movimentos++;
        
        // Move n-1 discos da estaca auxiliar para a estaca destino
        resolverTorresDeHanoi(n - 1, auxiliar, destino, origem);
    }
}
/*

Explicação do Código:
Definição da classe e variável global:

movimentos: Conta o número de movimentos realizados.
Método main:

Define o número de discos (64 no exemplo).
Marca o tempo inicial usando Instant.now().
Chama o método resolverTorresDeHanoi para resolver o problema.
Marca o tempo final.
Calcula a duração da execução e formata no formato HH:MM:SS:mm.
Imprime o tempo gasto e a quantidade de movimentos realizados.
Método resolverTorresDeHanoi:

Método recursivo que segue as regras do problema das Torres de Hanói:
Se há apenas um disco, move-o diretamente da origem para o destino.
Caso contrário, move n-1 discos da origem para a estaca auxiliar, move o disco restante para o destino, e finalmente move os n-1 discos da estaca auxiliar para o destino.
Execução:
Ao rodar o programa, ele mostrará cada movimento realizado, o tempo total gasto para a execução no formato HH:MM:SS:mm e a quantidade de movimentos realizados. Para evitar um grande número de saídas no console (especialmente com 64 discos), pode-se comentar ou ajustar os System.out.println dentro do método resolverTorresDeHanoi.


*/