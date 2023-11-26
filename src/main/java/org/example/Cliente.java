package org.example;
import java.util.ArrayList;

public class Cliente {

    public int identificacao;
    public String nome;
    public double saldo;
    private ArrayList<Cupom> listaCupomCliente;
    public ArrayList<Produto>listaProdutoCliente;

    //Constructors
    public Cliente(){
    }
    public Cliente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public Cliente(String nome){
        this.nome = nome;
        System.out.println(Main.listaClientes);

    }


    // Getters and Setters
    public void setIdentificacao(int identificacao){
        this.identificacao = identificacao;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdentificacao(){return this.identificacao;}
    public String getNome(){return this.nome;}
    public double getSaldo(){return this.saldo;}



    public void adicionarProdutoCarrinho(Produto novoProduto){
        listaProdutoCliente.add(novoProduto);

    }
    public void removerProdutoCarrinho(){}
    public void listarCompras(){
        System.out.println("Produtos comprados pelo cliente: "+this.nome+"-"+this.identificacao);
        for(Produto produto: listaProdutoCliente){
            System.out.println(produto.getNome() + " " + produto.getValor());
        }
    }
}
