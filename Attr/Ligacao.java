package Attr;

import Entidades.Usuario;

public class Ligacao {

    public Ligacao(String n_telefone, int id_agente){
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

    public static int getId() { /*Fazer select de informação */
        return id;
    }
    public int getDuracao() {   /*Fazer select de informação */
        return duracao;
    }
    public void setDuracao(int duracao) { /*Fazer alter de informação */
        this.duracao = duracao;
    }
    public String getN_telefone() { /*Fazer select de informação */
        return n_telefone;
    }
    public void setN_telefone(String n_telefone) { /*Fazer alter de informação */
        this.n_telefone = n_telefone;
    }
    public String getUnidadeLigação() { /*Fazer select de informação */
        return unidadeLigação;
    }
    public void setUnidadeLigação(String unidadeLigação) { /*Fazer alter de informação */
        this.unidadeLigação = unidadeLigação;
    }
    public int getId_agente() { /*Fazer select de informação */
        return id_agente;
    }
    public void setId_agente(int id_agente) { /*Fazer alter de informação */
        this.id_agente = id_agente;
    }
    public int getId_cliente() { /*Fazer select de informação */
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) { /*Fazer alter de informação */
        this.id_cliente = id_cliente;
    }

    //funções

    public boolean encerrar(Usuario agente){ /*Fazer ALTER de estado */
        System.out.printf("\nLigação com o número %s foi encerrada\n", n_telefone, null);
        this.estado = "Encerrado";
        return true;
    }
    public void emEspera(){ /*Fazer ALTER de estado */
        System.out.printf("\nLigação em espera\n");
        this.estado = "EmEspera";
    }
    public void retomar(){ /*Fazer ALTER de estado */
        System.out.printf("\nLigação em andamento\n");
        this.estado = "Em andamento";
    }
    public void transferir(Usuario destino){ /*Fazer ALTER de responsável*/
        System.out.printf("\nLigação foi transferida para %s\n", destino.getNome());
    }
}
