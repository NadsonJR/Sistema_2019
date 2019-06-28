<%-- 
    Document   : LoadingPage
    Created on : 24/06/2019, 11:22:41
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

    <body onload="loading()">
        <!-- início do preloader -->
        <div id="preloader" >
            <div class="inner" >
                <!-- HTML DA ANIMAÇÃO MUITO LOUCA DO SEU PRELOADER! -->
                <div class="bolas">
                    <div></div>
                    <div></div>
                    <div></div>                    
                </div>
            </div>
        </div>
        <!-- fim do preloader --> 
    </body>
</html>

