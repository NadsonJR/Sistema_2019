<%-- 
    Document   : Consulta
    Created on : 08/07/2019, 10:50:51
    Author     : Lemontech
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" type="text/css" href="Style/Nav.css">
        <link rel="stylesheet" type="text/css" href="Style/Main.css">
        <script src="Script/Jquery v3.4.1.js"></script>
        <script src="Script/mascara.min.js"></script>
        <script src="Script/Form.js"></script>
        <title>Consulta Cliente</title>
    </head>

    <body id="main" class="bodyChange" >
        <div>
            <jsp:include page="../../WEB_Components/LoadingPage.jsp"/>
        </div>
        <jsp:include page="../../WEB_Components/Navbar.jsp" />
        <form name="formCad" id="FadeForm" class="form-type d-none text-center formMain" action ="${pageContext.request.contextPath}/ConsultaCliente" method = "post" >
            <div class="row justify-content-center">
                <h2>Consulta</h2>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-10 ">
                    <label> CPF do Cliente: </label>
                    <input type="text" class="form-control" placeholder="000.000.000-00" id="nome" name="nome" onkeypress="return onlynumber();" onkeyup="mascara('###.###.###-##', this, event)">
                </div>

                <div class="form-group col-2">
                    <button type="submit" class="btn form-control btn-primary btn-pesquisar" id="btn-form" style="margin-top: 30px;">Pesquisar</button>
                </div>
            </div>

            <br>
            <div class="row justify-content-center">
                <div class="form-group col-12">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar" id="style-1">
                        <table class="table ">
                            <tr>
                                <th scope="col">Nome</th>
                                <th scope="col">CPF</th>
                                <th scope="col">Status</th>
                                <th scope="col">Opções</th>
                            </tr>

                            <tbody>
                                <%-- primeiro form ignorado pelo metodo! --%>
                            <form method="get" action="${pageContext.request.contextPath}/ClienteEditar">
                                <input type="hidden" value="${cliente.getID()}" name="id">
                            </form>

                            <%--<c:set var="${listaClientes}" scope="result" value="${null}"/>--%>
                            <%-- primeiro form ignorado pelo metodo! --%>
                            <c:forEach items ="${listaClientes}" var="cliente" begin="0">
                                <tr>
                                    <td><c:out value="${cliente.getNomeCompleto()}"/></td>
                                    <td><c:out value="${cliente.getCPF()}"/></td>
                                    <td><c:out value="${cliente.getStatus()}"/></td>
                                    <td>
                                        <div>
                                            <form method="get" action="${pageContext.request.contextPath}/ClienteEditar">
                                                <input type="hidden" value="${cliente.getID()}" name="id">
                                                <button class="btn form-control btn-primary btn-editar" id="btn-form" type="submit"><i class="far fa-edit"></i></button>
                                            </form>
                                        </div>    
                                    </td>
                                    <td><form  method="post" action="${pageContext.request.contextPath}/ClienteExcluir">
                                            <input type="hidden" value="${cliente.getID()}" name="ID">
                                            <button class="btn form-control btn-primary btn-excluir" id="btn-form" type="submit"><i class="fas fa-times"></i></button>                                        
                                        </form>
                                    </td>    
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>          
            </div>

        </form>
    </body> 
</html>
