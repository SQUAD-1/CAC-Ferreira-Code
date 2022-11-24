package Objetos;

public class Produto {
	Produto(String codigo, String nome, float preco, String modelo, String fabricante, int garantia, String categoria, String responsavelCompra){

		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.garantia = garantia;
		this.categoria = categoria;
		this.responsavelCompra = responsavelCompra;

	}

	Produto(String codigo, String nome, float preco, String fabricante, int garantia, String categoria, String responsavelCompra){

		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.fabricante = fabricante;
		this.garantia = garantia;
		this.categoria = categoria;
		this.responsavelCompra = responsavelCompra;

	}

	Produto(String nome, float preco, String fabricante, int garantia, String categoria, String responsavelCompra){

		//criar função para criar o código do produto

		this.nome = nome;
		this.preco = preco;
		this.fabricante = fabricante;
		this.garantia = garantia;
		this.categoria = categoria;
		this.responsavelCompra = responsavelCompra;

	}
	
	private String codigo;
	private String nome;
	private float preco;
	private String modelo;
	private String fabricante;
	private int garantia;
	private String categoria;
	private String responsavelCompra;
	
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void alterNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void alterPreco(float preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}
	public void alterModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void alterFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getGarantia() {
		return garantia;
	}
	public void alterGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void alterCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getResponsavelCompra() {
		return responsavelCompra;
	}
	public void alterResponsavelCompra(String responsavelCompra) {
		this.responsavelCompra = responsavelCompra;
	}
}