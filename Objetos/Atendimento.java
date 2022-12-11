package Objetos;

import java.util.*;
import java.time.LocalDateTime;
import Entidades.Cliente;
import Grupos.Setor;

public class Atendimento {

	public Atendimento(Cliente cliente, String motivo, String canal, Setor setor){
		n_atendimento = Atendimento.n_atendimento++;
		dataAtendimento = LocalDateTime.now();

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
	
	
	public static int getN_atendimento() { /*Fazer select da informação */
		return n_atendimento;
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
	public void alterMotivo(String motivo) { /*Fazer alter da informação */
		this.motivo = motivo;
	}
	public float getSla_bruto() { /*Fazer select da informação */
		return sla_bruto;
	}
	public void setSla_bruto(float sla_bruto) { /*Fazer alter da informação */
		this.sla_bruto = sla_bruto;
	}
	public String getCanal() { /*Fazer select da informação */
		return canal;
	}
	public void setCanal(String canal) {  /*Fazer alter da informação */
		this.canal = canal;
	}
	public LocalDateTime getDataAtendimento() {
		return dataAtendimento;
	}
	public Pedido getPedido() { /*Fazer select da informação */
		return pedido;
	}
	public void setPedido(Pedido pedido) { /*Fazer alter da informação */
		this.pedido = pedido;
	}
	public List<Setor> getSetor() { /*Fazer select da informação */
		return setor;
	}
	public void addSetor(Setor setor) { /*Fazer alter da informação */
		this.setor.add(setor);
	}
	public String getResolucao() { /*Fazer select da informação */
		return resolucao;
	}
	public void setResolucao(String resolucao) { /*Fazer alter da informação */
		this.resolucao = resolucao;
	}
	public String getSituacao() { /*Fazer select da informação */
		return situacao;
	}
	public void setSituacao(String situacao) { /*Fazer alter da informação */
		this.situacao = situacao;
	}
	public boolean getChamado() { /*Fazer select da informação */
		return chamado;
	}
	public void setChamado(boolean chamado) {  /*Fazer alter da informação */
		this.chamado = chamado;
	}
}
