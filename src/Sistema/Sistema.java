package Sistema;

import java.util.*;
import Objetos.*;
import Entidades.*;
import Grupos.*;
import Objetos.*;

public class Sistema {
    private List<Atendimento> listaAtendimentos = new ArrayList<>();
    private List<Chamado> listaChamados = new ArrayList<>();
    private List<Pedido> listaPedidos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Produto> listaProdutos = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Setor> listaSetores = new ArrayList<>();

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
                if (palavraChave.equals(produtos)){
                    result = (Object) produtos;
                }
                else{
                    System.out.println("Produto não encontrado");
                }
            }
        }

        else if(tipo.equals("cliente")){
            for (Cliente clientes : listaClientes){
                if (palavraChave.equals(clientes)){
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

        public void abrirAtendimento(Cliente cliente, String motivo, String canal, Setor setor, String descricao){

            listaAtendimentos.add(new Atendimento(cliente,motivo, canal, setor, descricao));
            cliente.addListaAtendimentos(listaAtendimentos.get(listaAtendimentos.size()-1));
        }

        public void abrirChamado(Cliente cliente, Atendimento atendimento String tipo, String tipo,  String prioridade){

            listaChamados.add(new Chamado(cliente, atendimento, tipo, impacto, prioridade));
            cliente.addListaChamados(listaChamados.get(listaChamados.size()-1));
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

        public void addSetor(String nome, String unidade){
            listaSetores.add( new Setor(nome, unidade));
        }

        public void addCliente(String nome, Date dataNascimento, String CPF, String RG){
            listaClientes.add(new Cliente(nome, dataNascimento, CPF, RG));
        }
        

        public void criarPedido(String notaFiscal, String canalVenda, String Unidade, List<Produto>listaProdutos)){
            listaPedidos.add(new Pedido(notaFiscal, canalVenda, Unidade, listaProdutos));

        }
    }
        