package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Cliente> listaClientes;

    public static boolean condition = true;
    public static void main(String[] args) {
        int acao = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("=== Black Friday da HashTable! ===\n");
            System.out.println("1 - Registrar Cliente:" +
                               "\n2 - Fazer compra" +
                               "\n3 - Usar Cupom");
            System.out.println("==================================");
            System.out.print("Escolha oque você deseja fazer: ");

            acao = input.nextInt();
            System.out.println("==================================");
            switch(acao){
                case 1 -> registroCliente();
                case 2 -> comprarProduto();
                case 3 -> gastarCupom();
            }
        }while(condition);


    }

    public static void registroCliente(){
        Scanner input = new Scanner(System.in);
        Cliente novoCliente;
        double saldo;

        System.out.println("Qual o nome do usuário?");
        String nome = input.nextLine();

        System.out.println("Deseja registrar o saldo do usuário[S | N]?");
        System.out.print("Resposta: ");
        String gravarSaldo = input.next();

        if(gravarSaldo.equalsIgnoreCase("s")){
            System.out.println("Digite o saldo do cliente: ");
            saldo = input.nextDouble();
            novoCliente = new Cliente(nome, saldo);
        }else{
            novoCliente = new Cliente(nome);
        }
        System.out.println("Cliente registrado:" +"\nNome: "+novoCliente.getNome()+"\nSaldo: "+novoCliente.getSaldo());


    }
    public static void comprarProduto(){
        System.out.println("Produto comprado");
    }
    public static void gastarCupom(){
        System.out.println("Cupom gasto");

    }


























}