package Attr;

public class Contato {

	Contato(String celular, String email, boolean wpp){
		
		this.id = Contato.id++;
		this.celular = celular;
		this.wpp = wpp;
		this.email = email;
	}

	public Contato(String celular, String email){
		
		this.id = Contato.id++;
		this.celular = celular;
		this.wpp = false;
		this.email = email;
	}
	
	private static int id;
	private String telefone;
	private String celular; 
	private boolean wpp;
	private String email;
	 
	public static int getId() { /*Fazer select de informação */
		return id;
	}
	public String getTelefone() { /*Fazer select de informação */
		return telefone;
	}
	public void alterTelefone(String telefone) { /*Fazer alter de informação */
		this.telefone = telefone;
	}
	public String getCelular() { /*Fazer select de informação */
		return celular;
	}
	public void alterCelular(String celular) { /*Fazer alter de informação */
		this.celular = celular;
	}
	public boolean isWpp() { /*Fazer select de informação */
		return wpp;
	}
	public void setWpp(boolean wpp) { /*Fazer alter de informação */
		this.wpp = wpp;
	}
	public String getEmail() { /*Fazer select de informação */
		return email;
	}
	public void alterEmail(String email) { /*Fazer alter de informação */
		this.email = email;
	}

	
}
