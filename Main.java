/*      -------------------------------------------CAC FERREIRA COSTA---------------------------------------------
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
/* Código Antigo 
import Sistema.*;
import Entidades.*;
import Objetos.*;
import Grupos.*;

public class Main {
    public static void main(String[] args){
        int actions = 0;
        Sistema sys = new Sistema();

        sys.show("Criando atendente com a seguintes credenciais: ");
        sys.show("Nome: José Vínicus" +
                "Email: josevini@fcxlabs.com.br" +
                "Senha: fcx00421" +
                "Equipe: Atendimento" +
                "Estado do FC: PE");

        Funcionário atend1 = new Funcionário("José Vinícius", "josevini@fcxlabs.com.br", "fcx00421", "Atendimento", "PE");

        sys.show("Registrando produto no sistema: Smart TV LED 50 LG 4k/Ultra HD\n" +
                "Preço: 2699\n" +
                "Fabricante: LG\n" +
                "Garantia: 12 meses\n" +
                "Categoria: Eletrodoméstico\n" +
                "Responsável pela compra do produo na Ferreira Costa: Ricardo Nunes");

        Produto prod1 = new Produto("KJF3631", "Smart TV LED 50 LG 4K/Ultra HD 50UQ8050PSB", 2699, "LG", 12, "Eletrodoméstico", "Ricardo Nunes");

        sys.show("Registrando produto no sistema: Geladeira Refrigerador Consul Frost Free Duplex 410L" +
                "Preço: 3514" +
                "Fabricante: Consul" +
                "Garantia: 12 meses" +
                "Categoria: Eletrodoméstico" +
                "Responsável pela compra do produo na Ferreira Costa: José Bonifácio");

        Produto prod2 = new Produto("KFJEICA", "Geladeira Refrigerador Consul Frost Free Duplex 410L", 3514, "Consul", 12, "Eletrodoméstico", "José Bonifácio");

        sys.addProduto(prod1);
        sys.addProduto(prod2);

        sys.show("Produto(s) adicionado(s) no sistema com sucesso!");

        Setor log = sys.addSetor("Logística", "Ibiribeira");

        sys.show("Adicionando setor: Logística" +
                "Unidade: Ibiribeira");

        Setor Fin = sys.addSetor("Financeiro", "Ibiribeira");

        sys.show("Adicionando setor: Financeiro" +
                "Unidade: Ibiribeira");

        sys.show("Recebendo ligação do telefone: (81) 99221-3421");

        sys.show("Verificando número na base de dados");

        sys.show("O número não corresponde a nenhum cliente registrado na base de dados. Iniciando registro do cliente.");

        sys.show("Cliente: Raoni Maciel" +
                "Data de nascimento: 24/11/1985" +
                "CPF: 709.154.945-12" +
                "RG: 956.535-02");

        Cliente client1 = sys.criarCliente("Raoni Maciel", "24/11/1985", "709.154.945-12", "956.535-02");

        sys.show("Cliente: Raoni Maciel" +
                "Data de nascimento: 24/11/1985" +
                "CPF: 709.154.945-12" +
                "RG: 956.535-02");

        client1.setContato("(81)99221-3421", "raonimac@gmail.com");

        sys.show("Registrando contato" +
                "Celular: (81) 99221-3421" +
                "Email: raonimac@gmail.com");

        sys.show("Cliente registrado com sucesso!");

        Atendimento atend = sys.abrirAtendimento(client1, "O eletrodoméstico Geladeira Refrigerador Consul Frost Free Duplex 410L, que estava previsto para ser entregue no dia 17/09/22, acabou não sendo entregue.", "Loja", log);

        sys.show("Atendimento registrado com sucesso!");

        sys.show("Consultando produto no sistema: Smart TV LED 50 LG");

        sys.consulta("produto", "Smart TV LED 50 LG");

        Chamado chamado = sys.abrirChamado(client1, atend, "Reclamação", "Alto", "Alta");

        sys.show("Abindo chamada com as seguintes credenciais: " +
                "Chamado: 00001" +
                "Atendente responsável: José Vinícius" +
                "Tipo: Reclamação" +
                "Impacto: Alto" +
                "Prioridade: ALta");

        sys.show("Chamado registrado com sucesso!");

        sys.show("Encerrando ligação");

        sys.show("Ligação encerrada");

        sys.show("Enviando email para o setor responsável");

        atend1.enviarEmail(log, "Problema com entrega", "\nOlá equipe, tudo bem?\nGostaria de solicitar informações sobre a entrega do pedido n° 421-001004560. O cliente contatou pela segunda vez reclamando sobre seus produtos não entregues.\nAguardo o contato, atenciosamente.\n");

        sys.show("Setor responsável sinalizou chamado como Resolvido");

        sys.show("Fechando chamado");

        sys.fecharChamado(chamado);

        sys.show("Chamado fechado!");

        sys.show("Enviando email para o cliente");

        atend1.enviarEmail(client1, "Geladeira a caminho", "\nOlá Raoni, tudo bem?\nEstou entrando em contato para lhe informar que a equipe de logística já está com seu produto e irá entregar no próximo dia útil.\nOk?\nPara mais informações pode entrar em contato pelo nosso email ou telefone.\nA Ferreira Costa agradece!\nAss: José Vinícius.\n");

        sys.show("Email enviado com sucesso!");
    }
}*/

import java.io.IOException;
import java.sql.Connection;
import API.ConnectorDB;





public class Main{
        public static void main(String args[]) throws IOException{
                Connection conn = ConnectorDB.getConnection();
                ConnectorDB.closeConnection();
        }
}
