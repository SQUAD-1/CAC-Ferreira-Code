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
	
	public String getDescricao() { /*Fazer select de informação */
		return descricao;
	}
	public void setDescricao(String descricao) { /*Fazer alter de informação */
		this.descricao = descricao;
	}
	public LocalDateTime getData() { /*Fazer select de informação */
		return data;
	}
	public void setData(LocalDateTime data) { /*Fazer alter de informação */
		this.data = data;
	}
	
	
}
