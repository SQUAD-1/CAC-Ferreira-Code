package Objetos;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import Entidades.Cliente;
import Grupos.Setor;
import Attr.Evento;

public class Chamado {
	
	private static int nChamado;
	private Cliente cliente;
	private String motivo;
	private float slaBruto;
	private float slaLiquido;
	private String canal;
	private String prioridade;
	private Date dataAbertura;
	private Pedidos pedido;
	private String tipo;
	private List<Setor> setor = new ArrayList<>();
	private String impacto;
	private String descricao;
	private String observacao;
	private List<Atendimentos> atendimentos = new ArrayList<>();
	private String situacao;
	private List<Evento> linhaDoTempo = new ArrayList<>();
	
	public static int getnChamado() {
		return nChamado;
	}
	public static void setnChamado(int nChamado) {
		Chamado.nChamado = nChamado;
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
	public float getSlaBruto() {
		return slaBruto;
	}
	public void setSlaBruto(float slaBruto) {
		this.slaBruto = slaBruto;
	}
	public float getSlaLiquido() {
		return slaLiquido;
	}
	public void setSlaLiquido(float slaLiquido) {
		this.slaLiquido = slaLiquido;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Pedidos getPedido() {
		return pedido;
	}
	public void setPedido(Pedidos pedido) {
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
	public void setSetor(List<Setor> setor) {
		this.setor = setor;
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
	public List<Atendimentos> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<Atendimentos> atendimentos) {
		this.atendimentos = atendimentos;
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
	public void setLinhaDoTempo(List<Evento> linhaDoTempo) {
		this.linhaDoTempo = linhaDoTempo;
	}
}