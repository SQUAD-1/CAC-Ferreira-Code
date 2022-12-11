package Objetos;

public class Produto {
	public Produto(String codigo, String nome, float preco, String modelo, String fabricante, int garantia, String categoria, String responsavelCompra){

		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.garantia = garantia;
		this.categoria = categoria;
		this.responsavelCompra = responsavelCompra;

	}

	public Produto(String codigo, String nome, float preco, String fabricante, int garantia, String categoria, String responsavelCompra){

		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.fabricante = fabricante;
		this.garantia = garantia;
		this.categoria = categoria;
		this.responsavelCompra = responsavelCompra;

	}

	public Produto(String nome, float preco, String fabricante, int garantia, String categoria, String responsavelCompra){

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
	
	public String getCodigo() { /*Fazer select da informação */
		return codigo;
	}
	public String getNome() { /*Fazer select da informação */
		return nome;
	}
	public void alterNome(String nome) { /*Fazer alter da informação */
		this.nome = nome;
	}
	public float getPreco() { /*Fazer select da informação */
		return preco;
	}
	public void alterPreco(float preco) { /*Fazer alter da informação */
		this.preco = preco;
	}
	public String getModelo() { /*Fazer select da informação */
		return modelo;
	}
	public void alterModelo(String modelo) { /*Fazer alter da informação */
		this.modelo = modelo;
	}
	public String getFabricante() { /*Fazer select da informação */
		return fabricante;
	}
	public void alterFabricante(String fabricante) { /*Fazer alter da informação */
		this.fabricante = fabricante;
	}
	public int getGarantia() { /*Fazer select da informação */
		return garantia;
	}
	public void alterGarantia(int garantia) { /*Fazer alter da informação */
		this.garantia = garantia;
	}
	public String getCategoria() { /*Fazer select da informação */
		return categoria;
	}
	public void alterCategoria(String categoria) { /*Fazer alter da informação */
		this.categoria = categoria;
	}
	public String getResponsavelCompra() { /*Fazer select da informação */
		return responsavelCompra;
	}
	public void alterResponsavelCompra(String responsavelCompra) { /*Fazer alter da informação */
		this.responsavelCompra = responsavelCompra;
	}
}