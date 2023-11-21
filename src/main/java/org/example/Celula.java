package org.example;

public class Celula {
    private int id;
    private Produto produto;

    
    public int retornaId() {
        return id;
    }

    public void defineId(int id) {
        this.id = id;
    }

    public Produto retornaProduto() {
        return produto;
    }

    public void defineProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
