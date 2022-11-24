package Objetos;

import java.util.*;
import java.time.LocalDateTime;
import Entidades.Cliente;
import Grupos.Setor;
import Attr.Evento;

public class Atendimento {

	public Atendimento(Cliente cliente, String motivo, String canal, Setor setor){
		n_atendimento = Atendimento.n_atendimento++;
		dataAtendimento = LocalDateTime.now();
		linhaDoTempo.add(new Evento("Atendimento iniciado em " + dataAtendimento, dataAtendimento));

		this.cliente = cliente;
		this.motivo = motivo;
		this.canal = canal;
		this.situacao = "Em andamento";
		this.setor.add(setor);
		this.chamado = false;
	}
	

	private static int n_atendimento;
	private Cliente cliente;
	private String motivo;
	private float sla_bruto;
	private String canal;
	private LocalDateTime dataAtendimento;
	private Pedido pedido;
	private List<Setor> setor = new ArrayList<>();
	private String resolucao;
	private String situacao;
	private boolean chamado;
	private List<Evento> linhaDoTempo = new ArrayList<>();
	
	public static int getN_atendimento() {
		return n_atendimento;
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
	public void alterMotivo(String motivo) {
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
	public LocalDateTime getDataAtendimento() {
		return dataAtendimento;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public List<Setor> getSetor() {
		return setor;
	}
	public void addSetor(Setor setor) {
		this.setor.add(setor);
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
	public boolean getChamado() {
		return chamado;
	}
	public void setChamado(boolean chamado) {
		this.chamado = chamado;
	}
	public List<Evento> getLinhaDoTempo() {
		return linhaDoTempo;
	}
	public void AddEvento(Evento evento) {
		this.linhaDoTempo.add(evento);
	}
}
