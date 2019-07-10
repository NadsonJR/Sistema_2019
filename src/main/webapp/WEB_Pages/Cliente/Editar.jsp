<%-- 
    Document   : Editar
    Created on : 10/07/2019, 10:52:53
    Author     : Lemontech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" type="text/css" href="Style/Nav.css">
        <link rel="stylesheet" type="text/css" href="Style/Main.css">
        <script src="Script/Jquery v3.4.1.js"></script>
        <script src="Script/mascara.min.js"></script>
        <script src="Script/Form.js"></script>
        <title>Editar Cliente</title>
    </head>
    <body id="main" class="bodyChange" >
        <div>
            <jsp:include page="../../WEB_Components/LoadingPage.jsp"/>
        </div>
        <jsp:include page="../../WEB_Components/Navbar.jsp" />

        <form name="formCad" id="FadeForm" class="form-type d-none text-center formMain" method="post" action="${pageContext.request.contextPath}/ClienteEditar" accept-charset="UTF-8">
            <div class="row justify-content-center">
                <div class="form-group">
                    <h2 class="title">
                        <img src="https://img.icons8.com/nolan/64/000000/gender-neutral-user.png">
                        Cliente
                    </h2>
                </div>
            </div>

            <div class="row justify-content-center">
                <div class="form-group col-8 ">
                    <label> Nome: </label>
                    <input type="text" class="form-control" placeholder="Nome" required name="nome" id="nome" maxlength="255" value="${cliente.nomeCompleto}">
                </div>
                <div class="form-group col-4 ">
                    <label> Data de Nascimento: </label>
                    <input type="text" class="cpf form-control data-mask" placeholder="dd/MM/yyyy" required name="dataNascimento" id="dataNascimento" maxlength="10" value="${cliente.datanascimento}" onkeypress="return onlynumber();" onkeyup="mascara('##/##/####', this, event)">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-6 ">
                    <label> CPF: </label>
                    <input type="text" class="cpf form-control" placeholder="###.###.###-##" required name="cpf" id="cpf" maxlength="14" value="${cliente.CPF}" onkeypress="return onlynumber();" onkeyup="mascara('###.###.###-##', this, event)">
                </div>
                <div class=" form-group col-6 ">
                    <label> R.G: </label>
                    <input type="text" class="form-control" placeholder="##.###.###-##" required name="rg" id="rg" maxlength="14" value="${cliente.RG}" onkeypress="return onlynumber();" onkeyup="mascara('##.###.###-##', this, event)">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-4 ">
                    <label> CEP: </label>
                    <input type="text" class="form-control" placeholder="00000-000" required name="cep" id="cep" maxlength="10" value="${cliente.cep}" onkeypress="return onlynumber();" onkeyup="mascara('#####-###', this, event)">
                </div>
                <div class="form-group col-4 ">
                    <label> Cidade: </label>
                    <input type="text" class="form-control" placeholder="Chicago" required name="cidade" id="cidade" maxlength="255" value="${cliente.cidade}" >
                </div>
                <div class="form-group col-4">
                    <label> Estado: </label>
                    <select class="form-control" name="estado" id="estado" required >
                        <option selected value="${cliente.estado}">${cliente.estado}</option>
                        <option value="Acre">Acre</option>
                        <option value="Alagoas">Alagoas</option>
                        <option value="Amapá">Amapá</option>
                        <option value="Amazonas">Amazonas</option>
                        <option value="Bahia">Bahia</option>
                        <option value="Ceará">Ceará</option>
                        <option value="Distrito Federal">Distrito Federal</option>
                        <option value="Espírito Santo">Espírito Santo</option>
                        <option value="Goiás">Goiás</option>
                        <option value="Maranhão">Maranhão</option>
                        <option value="Mato Grosso">Mato Grosso</option>
                        <option value="Mato Grosso do Sul">Mato Grosso do Sul</option>
                        <option value="Minas Gerais">Minas Gerais</option>
                        <option value="Pará">Pará</option>
                        <option value="Paraíba">Paraíba</option>
                        <option value="Paraná">Paraná</option>
                        <option value="Pernambuco">Pernambuco</option>
                        <option value="Piauí">Piauí</option>
                        <option value="Rio de Janeiro">Rio de Janeiro</option>
                        <option value="Rio Grande do Norte">Rio Grande do Norte</option>
                        <option value="Rio Grande do Sul">Rio Grande do Sul</option>
                        <option value="Rondônia">Rondônia</option>
                        <option value="Roraima">Roraima</option>
                        <option value="Santa Catarina">Santa Catarina</option>
                        <option value="São Paulo">São Paulo</option>
                        <option value="Sergipe">Sergipe</option>
                        <option value="Tocantins">Tocantins</option>
                    </select>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-8 ">
                    <label> Endereço: </label>
                    <input type="text" class="form-control" placeholder="1234 Main St" name="endereco" id="endereco" required maxlength="255" value="${cliente.endereco}">
                </div>
                <div class="form-group col-4">
                    <label> Complemento: </label>
                    <input type="text" class="form-control" placeholder="Apartament" name="complemento" id="complemento" required maxlength="20" >
                </div>
            </div>
            <div class="row ">
                <div class="form-group col-3">
                    <label> Telefone: </label>
                    <input type="text" class="form-control" placeholder="(00)0000-0000" name="telefone" id="telefone" required onkeypress="return onlynumber();" maxlength="20" value="${cliente.telefone}" onkeyup="mascara('(##)####-####', this, event)" >
                </div>
                <div class="form-group col-3">
                    <label> Celular: </label>
                    <input type="text" class="form-control" placeholder="(00)90000-0000" name="celular" id="celular" required onkeypress="return onlynumber();" maxlength="15" onkeyup="mascara('(##)#####-####', this, event)">
                </div>
            </div>
            <div class="row ">
                <div class ="form group col-8 ">
                </div>
                <div class ="form group col-2" id="classBtnForm">
                    <button type="reset" class="btn btn-primary" id="btn-form"> Cancelar </button>
                </div>
                <div class="form-group col-2 " id="classBtnForm">
                    <button type="submit" class="btn btn-primary" id="btn-form" data-toggle="modal" data-target="#modalResposta" > Salvar </button>
                </div>
            </div>
        </form>
    </body>
</html>
