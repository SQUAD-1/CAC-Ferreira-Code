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

    public List<String> read(String tabela) throws SQLException{
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
        finally {
            st.close();
            ConnectorDB.closeConnection();
        }
        return res;
        
    }

    public void createProduto(String nome, float quantidade, String modelo, String fabricante, float preço, String categoria) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO produto (Nome, Quantidade, Modelo, Fabricante, Preço, Categoria) VALUES " + 
                "(?,?,?,?,?,?)"
            );

            pst.setString(1, nome);
            pst.setFloat(2, quantidade);
            pst.setString(3, modelo);
            pst.setString(4, fabricante);
            pst.setFloat(5, preço);
            pst.setString(6, categoria);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }

    public void createFuncionario(String nome, float salario, String cargo, String email, String senha, String telefone, //implementar referência de setores 
    String cep, String rua, String bairro, String cidade, String estado /*, String setor*/) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO funcionario ( Nome, Salario, Cargo, Email, Senha, Telefone, CEP, Rua, Bairro, Cidade, Estado, Setores_idSetores) VALUES " + 
                "(?,?,?,?,?,?,?,?,?)"
            );

            pst.setString(1, nome);
            pst.setFloat(2, salario);
            pst.setString(3, cargo);
            pst.setString(4, email);
            pst.setString(5, senha);
            pst.setString(6, telefone);
            pst.setString(7, cep);
            pst.setString(8, rua);
            pst.setString(7, bairro);
            pst.setString(8, cidade);
            pst.setString(9, estado);
            /*pst.setString(10, setor);*/
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }

    public void createCliente(String cpf, String nome, String telefone, String cep, String rua, String bairro, String cidade, String estado) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO cliente (CPF, Telefone, Nome, CEP, Rua, Bairro, Cidade, Estado) VALUES " + 
                "(?,?,?,?,?,?,?,?)"
            );

            pst.setString(1, cpf);
            pst.setString(2, nome);
            pst.setString(3, telefone);
            pst.setString(4, cep);
            pst.setString(5, rua);
            pst.setString(6, bairro);
            pst.setString(7, cidade);
            pst.setString(8, estado);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }

    public void createSetor(String setor, String unidade) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO setor (NomeSetor, NomeUnidade) VALUES " + 
                "(?,?)"
            );

            pst.setString(1, setor);
            pst.setString(2, unidade);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }
    
    public void createChamado(String prioridade, String motivo, String canal, String dataAbertura, float SLA, int idFuncionario, String Cliente_CPF) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO chamado (Prioridade, Motivo, Canal, DataAbertura, SLA, Funcionario_idFuncionario, Cliente_CPF) VALUES " + 
                "(?,?,?,?,?,?,?)"
            );

            pst.setString(1, prioridade);
            pst.setString(2, motivo);
            pst.setString(3, canal);
            pst.setString(4, dataAbertura); //verificar conversão
            pst.setFloat(5, SLA);
            pst.setInt(6, idFuncionario);
            pst.setString(7, Cliente_CPF);

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }
    
    public void createPedido(float ValorTotal, float Desconto, String CupomFiscal, String DataVenda, int idProduto, int idFuncionario) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO pedido (ValorTotal, Desconto, CupomFiscal, DataVenda, Produto_idProduto, Funcionario_idFuncionario) VALUES " + 
                "(?,?,?,?,?,?)"
            );

            pst.setFloat(1, ValorTotal);
            pst.setFloat(2, Desconto);
            pst.setString(3, CupomFiscal);
            pst.setString(4, DataVenda); //verificar conversão
            pst.setInt(5, idProduto);
            pst.setInt(6, idFuncionario);

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }

    public void createAtendimento(String prioridade, String motivo, String canal, String DataAbertura, float SLA, int idFuncionario, String CPF) throws SQLException{
        try {
            conn = ConnectorDB.getConnection();
            pst = conn.prepareStatement(
                "INSERT INTO atendimento (Prioridade, Motivo, Canal, DataAbertura, SLA, Funcionario_idFuncionario, Cliente_CPF) VALUES " + 
                "(?,?,?,?,?,?,?)"
            );

            pst.setString(1, prioridade);
            pst.setString(2, motivo);
            pst.setString(3, canal);
            pst.setString(4, DataAbertura); //verificar conversão
            pst.setFloat(5, SLA);
            pst.setInt(6, idFuncionario);
            pst.setString(7, CPF);

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            pst.close();
            ConnectorDB.closeConnection();
        }
    }
}
