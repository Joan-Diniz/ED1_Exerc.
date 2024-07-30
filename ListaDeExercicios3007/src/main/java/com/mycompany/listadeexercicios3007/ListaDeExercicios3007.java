/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios3007;

/**
 *
 * @author joanp
 */

/**
################################################################################
################################################################################
 *  O METODO DE EXECUÇAO E SIMPLES
 *  AO COMEÇO E FINAL DE CADA MAIN TEM UMA BARRA E UM ASTERISCO
 *  REMOVENDO SE EXECUTA A QUESTAO 
 *  TODA QUESTAO TEM SEU NUMERO E DESCRIÇAO ANTES DA MAIN 
################################################################################
################################################################################ 
 * */
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ListaDeExercicios3007 {
    
    /**
################################################################################
################################################################################
 * Questao 1 
 * Escreva um programa solicite ao usuário uma sequência de caracteres sem
limite de máximo de tamanho e realize as seguintes operações usando uma pilha:
a) Imprimir o texto na ordem inversa;
b) Verificar se o texto é um palíndromo, ou seja, se a string é escrita da mesma
maneira de frente para trás e de trás para frente. Ignore espaços e pontos.
################################################################################
################################################################################ 
 * */

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência de caracteres:");
        String input = scanner.nextLine();

        // Criar uma pilha para armazenar os caracteres
        Stack<Character> stack = new Stack<>();

        // Empilhar os caracteres da entrada
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Desempilhar e imprimir os caracteres na ordem inversa
        System.out.print("Texto na ordem inversa: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();

        // Verificar se a string é um palíndromo
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < cleanInput.length() / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("A sequência é um palíndromo.");
        } else {
            System.out.println("A sequência não é um palíndromo.");
        }
   }

/**
################################################################################
################################################################################
 *Questao 2 
 * Utilizando somente operações de empilhar e desempilhar, escreva um programa que
remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução
da função, a pilha deve ser igual à original, exceto pela ausência do item removido.
################################################################################
################################################################################ 
 * */

/*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // Preencha a pilha com alguns elementos (apenas para demonstração)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Digite a chave do item a ser removido:");
        int chave = scanner.nextInt();

        // Criar uma pilha temporária para armazenar os elementos
        Stack<Integer> tempStack = new Stack<>();

        // Desempilhar os elementos da pilha original até encontrar a chave
        while (!stack.isEmpty()) {
            int elemento = stack.pop();
            if (elemento == chave) {
                break; // Encontrou a chave, parar de desempilhar
            }
            tempStack.push(elemento); // Armazenar temporariamente os elementos
        }

        // Reempilhar os elementos de volta na pilha original (exceto a chave)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        System.out.println("Pilha após a remoção da chave " + chave + ": " + stack);
    }*/
    
/**
################################################################################
################################################################################
 *Questao 3 
 * Escreva um programa que simule o controle de uma pista de decolagem de aviões
em um aeroporto. Neste programa, o usuário deve ser capaz de realizar as
seguintes tarefas: 
* a) Listar o número de aviões aguardando na fila de decolagem; 
* b)Autorizar a decolagem do primeiro avião da fila; 
* c) Adicionar um avião à fila deespera; 
* d) Listar todos os aviões na fila de espera; 
* e) Listar as características do primeiro avião da fila. 
* Considere que os aviões possuem um nome e um número inteiro como identificador.
################################################################################
################################################################################ 
 * */
    
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Aviao> filaEspera = new LinkedList<>();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar avião à fila de espera");
            System.out.println("2. Listar número de aviões aguardando na fila de decolagem");
            System.out.println("3. Autorizar decolagem do primeiro avião da fila");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar características do primeiro avião da fila");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o código do avião: ");
                    int codigo = scanner.nextInt();
                    filaEspera.add(new Aviao(nome, codigo));
                    break;
                case 2:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaEspera.size());
                    break;
                case 3:
                    if (!filaEspera.isEmpty()) {
                        Aviao primeiroAviao = filaEspera.poll();
                        System.out.println("Decolagem autorizada para " + primeiroAviao);
                    } else {
                        System.out.println("Nenhum avião na fila de espera.");
                    }
                    break;
                case 4:
                    System.out.println("Aviões na fila de espera:");
                    for (Aviao aviao : filaEspera) {
                        System.out.println(aviao);
                    }
                    break;
                case 5:
                    if (!filaEspera.isEmpty()) {
                        Aviao primeiroAviao = filaEspera.peek();
                        System.out.println("Características do primeiro avião da fila:");
                        System.out.println(primeiroAviao);
                    } else {
                        System.out.println("Nenhum avião na fila de espera.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }*/
    
    /**
################################################################################
################################################################################
    QUESTAO 4
    Considere que existe uma fila F1 com 100 números aleatórios. Faça uma função que
inverta uma fila F1, criando-se uma nova fila F2.
################################################################################
################################################################################ 
 * */
    
    /*public static void main(String[] args) {
        Queue<Integer> filaF1 = new LinkedList<>();
        filaF1.add(10);
        filaF1.add(20);
        filaF1.add(30);
        // ... adicione mais elementos à fila F1

        Queue<Integer> filaF2 = inverterFila(filaF1);

        System.out.println("Fila F1 original: " + filaF1);
        System.out.println("Fila F2 invertida: " + filaF2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> filaOriginal) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Desempilhar os elementos da fila e empilhar na pilha
        while (!filaOriginal.isEmpty()) {
            pilhaAuxiliar.push(filaOriginal.poll());
        }

        // Criar uma nova fila e reenfileirar os elementos da pilha
        Queue<Integer> filaInvertida = new LinkedList<>();
        while (!pilhaAuxiliar.isEmpty()) {
            filaInvertida.add(pilhaAuxiliar.pop());
        }

        return filaInvertida;
    }*/
    
    /**
################################################################################
################################################################################
    QUESTAO 5
    Dado uma Fila de números distintos F e uma Pilha P. Sorteie 1000 números
aleatórios e insira na fila F. Caso o número já esteja presente na Fila F, o número
deve ser inserido na Pilha P. Após sortear os 1000 números, imprimir a Fila F e a
Pilha P.
################################################################################
################################################################################ 
 * */
    
   /* public static void main(String[] args) {
        Queue<Integer> filaF = new LinkedList<>();
        Stack<Integer> pilhaP = new Stack<>();
        Set<Integer> numerosSorteados = new HashSet<>();

        Random random = new Random();

        // Sorteio de 1000 números aleatórios
        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(10000); // Intervalo de 0 a 9999
            if (numerosSorteados.contains(numeroSorteado)) {
                pilhaP.push(numeroSorteado);
            } else {
                filaF.add(numeroSorteado);
                numerosSorteados.add(numeroSorteado);
            }
        }

        // Imprimir a Fila F
        System.out.println("Fila F:");
        for (int numero : filaF) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Imprimir a Pilha P
        System.out.println("Pilha P:");
        while (!pilhaP.isEmpty()) {
            System.out.print(pilhaP.pop() + " ");
        }
        System.out.println();
    }*/
    
     /**
################################################################################
################################################################################
    QUESTAO 6
    Sorteie 2000 números, sendo 1000 positivos e 1000 negativos e coloque numa fila.
Cada vez que o número positivo estiver no início da fila, este deve ser retirado da fila
e empilhado numa pilha. Cada vez que um número negativo estiver no início da fila,
o número que estiver no topo da pilha deve ser impresso e retirado.
################################################################################
################################################################################ 
 * */
     
    /*public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        // Sorteio de 1000 números positivos e 1000 negativos
        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(2000) - 1000; // Intervalo de -1000 a 999
            fila.add(numeroSorteado);
        }

        while (!fila.isEmpty()) {
            int numero = fila.poll();
            if (numero >= 0) {
                pilha.push(numero);
            } else {
                if (!pilha.isEmpty()) {
                    int topoPilha = pilha.pop();
                    System.out.println("Número negativo " + numero + ": Topo da pilha = " + topoPilha);
                } else {
                    System.out.println("Número negativo " + numero + ": Pilha vazia.");
                }
            }
        }

        // Imprimir os números restantes na pilha (se houver)
        while (!pilha.isEmpty()) {
            System.out.println("Número positivo no topo da pilha: " + pilha.pop());
        }
    }*/
    
    /**
################################################################################
################################################################################
    QUESTAO 7
    Escreva um método para inverter a ordem dos elementos de uma fila de 20 posições
de inteiros, usando uma pilha como estrutura auxiliar.
################################################################################
################################################################################ 
 * */
    
    /*public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        // Preenchendo a fila com 20 números aleatórios (para fins de exemplo)
        for (int i = 0; i < 20; i++) {
            fila.add((int) (Math.random() * 100)); // Números de 0 a 99
        }

        // Invertendo a ordem dos elementos usando a pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        // Enfileirando de volta na fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        // Imprimindo a fila invertida
        System.out.println("Fila invertida:");
        while (!fila.isEmpty()) {
            System.out.print(fila.poll() + " ");
        }
    }*/
    
    /**
################################################################################
################################################################################
    QUESTAO 8
    sorteie 1000 números variando entre -100 a 100. Crie uma classe chamada
TestaPilha que vai conter duas pilhas (objetos N e P) respectivamente, Realizar as
seguintes operações:
− se positivo, inserir na pilha P;
− se negativo, inserir na pilha N;
− se zero, retirar um elemento de cada pilha e imprimir esses números.
################################################################################
################################################################################ 
 * */
    
    /*public static void main(String[] args) {
        Stack<Integer> pilhaN = new Stack<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();

        // Sorteio de 1000 números aleatórios entre -100 e 100
        for (int i = 0; i < 1000; i++) {
            int numeroSorteado = random.nextInt(201) - 100; // Intervalo de -100 a 100
            if (numeroSorteado > 0) {
                pilhaP.push(numeroSorteado);
            } else if (numeroSorteado < 0) {
                pilhaN.push(numeroSorteado);
            }
        }

        // Retirar um elemento de cada pilha e imprimir
        while (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
            int elementoP = pilhaP.pop();
            int elementoN = pilhaN.pop();
            System.out.println("Elemento retirado da pilha P: " + elementoP);
            System.out.println("Elemento retirado da pilha N: " + elementoN);
        }
    }*/
    
}



