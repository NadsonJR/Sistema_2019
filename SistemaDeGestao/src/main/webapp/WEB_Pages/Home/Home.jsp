<%-- 
    Document   : Home
    Created on : 19/06/2019, 11:38:07
    Author     : Lemontech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Style/systemLoad.css">
        <script type="text/javascript" src="Script/systemLoad.js"></script>
        <title>JSP Page</title>
    </head>

    <body id="main" class="bodyChange" id="FadeForm" >
        <div>
            <jsp:include page="../../WEB_Components/LoadingPage.jsp"/>
        </div>    
        <jsp:include page="../../WEB_Components/Navbar.jsp" />
        <!-- início do preloader -->

        <!-- fim do preloader --> 
        <div class="text-center">
            <h1 class="introText">
                Bem-vindo
            </h1> 
        </div>

    </body>
</html>
