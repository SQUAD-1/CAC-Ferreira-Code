package API;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Crud {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public List<String> read(String tabela){
        String query = String.format("select * from %s", tabela);
        List<String> res = new ArrayList<>();
        try {
            conn = ConnectorDB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                res.add(rs.getString("Email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
        
    }

    public void create(String tabela){
        try {
            conn = ConnectorDB.getConnection();
            String param = null;
            switch (tabela) {
                case "funcionario":
                    param = "(idFuncionario, Salario, Cargo, Email, Senha, Telefone, CEP, Rua, Bairro, Cidade, Estado, Nome, Setores_idSetores)";
                    break;
                case "produto":
                    param = "(idProduto, Nome, Quantidade, Modelo, Fabricante, Preço, Categoria)";
                    break;
                case "cliente":
                    param = "(CPF, Telefone, Nome, CEP, Rua, Bairro, Cidade, Estado)";
                    break;
                case "setores":
                    param = "(idSetores, NomeSetor, NomeUnidade)";
                    break;
                case "chamado":
                    param = "(idChamado, Prioridade, Motivo, Canal, DataAbertura, SLA, Funcionario_idFuncionario, Cliente_CPF)";
                    break;
                case "venda":
                    param = "(idVenda, ValorTotal, Desconto, CupomFiscal, DataVenda, Produto_idProduto, Funcionario_idFuncionario)";
                    break;
                case "atendimento":
                    param = "(idAtendimento, Prioridade, Motivo, Canal, DataAbertura, SLA, Funcionario_idFuncionario, Cliente_CPF)";

            }

            pst = conn.prepareStatement(
                "INSERT INTO " + tabela + " " + param + "VALUES " + "()"
            );

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    public void createProduto(){
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO produto (Nome, Quantidade, Modelo, Fabricante, Preço, Categoria) VALUES " + "(?,?,?,?,?,?)"
            );
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createFuncionario(){

    }

}
