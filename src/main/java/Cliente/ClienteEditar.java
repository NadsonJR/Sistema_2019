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
@WebServlet(name = "ClienteEditar", urlPatterns = {"/ClienteEditar"})
public class ClienteEditar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        int ID = Integer.parseInt(request.getParameter("id"));
        ClienteMODAL c = null;
        try {
            c = ClienteDAO.procurarId(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("id", ID);
        request.setAttribute("cliente", c);
        System.out.println( c.getNomeCompleto());
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("WEB_Pages/Cliente/Editar.jsp");
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
