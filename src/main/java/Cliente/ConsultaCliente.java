/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lemontech
 */
@WebServlet(name = "ConsultaCliente", urlPatterns = {"/ConsultaCliente"})
public class ConsultaCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        HttpSession sessao = request.getSession();

        try {
            List<ClienteMODAL> listaClientes = ClienteDAO.listar();
            request.setAttribute("listaClientes", listaClientes);
            sessao.setAttribute("listaClientes", listaClientes);
        } catch (Exception e) {
            System.out.println(e);
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("WEB_Pages/Cliente/Consulta.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("WEB_Pages/Cliente/Consulta.jsp");
        dispatcher.forward(request, response);
    }

}
