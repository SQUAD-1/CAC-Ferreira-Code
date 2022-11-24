package Objetos;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import Entidades.Cliente;
import Grupos.Setor;
import Attr.*;

public class Chamado {

	public Chamado(Cliente cliente, String motivo, String canal, String prioridade, String tipo, Setor setor, String impacto, String descricao, Atendimento atendimento){
		nChamado = Chamado.nChamado++;
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
		nChamado = Chamado.nChamado++;
		dataAbertura = LocalDateTime.now();
		linhaDoTempo.add(new Evento("Chamada criada em " + dataAbertura, dataAbertura));

		this.cliente = cliente;
		this.motivo = atendimento.getMotivo();
		this.canal = atendimento.getCanal();
		this.prioridade = prioridade;
		this.tipo = tipo;
		this.setor = atendimento.getSetor();
		this.impacto = impacto;
		this.descricao = atendimento.getDescricao();
		this.atendimento.add(atendimento);
	}
	
	private static int nChamado;
	private Cliente cliente;
	private String motivo;
	private String canal;
	private String prioridade;
	private LocalDateTime dataAbertura;
	private Pedido pedido;
	private String tipo;
	private List<Setor> setor = new ArrayList<>();
	private String impacto;
	private String descricao;
	private String observacao;
	private List<Atendimento> atendimento = new ArrayList<>();
	private String situacao;
	private List<Evento> linhaDoTempo = new ArrayList<>();
	
	public static int getnChamado() {
		return nChamado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void alterCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getCanal() {
		return canal;
	}
	public void alterCanal(String canal) {
		this.canal = canal;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void alterPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Setor> getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor.add(setor);
	}
	public String getImpacto() {
		return impacto;
	}
	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public List<Atendimento> getAtendimento() {
		return atendimento;
	}
	public void addAtendimento(Atendimento atendimento) {
		this.atendimento.add(atendimento);
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public List<Evento> getLinhaDoTempo() {
		return linhaDoTempo;
	}
	public void AddLinhaDoTempo(Evento evento) {
		this.linhaDoTempo.add(evento);
	}
}