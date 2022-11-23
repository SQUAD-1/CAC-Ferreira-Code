package Attr;

public class Contato {
	
	private static int id;
	private String telefone;
	private String celular;
	private boolean wpp;
	private String email;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Contato.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
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
	public void setEmail(String email) {
		this.email = email;
	}

	
}
