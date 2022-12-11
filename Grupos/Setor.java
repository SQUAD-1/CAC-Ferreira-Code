package Grupos;
import java.util.Dictionary;

public class Setor {

	public Setor(String nome, String unidade){
		this.nome = nome;
		this.unidade = unidade;
	}
	
	private static int id;
	private String nome;
	private String unidade;
	
	public static int getId() {  /*Fazer select da informação */
		return id;
	}
	public static void setId(int id) { /*Fazer alter da informação */
		Setor.id = id;
	}
	public String getNome() { /*Fazer select da informação */
		return nome;
	}
	public void setNome(String nome) { /*Fazer alter da informação */
		this.nome = nome;
	}
	public String getUnidade() { /*Fazer select da informação */
		return unidade;
	}
	public void setUnidade(String unidade) { /*Fazer alter da informação */
		this.unidade = unidade;
	}

	
}