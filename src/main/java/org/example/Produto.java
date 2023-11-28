package org.example;
import java.util.ArrayList;

public class Produto {

    public String nome;
    public double valor;
    public int codigo;

    // Constructors
    Produto(){
    }

    Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;

    }

    // Getters and Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getCodigo() {
        return codigo;
    }

    // Class methods
    public void diminuirQuantidade(){}

    public boolean verificarQuantidade(){
        return true;
    }




}
