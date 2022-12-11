package Entidades;

public class Atendente extends Usuario{
    public Atendente(String nome, String email, String senha, String equipe, String estado){
    this.setNome(nome);
    this.setEmail(email);
    this.setSenha(senha);
    this.setEquipe(equipe);
    this.setEstado(estado);
    }

    /*Adiconar insert das informações dentro do construtor */
}
