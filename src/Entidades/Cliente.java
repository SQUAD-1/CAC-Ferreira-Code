package Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import Attr.Contato;
import Objetos.*;

public class Cliente {
	
	private static  int id;
	private String nomeCompleto;
	private Date dataNascimento;
	private String CPF;
	private String RG;
	private Contato contato;
	private List<Pedidos> listaPedidos = new ArrayList<>();
	private List<Chamado> listaChamados = new ArrayList<>();
	private List<Atendimentos> listaAtendimentos =  new ArrayList<>();
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Cliente.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public List<Pedidos> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(List<Pedidos> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	public List<Chamado> getListaChamados() {
		return listaChamados;
	}
	public void setListaChamados(List<Chamado> listaChamados) {
		this.listaChamados = listaChamados;
	}
	public List<Atendimentos> getListaAtendimentos() {
		return listaAtendimentos;
	}
	public void setListaAtendimentos(List<Atendimentos> listaAtendimentos) {
		this.listaAtendimentos = listaAtendimentos;
	}

	
}