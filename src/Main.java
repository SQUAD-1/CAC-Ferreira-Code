/*----------------------------------------CAC FERREIRA COSTA----------------------------------------------
*
--------------------------------DESENVOLVIDO POR WELLINGTON BRAGA x SQUAD1--------------------------------
 * 
 * ROTEIRO DE CÓDIGO
 * 
 * SISTEMA ADICIONAR 2 PRODUTOS V
 * SISTEMA CRIAR 2 SETORES V
 * SISTEMA REGISTRAR 1 LIGAÇÃO V
 * SISTEMA CRIAR 1 CLIENTE (CONTATO + ENDEREÇO) V
 * SISTEMA CRIAR 1 ATENDIMENTO V
 * SISTEMA PROCURAR POR 1 PRODUTO V
 * SISTEMA CRIAR 1 CHAMADO V
 * SISTEMA ENCERRAR LIGAÇÃO V
 * SISTEMA RESOLVER O PROBLEMA V
 * SISTEMA MANDAR EMAIL PARA O CLIENTE  V
 * SISTEMA FECHAR O CHAMADO V
 */

import Sistema.*;
import Entidades.*;
import Objetos.*;
import Attr.Ligacao;
import Grupos.*;

public class Main {
    public static void main(String[] args){
        Sistema sys = new Sistema();

        Atendente atend1 = new Atendente("José Vinícius", "josevini@fcxlabs.com.br", "fcx00421", "Atendimento", "PE");



        Produto prod1 = new Produto("KJF3631", "Smart TV LED 50 LG 4K/Ultra HD 50UQ8050PSB", 2699, "LG", 12, "Eletrodoméstico", "Ricardo Nunes");

        Produto prod2 = new Produto("KFJEICA", "Geladeira Refrigerador Consul Frost Free Duplex 410L", 3514, "Consul", 12, "Eletrodoméstico", "José Bonifácio");

        sys.addProduto(prod1);
        sys.addProduto(prod2);

        Setor log = sys.addSetor("Logística", "Ibiribeira");
        Setor Fin = sys.addSetor("Financeiro", "Ibiribeira");

        Ligacao call = new Ligacao("(81)99221-3421",atend1.getId());

        Cliente client1 = sys.criarCliente("Raoni Maciel", "24/11/1985", "709.154.945-12", "956.535-02");
        client1.setContato("(81)99221-3421", "raonimac@gmail.com");

        Atendimento atend = sys.abrirAtendimento(client1, "O eletrodoméstico Geladeira Refrigerador Consul Frost Free Duplex 410L, que estava previsto para ser entregue no dia 17/09/22, acabou não sendo entregue.", "Loja", log);

        sys.consulta("produto", "Smart TV LED 50 LG");

        Chamado chamado = sys.abrirChamado(client1, atend, "Reclamação", "Alto", "Alta");

        call.encerrar(atend1);

        atend1.enviarEmail(log, "Problema com entrega", "\nOlá equipe, tudo bem?\nGostaria de solicitar informações sobre a entrega do pedido n° 421-001004560. O cliente contatou pela segunda vez reclamando sobre seus produtos não entregues.\nAguardo o contato, atenciosamente.\n");

        sys.fecharChamado(chamado);

        atend1.enviarEmail(client1, "Geladeira a caminho", "\nOlá Raoni, tudo bem?\nEstou entrando em contato para lhe informar que a equipe de logística já está com seu produto e irá entregar no próximo dia útil.\nOk?\nPara mais informações pode entrar em contato pelo nosso email ou telefone.\nA Ferreira Costa agradece!\nAss: José Vinícius.\n");


        
    }
}
