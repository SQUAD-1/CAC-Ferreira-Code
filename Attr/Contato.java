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
	
	public static int getId() {
		return id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void alterTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void alterCelular(String celular) {
		this.celular = celular;
	}
	public boolean isWpp() {
		return wpp;
	}
	public void setWpp(boolean wpp) {
		this.wpp = wpp;
	}
	public String getEmail() {
		return email;
	}
	public void alterEmail(String email) {
		this.email = email;
	}

	
}
