package Attr;

import Entidades.Usuario;

public class Ligacao {

    Ligacao(String n_telefone, int id_agente){
        this.id++;
        this.n_telefone = n_telefone;
        this.id_agente = id_agente;
        this.estado = "Em andamento";
    }

    //Atríbutos
    private static int id;
    private int duracao;
    private String n_telefone;
    private String unidadeLigação;
    private int id_agente;
    private int id_cliente;
    private String estado;

    //getters e setters

    public static int getId() {
        return id;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getN_telefone() {
        return n_telefone;
    }
    public void setN_telefone(String n_telefone) {
        this.n_telefone = n_telefone;
    }
    public String getUnidadeLigação() {
        return unidadeLigação;
    }
    public void setUnidadeLigação(String unidadeLigação) {
        this.unidadeLigação = unidadeLigação;
    }
    public int getId_agente() {
        return id_agente;
    }
    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    //funções

    public boolean encerrar(Usuario agente){
        System.out.printf("Ligação com o número %s foi encerrada\n", n_telefone, null);
        this.estado = "Encerrado";
        return true;
    }
    public void emEspera(){
        System.out.printf("Ligação em espera\n");
        this.estado = "EmEspera";
    }
    public void retomar(){
        System.out.printf("Ligação em andamento\n");
        this.estado = "Em andamento";
    }
    public void transferir(Usuario destino){
        System.out.printf("Ligação foi transferida para %s", destino.getNome());
    }
}
