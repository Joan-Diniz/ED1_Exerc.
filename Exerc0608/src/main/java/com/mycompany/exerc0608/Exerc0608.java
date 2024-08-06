/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerc0608;

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

public class Exerc0608 {
    
    
    /*################################################################################
   
Questão 1) Escreva uma função recursiva que determine quantas vezes um dígito K ocorre em um número
natural N. Por exemplo, o dígito 2 ocorre 3 vezes em 762021192.
    
    ################################################################################*/

    public static void main(String[] args) {
        long number = 762021192;
        int digit = 2;
        int count = countOccurrences(number, digit);
        System.out.println("O dígito " + digit + " ocorre " + count + " vezes em " + number);
    }

    public static int countOccurrences(long number, int digit) {
        if (number == 0) {
            return 0;
        }
        long lastDigit = number % 10;
        if (lastDigit == digit) {
            
            return 1 + countOccurrences(number / 10, digit);
        } else {
            
            return countOccurrences(number / 10, digit);
        }
    }
    
    /*################################################################################
   
Questão 2) O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma
definição recursiva:
● MDC(x, y) = MDC(x − y, y), se x > y
● MDC(x,y) = MDC(y,x)
● MDC(x,x) = x
    
    ################################################################################*/
    
    /*public static void main(String[] args) {
        int x = 69;
        int y = 24;
        int mdc = calcularMDC(x, y);
        System.out.println("O MDC de " + x + " e " + y + " é: " + mdc);
    }

    public static int calcularMDC(int x, int y) {
        if (x == y) {
            return x; 
        } else if (x > y) {
            return calcularMDC(x - y, y); 
        } else {
            return calcularMDC(y, x); 
        }
    }*/
    
    /*################################################################################
   
Questão 3) Pode-se calcular o resto da divisão, MOD, de x por y, dois números inteiros positivos, usando-se a
seguinte definição:
● MOD(x,y) = MOD(x - y, y) se x > y
● MOD(x,y) = x se x < y
● MOD(x,y) = 0 se x = y
    
    ################################################################################*/
    
    
     /*public static void main(String[] args) {
        int x = 24; 
        int y = 69;  

        int resultado = calcularMod(x, y);
        System.out.println("MOD(" + x + ", " + y + ") = " + resultado);
    }

    public static int calcularMod(int x, int y) {
        if (x > y) {
            return calcularMod(x - y, y);
        } else if (x < y) {
            return x;
        } else {
            return 0;
        }
    }*/
    
        /*################################################################################
   
Questão 4) Um problema típico em ciência da computação consiste em converter um número da sua forma
decimal para a forma binária.
    
    ################################################################################*/
    
    
     /*public static void main(String[] args) {
        int decimalNumber = 69; 

        System.out.println("Decimal: " + decimalNumber);
        System.out.print("Binary: ");
        convertToBinaryUsingArrays(decimalNumber);
    }

    public static void convertToBinaryUsingArrays(int n) {
        int[] binaryArray = new int[1000];
        int i = 0;

        while (n > 0) {
            binaryArray[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }
    }*/
    
/*################################################################################
   
Questão 5) Implementar uma Lista Simplesmente encadeada ordenada, usando POO, com pelo menos 5
elementos. A estrutura da lista é dada a seguir:
classe No{
int info;
No prox;
... // Incluir os métodos necessários para o funcionamento da lista
}
classe Lista{
No cabeça;
int tamanho;
... // Incluir os métodos necessários para o funcionamento da lista
}

As Operações que a aplicação deve implementar na Lista Simplesmente encadeada:
. Inicializar a lista
. Verificar se lista é vazia
. Inserir um dado elemento
. Remover um dado elemento
. Tamanho: retorna o número de elementos da lista

. Iguais: recebe duas listas ordenadas e verifica se elas são iguais
. Média: retorna a média aritmética simples dos elementos da lista
. Busca: verifica se um dado valor é pertencente à lista
. Elimina: elimina todas as ocorrências de um dado elemento
. Elimina_ : elimina um elemento que está em uma dada posição definida pelo usuário. (Obs.: É importante
verificar se a posição é válida)
. Insere na direita: insere um dado valor à direita do -ésimo elemento da lista. (Obs.: É importante verificar se a
posição é válida)
. Insere na esquerda: insere um dado valor à esquerda do -ésimo elemento da lista. (Obs.: É importante verificar
se a posição é válida)
    
################################################################################*/ 
   
     /*public static void main(String[] args) {
        Lista lista = new Lista();

        // Inserir elementos na lista
        lista.inserir(10);
        lista.inserir(5);
        lista.inserir(20);

        // Imprimir a lista
        System.out.println("Lista:");
        lista.imprimir();

        // Verificar se a lista está vazia
        System.out.println("Lista vazia? " + lista.estaVazia());

        // Remover um elemento
        lista.remover(5);

        // Imprimir a lista novamente
        System.out.println("Lista após remover:");
        lista.imprimir();

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }*/
   
/*##############################################################################
   
Questão 6) Dado duas listas dinâmicas simplesmente encadeadas (com 50 elementos aleatórios (de -100 a
100) em cada lista e usando a mesma estrutura do item 1) com ordenação,L1 e L2, crie um algoritmo que irá
gerar uma terceira lista com as seguintes características:
. Inverter: recebe uma lista, L1 ou L2, e retorna uma nova lista L3, formada pelos elementos da lista recebida na
ordem inversa.
. Retornar ímpares: recebe as listas L1 e L2 e retorna uma nova lista L3, formada apenas com os elementos
ímpares das duas listas.
. Concatena: recebe as listas L1 e L2 e retorna uma nova lista L3 formada pela concatenação entre a lista L1 e
L2.
. Conjunto intersecção: gerar uma terceira lista com a intersecção entre os números da primeira e da segunda
lista.
. Intercalar 1: a função recebe as duas listas ordenadas e retorna a lista com os elementos das duas listas
intercalados conforme a ordem com que elas se dispõe na lista.
. Intercalar 2 (ordenadamente): o módulo recebe as duas listas ordenadas e retorna a lista com os elementos
das duas listas intercalados, porém obedecendo a ordem crescente dos números.
    
##############################################################################*/
    
    /*public static void main(String[] args) {
        Lista2 lista1 = new Lista2();
        lista1.adicionar(1);
        lista1.adicionar(3);
        lista1.adicionar(5);

        Lista2 lista2 = new Lista2();
        lista2.adicionar(2);
        lista2.adicionar(4);
        lista2.adicionar(6);

        Lista2 listaIntercalada = lista1.intercalarOrdenadoCrescente(lista1, lista2);

        No2 atual = listaIntercalada.inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
    }*/
    
}
