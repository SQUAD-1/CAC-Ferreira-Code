package Attr;

public class Endereco {
	
	private static int id;
	private String endereco;
	private int numero;
	private String cidade;
	private String estado;
	private String complemento;
	private String pontoRef;
	private String CEP;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Endereco.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getPontoRef() {
		return pontoRef;
	}
	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String CEP) {
		CEP = CEP;
	}
}
