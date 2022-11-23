package Entidades;

public abstract class Usuario {
    private static int id;
    private String nome;
    private String email;
    private String senha;
    private float classificação;
    private String equipe;
    
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Usuario.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public float getClassificação() {
        return classificação;
    }
    public void setClassificação(float classificação) {
        this.classificação = classificação;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
