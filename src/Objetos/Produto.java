package Objetos;

public class Produto {
	
	private String codigo;
	private String nome;
	private float preco;
	private String Modelo;
	private String fabricante;
	private int garantia;
	private String categoria;
	private String responsavelCompra;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getResponsavelCompra() {
		return responsavelCompra;
	}
	public void setResponsavelCompra(String responsavelCompra) {
		this.responsavelCompra = responsavelCompra;
	}
}