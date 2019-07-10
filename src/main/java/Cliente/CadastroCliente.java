/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lemontech
 */
@WebServlet(name = "CadastroCliente", urlPatterns = {"/CadastroCliente"})
public class CadastroCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("WEB_Pages/Cliente/Cadastro.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("Saiu aqui");
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String endereco = request.getParameter("endereco");
        String dataNascimento = request.getParameter("dataNascimento");
        String cep = request.getParameter("cep");
        String celular = request.getParameter("celular");
        String telefone = request.getParameter("telefone");
        String status = "Ativo";
        nome = nome + " "+sobrenome;
        endereco = endereco + " " + complemento; 
        ClienteMODAL c = new ClienteMODAL(dataNascimento, status, nome, cpf, rg, cep, endereco, cidade, estado, telefone, celular);
        try {
            String respostaServer = ClienteDAO.inserir(c);
            if(respostaServer.contains("Sucesso")){
                System.out.println("Foi");
                request.setAttribute("msgResposta", respostaServer);
            }else{
                request.setAttribute("msgResposta", respostaServer);
                System.out.println(respostaServer);
            }
        } catch (Exception e) {
            e.getLocalizedMessage();
            System.out.println(e);
        }
        request.setAttribute("cliente", c);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("WEB_Pages/Cliente/Consulta.jsp");
        dispatcher.forward(request, response);
    }

}
