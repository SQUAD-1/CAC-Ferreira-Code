package Attr;

import java.time.LocalDateTime;
import java.util.Date;

public class Evento {
	public Evento(String descricao, LocalDateTime dataAbertura){
		this.descricao = descricao;
		this.data = dataAbertura;
	}
	
	private String descricao;
	private LocalDateTime data;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
