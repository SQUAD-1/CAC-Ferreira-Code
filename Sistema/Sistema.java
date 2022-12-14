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

        public Atendimento abrirAtendimento(Cliente cliente, String motivo, String canal, Setor setor) throws SQLException{  /*Enviar informações da chamada no BD */
            c.createAtendimento(canal, motivo, canal, motivo, actions, actions, canal);
            Atendimento atendimento = new Atendimento(cliente,motivo, canal, setor);
            listaAtendimentos.add(atendimento);
            cliente.addListaAtendimentos(atendimento);
            return atendimento;
        }

        public Chamado abrirChamado(Cliente cliente, Atendimento atendimento, String tipo, String impacto, String prioridade){ /*Enviar informações da chamada no BD */
            Chamado chamado = new Chamado(cliente, atendimento, tipo, impacto, prioridade);
            listaChamados.add(chamado);
            cliente.addListaChamados(chamado);
            return chamado;
        }

        public void fecharChamado(Chamado chamado){  /*Mudar Status do chamado no BD para fechado */
            for (int i = 0; i < listaChamados.size(); i++){
                if (chamado == listaChamados.get(i)){
                    chamado.setSituacao("Fechado");
                    chamado.getCliente().getListaChamados().get(i).setSituacao("Fechado");
                }
            }
        }

        public void addProduto(Produto produto){ /*Enviar informações da chamada no BD */
            listaProdutos.add(new Produto( produto.getCodigo(), produto.getNome(), produto.getPreco(), produto.getFabricante(), produto.getGarantia(), produto.getCategoria(), produto.getResponsavelCompra()));
        }

        public Setor addSetor(String nome, String unidade){ /*Enviar informações da chamada no BD */
            Setor setor = new Setor(nome, unidade);
            listaSetores.add(setor);
            return setor;
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