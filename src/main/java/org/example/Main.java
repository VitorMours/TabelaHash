package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Cliente> listaClientes;
    private static int identificacao = 0;
    public static boolean condition = true;
    public static void main(String[] args) {
        int acao = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("=== Black Friday da HashTable! ===\n");
            System.out.println("""
                               1 - Registrar Cliente:
                               2 - Fazer compra: 
                               3 - Usar Cupom: """);
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
        System.out.println("""
                           Cliente registrado:
                           Nome: """+novoCliente.getNome()+"\nSaldo: "+novoCliente.getSaldo());
        novoCliente.setIdentificacao(identificacao);
        identificacao++;
        listaClientes.add(novoCliente);
    }
    
    public static void comprarProduto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ID do usuário");
        int id = input.nextInt();
        for(Cliente cliente: listaClientes){
            if (cliente.getIdentificacao() == id){
                System.out.println("O cliente que deseja fazer a compra é:\n"
                        +"nome"+cliente.getNome()
                        );
            }
        
                
        }


        
    }
    
    
    
    
    public static void gastarCupom(){
        System.out.println("Cupom gasto");

    }


























}
