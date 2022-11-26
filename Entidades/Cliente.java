package Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import Attr.Contato;
import Objetos.*;
import Attr.*;

public class Cliente {

	public Cliente(String nome, String dataNascimento, String CPF, String RG){
		id = Cliente.id ++;
		this.nomeCompleto = nome;
		this.dataNascimento = dataNascimento;
		this.CPF = CPF;
		this.RG = RG;
	}
	
	private static int id;
	private String nomeCompleto;
	private String dataNascimento;
	private String CPF;
	private String RG;
	private Contato contato;
	private List<Pedido> listaPedidos = new ArrayList<>();
	private List<Chamado> listaChamados = new ArrayList<>();
	private List<Atendimento> listaAtendimentos =  new ArrayList<>();
	
	public static int getId() {
		return id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void alterNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void alterDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void alterCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void alterRG(String rG) {
		RG = rG;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(String celular, String email) {
		this.contato = new Contato(celular, email);
	}
	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	public void addListaPedidos(Pedido Pedido) {
		this.listaPedidos.add(Pedido);
	}
	public List<Chamado> getListaChamados() {
		return listaChamados;
	}
	public void addListaChamados(Chamado Chamado) {
		this.listaChamados.add(Chamado);
	}
	public List<Atendimento> getListaAtendimentos() {
		return listaAtendimentos;
	}
	public void addListaAtendimentos(Atendimento Atendimento) {
		this.listaAtendimentos.add(Atendimento);
	}

	
}