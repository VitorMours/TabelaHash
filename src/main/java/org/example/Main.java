package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    public static HashTable<Integer, Produto> listaHash = new HashTable<Integer, Produto>();
    public static String[] nomes = {"Papel","Grampeador","Livro","Caderno","Liquidificador","Camisa","Calça","Sapato"};

    private static int identificacao = 0;
    public static boolean condition = true;
    public static void main(String[] args) {
        addProducts();
        int acao = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("=== Black Friday da HashTable! ===\n");
            System.out.println("""
                               1 - Registrar Cliente:
                               2 - Fazer compra:
                               3 - Listar Produtos: """);
            System.out.println("\n==================================");
            System.out.print("Escolha oque você deseja fazer: ");

            acao = input.nextInt();
            System.out.println("==================================");
            switch(acao){
                case 1 -> registroCliente();
                case 2 -> comprarProduto();
                case 3 -> listarProdutos();
                case 4 -> gastarCupom();
            }
        }while(condition);


    }

    public static void registroCliente(){
        Scanner input = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        double saldo = 0;

        System.out.print("Qual o nome do usuário?");
        String nome = input.nextLine();

        System.out.println("Deseja registrar o saldo do usuário[S | N]?");
        System.out.print("Resposta: ");
        String gravarSaldo = input.next();

        if(gravarSaldo.equalsIgnoreCase("s")){
            System.out.print("Digite o saldo do cliente: ");
            saldo = input.nextDouble();
        }
        novoCliente.setSaldo(saldo);
        novoCliente.setNome(nome);
        System.out.println("""
                           Cliente registrado:
                           Nome: """+novoCliente.getNome()+"\nSaldo: "+novoCliente.getSaldo()+"\nIdentificação: "+novoCliente.getIdentificacao());
        novoCliente.setIdentificacao(identificacao);
        identificacao++;
        listaClientes.add(novoCliente);
    }
    
    public static void comprarProduto(){
        Cliente clienteComprador=null;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ID do usuário: ");
        int id = input.nextInt();
        for(Cliente cliente: listaClientes){
            if (cliente.getIdentificacao() == id){
                System.out.println("O cliente que deseja fazer a compra é:\n"
                        +"Nome: "+cliente.getNome()
                        +"\nSaldo: "+ cliente.getSaldo()+
                        "\nIdentificação: "+cliente.getIdentificacao()
                        );
                clienteComprador = cliente;
                break;
            }
        }
        System.out.println("\n==================================");

        System.out.println("Estes são os produtos que podem ser vendidos, suas identificações e seu estoque:");

        System.out.println(listaHash);

        System.out.println("Escolha um dos produtos: ");
        int produtoId = input.nextInt();
        Produto produtoComprado = listaHash.get(produtoId);
        System.out.println("O produto comprado foi: " + produtoComprado);
        clienteComprador.listaProdutoCliente.add(produtoComprado);


    }
    public static void listarProdutos(){
        Cliente clienteProcurado;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ID do usuário: ");
        int id = input.nextInt();
        for(Cliente cliente: listaClientes){
            if (cliente.getIdentificacao() == id){
                for(Produto produto: cliente.listaProdutoCliente){
                    System.out.println(produto);
                }
                break;
            }
        }


    }
    
    
    
    public static void gastarCupom(){
        System.out.println("Cupom gasto");

    }

    public static void addProducts(){
        int cont = 0;
        int valor = 10;
        for(int i = 0; i < nomes.length; i++){
            Produto produto = new Produto(nomes[i], valor);
            listaHash.put(cont,produto);
            cont++;
            valor = valor + 10;

        }






    }




}
