/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lemontech
 */
public class ClienteDAO {
    public static boolean inserir(ClienteMODAL cliente)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO Cliente (Nome,DataDeNascimento,CPF,RG,CEP,Cidade,Estado,Endereco,Telefone,Celular,Status) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionBD.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, cliente.getNomeCompleto());
            preparedStatement.setString(2, cliente.getDatanascimento());
            preparedStatement.setString(3, cliente.getCPF());
            preparedStatement.setString(4, cliente.getRG());
            preparedStatement.setString(5, cliente.getCep());
            preparedStatement.setString(6, cliente.getCidade());
            preparedStatement.setString(7, cliente.getEstado());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getTelefone());
            preparedStatement.setString(10, cliente.getCelular());
            preparedStatement.setString(11, cliente.getStatus());

            //Executa o comando no banco de dados
            preparedStatement.execute();
        } catch (Exception e) {

            e.getLocalizedMessage();
            System.out.println(e);
            return false;
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return true;
    }
}
