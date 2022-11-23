package Objetos;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import Entidades.Cliente;
import Grupos.Setor;
import Attr.Evento;

public class Atendimentos {
	private static int n_atendimento;
	private Cliente cliente;
	private String motivo;
	private float sla_bruto;
	private String canal;
	private Date dataAtendimento;
	private Pedidos pedido;
	private List<Setor> setor = new ArrayList<>();
	private String descricao;
	private String resolucao;
	private String situacao;
	private Chamado chamado;
	private List<Evento> linhaDoTempo = new ArrayList<>();
	
	public static int getN_atendimento() {
		return n_atendimento;
	}
	public static void setN_atendimento(int n_atendimento) {
		Atendimentos.n_atendimento = n_atendimento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public float getSla_bruto() {
		return sla_bruto;
	}
	public void setSla_bruto(float sla_bruto) {
		this.sla_bruto = sla_bruto;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public Pedidos getPedido() {
		return pedido;
	}
	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}
	public List<Setor> getSetor() {
		return setor;
	}
	public void setSetor(List<Setor>  setor) {
		this.setor = setor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Chamado getChamado() {
		return chamado;
	}
	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	public List<Evento> getLinhaDoTempo() {
		return linhaDoTempo;
	}
	public void setLinhaDoTempo(List<Evento> linhaDoTempo) {
		this.linhaDoTempo = linhaDoTempo;
	}
}
