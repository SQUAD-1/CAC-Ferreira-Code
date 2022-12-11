package Entidades;

import Grupos.*;
public class Funcionário {

    public Funcionário(String nome, String email, String senha, String equipe, String estado){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setEquipe(equipe);
        this.setEstado(estado);
        /*Insert no banco de dados */
        }
    //Atríbutos
    
    private static int id;
    private String nome;
    private String email;
    private String senha;
    private float classificação;
    private String equipe;
    private String estado;
    
    //Getters e Setters

    public String getEstado() { /*Fazer select da informação */
        return estado;
    }
    public void setEstado(String estado) { /*Fazer alter das informação */
        this.estado = estado;
    }
    public static int getId() { /*Fazer select da informação */
        return id;
    }
    public static void setId(int id) { /*Fazer alter das informação */
        Funcionário.id = id;
    }
    public String getNome() { /*Fazer select da informação */
        return nome;
    }
    public void setNome(String nome) { /*Fazer alter das informação */
        this.nome = nome;
    }
    public String getEmail() { /*Fazer select da informação */
        return email;
    }
    public void setEmail(String email) { /*Fazer alter das informação */
        this.email = email;
    }
    public String getSenha() { /*Fazer select da informação */
        return senha;
    }
    public void setSenha(String senha) { /*Fazer alter das informação */
        this.senha = senha;
    }
    public float getClassificação() { /*Fazer select da informação */
        return classificação;
    }
    public void setClassificação(float classificação) { /*Fazer alter das informação */
        this.classificação = classificação;
    }
    public String getEquipe() { /*Fazer select da informação */
        return equipe;
    }
    public void setEquipe(String equipe) { /*Fazer alter das informação */
        this.equipe = equipe; 
    }

    // Funções
    
    public void mensagem(Funcionário destino, String mensagem){
        System.out.printf("Mensagem enviada para %s - '%s'\n", destino.getNome(), mensagem);
    }
    public void pausar(){ /*Fazer alter de estado */
        this.estado = "Em pausa";
    }
    public void despausar(){ /*Fazer alter de estado */
        this.estado = "Ativo";
    }
    public void enviarEmail(Funcionário destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNome(), assunto, mensagem);
    }
    public void enviarEmail(Setor destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNome(), assunto, mensagem);
    }
    public void enviarEmail(Cliente destino, String assunto, String mensagem){
        System.out.printf("\nEmail enviado para %s\nAssunto: %s\n%s\n--------------------------------------\n",destino.getNomeCompleto(), assunto, mensagem);
    }
    public void transferirLigação(Funcionário destino){
        System.out.printf("\nA ligação foi transferida para %s - '%s\n--------------------------------------'\n", destino.getNome());
    }
}
