package Entidades;

import java.util.List;
import java.util.ArrayList;
import Attr.Contato;
import Objetos.*;

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
	
	public static int getId() { /*Fazer select da informação */
		return id;
	}
	public String getNomeCompleto() { /*Fazer select da informação */
		return nomeCompleto;
	}
	public void alterNomeCompleto(String nomeCompleto) { /*Fazer alter das informação */
		this.nomeCompleto = nomeCompleto;
	}
	public String getDataNascimento() { /*Fazer select da informação */
		return dataNascimento;
	}
	public void alterDataNascimento(String dataNascimento) { /*Fazer alter das informação */
		this.dataNascimento = dataNascimento;
	}
	public String getCPF() { /*Fazer select da informação */
		return CPF;
	}
	public void alterCPF(String CPF) { /*Fazer alter das informação */
		this.CPF = CPF;
	}
	public String getRG() {  /*Fazer select da informação */
		return RG;
	}
	public void alterRG(String RG) { /*Fazer alter das informação */
		this.RG = RG;
	}
	public Contato getContato() { /*Fazer select da informação */
		return contato;
	}
	public void setContato(String celular, String email) { /*Fazer alter das informação */
		this.contato = new Contato(celular, email);
	}
	public List<Pedido> getListaPedidos() { /*Fazer select das informações com o mesmo id do cliente*/
		return listaPedidos;
	}
	public void addListaPedidos(Pedido Pedido) {  /*Fazer alter da informação */
		this.listaPedidos.add(Pedido);
	}
	public List<Chamado> getListaChamados() { /*Fazer select da informação */
		return listaChamados;
	}
	public void addListaChamados(Chamado Chamado) { /*Fazer alter da informação */
		this.listaChamados.add(Chamado);
	}
	public List<Atendimento> getListaAtendimentos() { /*Fazer select das informações com o mesmo id do cliente*/
		return listaAtendimentos;
	}
	public void addListaAtendimentos(Atendimento Atendimento) { /*Fazer alter da informação */
		this.listaAtendimentos.add(Atendimento);
	}

	
}