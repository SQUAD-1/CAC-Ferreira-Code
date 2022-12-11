package Attr;

public class Endereco{

	Endereco(String endereco, int numero, String cidade, String estado, String complemento, String pontoRef, String CEP){
		this.id = Endereco.id++;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.pontoRef = pontoRef;
		this.CEP = CEP;
	}

	Endereco(String endereco, int numero, String cidade, String estado, String CEP){
		this.id = Endereco.id++;

		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.CEP = CEP;
	}

	Endereco(String CEP){
		this.id = Endereco.id++;
		this.CEP = CEP;
	}
	
	
	private static int id;
	private String endereco;
	private int numero;
	private String cidade;
	private String estado;
	private String complemento;
	private String pontoRef;
	private String CEP;
	
	public static int getId() {  /*Fazer select de informação */
		return id;
	}
	public String getEndereco() {  /*Fazer select de estado */
		return endereco;
	}
	public void setEndereco(String endereco) { /*Fazer alter de informação  */
		this.endereco = endereco;
	}
	public int getNumero() {  /*Fazer select de informação */
		return numero;
	}
	public void setNumero(int numero) { /*Fazer alter de informação */
		this.numero = numero;
	}
	public String getCidade() { /*Fazer select de informação */
		return cidade;
	}
	public void setCidade(String cidade) { /*Fazer alter de informação */
		this.cidade = cidade;
	}
	public String getEstado() { /*Fazer select de informação */
		return estado;
	}
	public void setEstado(String estado) { /*Fazer alter de informação */
		this.estado = estado;
	}
	public String getComplemento() { /*Fazer select de informação */
		return complemento;
	}
	public void setComplemento(String complemento) { /*Fazer alter de informação */
		this.complemento = complemento;
	}
	public String getPontoRef() { /*Fazer select de informação */
		return pontoRef;
	}
	public void setPontoRef(String pontoRef) { /*Fazer alter de informação */
		this.pontoRef = pontoRef;
	}
	public String getCEP() { /*Fazer select de informação */
		return CEP;
	}
	public void setCEP(String CEP) { /*Fazer alter de informação */
		this.CEP = CEP;
	}
}
