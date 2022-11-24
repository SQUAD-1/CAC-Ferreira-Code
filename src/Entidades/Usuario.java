package Entidades;

import Grupos.*;
public abstract class Usuario {

    //Atríbutos
    
    private static int id;
    private String nome;
    private String email;
    private String senha;
    private float classificação;
    private String equipe;
    private String estado;
    
    //Getters e Setters

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
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

    // Funções
    
    public void mensagem(Usuario destino, String mensagem){
        System.out.printf("Mensagem enviada para %s - '%s'\n", destino.getNome(), mensagem);
    }
    public void pausar(){
        this.estado = "Em pausa";
    }
    public void despausar(){
        this.estado = "Ativo";
    }
    public void enviarEmail(Usuario destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNome(), assunto, mensagem);
    }
    public void enviarEmail(Setor destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNome(), assunto, mensagem);
    }
    public void enviarEmail(Cliente destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNomeCompleto(), assunto, mensagem);
    }
    public void transferirLigação(Usuario destino){
        System.out.printf("\nA ligação foi transferida para %s - '%s\n--------------------------------------'\n", destino.getNome());
    }
}
