/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Banco.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Banco.ConnectionClass;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lemontech
 */
public class ClienteDAO {
    public static String inserir(ClienteMODAL cliente)
            throws SQLException, Exception {
        String Retorno ="";
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
            connection = ConnectionClass.obterConexao();
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
            String erro = e.getLocalizedMessage();
            if(erro.contains("Duplicate entry")){
                if(erro.contains("CPF")){
                    Retorno="Esse CPF já existe no sistema!";
                }else if(erro.contains("RG")){
                    Retorno="Esse RG já existe no sistema!";
                }
            }else if(erro.contains("null")){
                Retorno = "Algum campo não foi preenchido";
            }else if(erro.contains("Communications link failure")){
                Retorno = "O servidor está indisponivel no momento";
            }
            return Retorno;
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
        Retorno = "Sucesso";
        return Retorno;
    }
    public static List<ClienteMODAL> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM Cliente";
        //Lista de clientes de resultado
        List<ClienteMODAL> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionClass.obterConexao();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<ClienteMODAL>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD

                int id = result.getInt("id");
                String nome = result.getString("nome");
                String dataNascimento = result.getString("DataDeNascimento");
                String cpf = result.getString("cpf");
                String rg = result.getString("rg");
                String cep = result.getString("cep");
                String complemento = result.getString("complemento");
                String cidade = result.getString("cidade");
                String estado = result.getString("estado");
                String endereco = result.getString("endereco");
                String telefone = result.getString("Telefone");
                String celular = result.getString("celular");
                String status  = result.getString("status");

                ClienteMODAL c = new ClienteMODAL(id, dataNascimento, status, nome, cpf, rg, cep, endereco, cidade, estado, telefone, celular);
                c.setID(id);
                //Adiciona a instância na lista
                listaClientes.add(c);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }

}
