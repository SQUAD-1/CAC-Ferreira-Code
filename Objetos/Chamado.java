package Objetos;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import Entidades.Cliente;
import Grupos.Setor;
import Attr.*;

public class Chamado {

	public Chamado(Cliente cliente, String motivo, String canal, String prioridade, String tipo, Setor setor, String impacto, String descricao, Atendimento atendimento){
		idChamado = Chamado.idChamado++;
		dataAbertura = LocalDateTime.now();
		linhaDoTempo.add(new Evento("Chamada criada em " + dataAbertura, dataAbertura));

		this.cliente = cliente;
		this.motivo = motivo;
		this.canal = canal;
		this.prioridade = prioridade;
		this.tipo = tipo;
		this.setor.add(setor);
		this.impacto = impacto;
		this.descricao = descricao;
		this.atendimento.add(atendimento);
	}

	public Chamado(Cliente cliente, Atendimento atendimento, String tipo, String impacto, String prioridade){
		idChamado = Chamado.idChamado++;
		dataAbertura = LocalDateTime.now();
		linhaDoTempo.add(new Evento("Chamada criada em " + dataAbertura, dataAbertura));

		this.cliente = cliente;
		this.motivo = atendimento.getMotivo();
		this.canal = atendimento.getCanal();
		this.prioridade = prioridade;
		this.tipo = tipo;
		this.setor = atendimento.getSetor();
		this.impacto = impacto;
		this.atendimento.add(atendimento);
	}
	
	private static int idChamado;
	private Cliente cliente;
	private String motivo;
	private String canal;
	private String prioridade;
	private LocalDateTime dataAbertura;
	private Pedido pedido;
	private String tipo;
	private List<Setor> setor = new ArrayList<>(); /*Excluir lista */
	private String impacto;
	private String descricao;
	private String observacao;
	private List<Atendimento> atendimento = new ArrayList<>(); /*Mudar para array de int, para receber somente os ids dos atendimentos referentes a esse chamado */
	private String situacao;
	private List<Evento> linhaDoTempo = new ArrayList<>(); /*Mudar para array de int, para receber somente os ids dos eventos referentes a esse chamado */
	
	public static int getIdChamado() { /*Fazer select da informação */
		return idChamado;
	}
	public Cliente getCliente() { /*Fazer select da informação */
		return cliente;
	}
	public void alterCliente(Cliente cliente) { /*Fazer alter da informação */
		this.cliente = cliente;
	}
	public String getMotivo() { /*Fazer select da informação */
		return motivo;
	}
	public void setMotivo(String motivo) { /*Fazer alter da informação */
		this.motivo = motivo;
	}
	public String getCanal() { /*Fazer select da informação */
		return canal;
	}
	public void alterCanal(String canal) { /*Fazer alter da informação */
		this.canal = canal;
	}
	public String getPrioridade() { /*Fazer select da informação */
		return prioridade;
	}
	public void setPrioridade(String prioridade) { /*Fazer alter da informação */
		this.prioridade = prioridade;
	}
	public LocalDateTime getDataAbertura() { /*Fazer select da informação */
		return dataAbertura;
	}
	public Pedido getPedido() { /*Fazer select da informação */
		return pedido;
	}
	public void alterPedido(Pedido pedido) { /*Fazer alter da informação */
		this.pedido = pedido;
	}
	public String getTipo() { /*Fazer select da informação */
		return tipo;
	}
	public void setTipo(String tipo) { /*Fazer alter da informação */
		this.tipo = tipo;
	}
	public List<Setor> getSetor() {  /*Fazer select da informação */
		return setor;
	}
	public void setSetor(Setor setor) { /*Fazer alter da informação */
		this.setor.add(setor);
	}
	public String getImpacto() { /*Fazer select da informação */
		return impacto;
	}
	public void setImpacto(String impacto) { /*Fazer alter da informação */
		this.impacto = impacto;
	}
	public String getDescricao() { /*Fazer select da informação */
		return descricao;
	}
	public void setDescricao(String descricao) { /*Fazer alter da informação */
		this.descricao = descricao;
	}
	public String getObservacao() { /*Fazer select da informação */
		return observacao;
	}
	public void setObservacao(String observacao) { /*Fazer alter da informação */
		this.observacao = observacao;
	}
	public List<Atendimento> getAtendimento() { /*Fazer select da informação */
		return atendimento;
	}
	public void addAtendimento(Atendimento atendimento) { /*Adicionar o id do atendimento */
		this.atendimento.add(atendimento);
	}
	public String getSituacao() { /*Fazer select da informação */
		return situacao;
	}
	public void setSituacao(String situacao) { /*Fazer alter da informação */
		this.situacao = situacao;
	}
	public List<Evento> getLinhaDoTempo() { /*Fazer select de todos os eventos com o id do chamado*/
		return linhaDoTempo;
	}
	public void AddLinhaDoTempo(Evento evento) { /*Adicionar o id da chamado no evento*/
		this.linhaDoTempo.add(evento);
	}
}