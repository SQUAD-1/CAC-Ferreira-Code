package Sistema;

import java.util.*;
import Objetos.*;
import Entidades.*;
import Grupos.*;
import Objetos.*;

public class Sistema {
    public Sistema(){
        System.out.println("Sistema criado!");
    }
    private List<Atendimento> listaAtendimentos = new ArrayList<>();
    private List<Chamado> listaChamados = new ArrayList<>();
    private List<Pedido> listaPedidos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Produto> listaProdutos = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Setor> listaSetores = new ArrayList<>();

    private int actions = 0;

    public boolean auth(String email, String senha){
        boolean authcheck = false;
        for (Usuario usuarios : listaUsuarios){
            if (email.equals(usuarios.getEmail()) && senha.equals(senha)){
                authcheck = true;
            }
        }
        return authcheck;
    }
    public Object consulta(String tipo, String palavraChave){
        Object result = new Object();

        if (tipo.equals("produto")){
            for (Produto produtos : listaProdutos){
                if (palavraChave.contains(produtos.getNome())){
                    result = (Object) produtos;
                    System.out.println("Produto encontrado!");
                }
                else{
                    System.out.println("Produto não encontrado");
                }
            }
        }

        else if(tipo.equals("cliente")){
            for (Cliente clientes : listaClientes){
                if (palavraChave.contains(clientes.getNomeCompleto())){
                    result = (Object) clientes;
                }
                else{
                    System.out.println("Produto não encontrado");
                }
            }
        }

        else if (tipo.equals("setor")){
            for (Setor setores : listaSetores){
                if (palavraChave.equals(setores)){
                    result = (Object) setores;
                }
            }
        }

        else{
             System.out.println("O tipo da consulta selecionado é inválido, escolha entre 'produto' e 'cliente'.");
            }
            return result;
        }
        public Atendimento abrirAtendimento(Cliente cliente, String motivo, String canal, Setor setor){
            Atendimento atendimento = new Atendimento(cliente,motivo, canal, setor);
            listaAtendimentos.add(atendimento);
            cliente.addListaAtendimentos(atendimento);
            return atendimento;
        }

        public Chamado abrirChamado(Cliente cliente, Atendimento atendimento, String tipo, String impacto, String prioridade){
            Chamado chamado = new Chamado(cliente, atendimento, tipo, impacto, prioridade);
            listaChamados.add(chamado);
            cliente.addListaChamados(chamado);
            return chamado;
        }

        public void fecharChamado(Chamado chamado){
            for (int i = 0; i < listaChamados.size(); i++){
                if (chamado == listaChamados.get(i)){
                    chamado.setSituacao("Fechado");
                    chamado.getCliente().getListaChamados().get(i).setSituacao("Fechado");
                }
            }
        }

        public void addProduto(Produto produto){
            listaProdutos.add(new Produto( produto.getCodigo(), produto.getNome(), produto.getPreco(), produto.getFabricante(), produto.getGarantia(), produto.getCategoria(), produto.getResponsavelCompra()));
        }

        public Setor addSetor(String nome, String unidade){
            Setor setor = new Setor(nome, unidade);
            listaSetores.add(setor);
            return setor;
        }

        public Cliente criarCliente(String nome, String dataNascimento, String CPF, String RG){
            Cliente cliente = new Cliente(nome, dataNascimento, CPF, RG);
            listaClientes.add(cliente);
            return cliente;
        }

        public void criarPedido(String notaFiscal, String canalVenda, String Unidade, List<Produto>listaProdutos){
            listaPedidos.add(new Pedido(notaFiscal, canalVenda, Unidade, listaProdutos));

        }

        public void show(String comentario){
        actions++;
        System.out.printf("\nEvento %d - %s\n", actions, comentario);
        }


    } 