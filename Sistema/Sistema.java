package Sistema;

import java.util.*;
import Objetos.*;
import Entidades.*;
import Grupos.*;
import java.sql.Connection;
import java.sql.SQLException;

import API.ConnectorDB;
import API.Crud;

public class Sistema {
    public Sistema(){
        System.out.println("Sistema criado!");
        conn = ConnectorDB.getConnection();
        c = new Crud();
    }

    /*Todas as listas vão deixar de existir e o programa vai passar a fazer requisições ao BD */

    private List<Atendimento> listaAtendimentos = new ArrayList<>();
    private List<Chamado> listaChamados = new ArrayList<>();
    private List<Pedido> listaPedidos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Setor> listaSetores = new ArrayList<>();
    private List<Produto> listaProdutos = new ArrayList<>();
    Crud c;
    Connection conn;

    private int actions = 0; // Toda ação feita deve incrementar essa variável

    public boolean auth(String email) throws SQLException{
        boolean authcheck = false;
        
        for (String usuarios : c.read("funcionario")){
            if (email.equals(usuarios)){
                authcheck = true;
                System.out.println("Acesso permitido!");
            }
            
        }
        if (!authcheck){
            System.out.println("Acesso negado!");
        }
        return authcheck;
    }
    public Object consulta(String tipo, String palavraChave) throws SQLException{  
        Object result = new Object();

        if (tipo.equals("produto")){
            for (String produtos : c.read("produto")){
                if (palavraChave.contains(produtos)){
                    result = (Object) produtos;         // criar dicionário
                    System.out.println("Produto encontrado!");
                }
                else{
                    System.out.println("Produto não encontrado");
                }
            }
        }

        else if(tipo.equals("cliente")){
            for (String clientes : c.read("cliente")){
                if (palavraChave.contains(clientes)){
                    result = (Object) clientes;        // criar dicionário
                }
                else{
                    System.out.println("Produto não encontrado");
                }
            }
        }

        else if (tipo.equals("setor")){
            for (String setores : c.read("cliente")){
                if (palavraChave.equals(setores)){
                    result = (Object) setores;      // criar dicionário
                }
            }
        }

        else{
             System.out.println("O tipo da consulta selecionado é inválido, escolha entre 'produto' e 'cliente'.");
            }
            return result;
        }

        public boolean abrirAtendimento(String cpf, String motivo, String canal, String prioridade, String DataAbertura, float SLA, int idfuncionario) throws SQLException{  /*Enviar informações da chamada no BD */
            c.createAtendimento(prioridade, motivo, canal, DataAbertura, SLA, idfuncionario, cpf);
            return true;
        }

        public boolean abrirChamado(String cpf, String motivo, String canal, String dataAbertura, String prioridade, float SLA, int idFuncionario) throws SQLException{ /*Enviar informações da chamada no BD */
            c.createChamado(prioridade, motivo, canal, dataAbertura, SLA, idFuncionario, cpf);
            return true;
        }

        public void fecharChamado(Chamado chamado){  /*Mudar Status do chamado no BD para fechado */
            for (int i = 0; i < listaChamados.size(); i++){
                if (chamado == listaChamados.get(i)){
                    chamado.setSituacao("Fechado");
                    chamado.getCliente().getListaChamados().get(i).setSituacao("Fechado");
                }
            }
        }

        public boolean addProduto(String nome, int quantidade, String modelo, String fabricante, float preço, String categoria) throws SQLException{ /*Enviar informações da chamada no BD */
            c.createProduto(nome, quantidade, modelo, fabricante, preço, categoria);
            return true;
        }

        public boolean addSetor(String nome, String unidade) throws SQLException{ 
            c.createSetor(nome, unidade);
            return true;
        }

        public Cliente criarCliente(String nome, String dataNascimento, String CPF, String RG){ /*Enviar informações da chamada no BD */
            Cliente cliente = new Cliente(nome, dataNascimento, CPF, RG);
            listaClientes.add(cliente);
            return cliente;
        }

        public void criarPedido(String notaFiscal, String canalVenda, String Unidade, List<Produto>listaProdutos){ /*Enviar informações da chamada no BD */
            listaPedidos.add(new Pedido(notaFiscal, canalVenda, Unidade, listaProdutos));

        }

        public void show(String comentario){ 
        actions++;
        System.out.printf("\nEvento %d - %s\n", actions, comentario);
        }


    } 