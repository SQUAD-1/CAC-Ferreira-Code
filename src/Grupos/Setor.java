package Grupos;
import java.util.Dictionary;

public class Setor {
	
	private static int id;
	private String nome;
	private String unidade;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Setor.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	
}