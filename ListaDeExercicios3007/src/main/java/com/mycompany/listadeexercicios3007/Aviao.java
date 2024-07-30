/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3007;

/**
 *
 * @author joanp
 */
public class Aviao {
    private String nome;
    private int codigo;

    public Aviao(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Avião " + nome + " (Código: " + codigo + ")";
    }
}
    

