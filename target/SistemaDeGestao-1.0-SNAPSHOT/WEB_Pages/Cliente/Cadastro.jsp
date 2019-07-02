<%-- 
    Document   : Cadastro
    Created on : 19/06/2019, 14:28:32
    Author     : Lemontech
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="stylesheet" type="text/css" href="Style/Nav.css">
        <link rel="stylesheet" type="text/css" href="Style/Main.css">
        <title>Cadastro Cliente</title>
    </head>

    <body id="main" class="bodyChange" >
        <div>
            <jsp:include page="../../WEB_Components/LoadingPage.jsp"/>
        </div>
        <jsp:include page="../../WEB_Components/Navbar.jsp" />

        <form name="formCad" id="FadeForm" class="form-type d-none text-center formMain" method="post" action="${pageContext.request.contextPath}/CadastroCliente" accept-charset="UTF-8">
            <div class="row justify-content-center">
                <div class="form-group">
                    <h2 class="title">
                        <img src="https://img.icons8.com/nolan/64/000000/gender-neutral-user.png">
                        Cliente
                    </h2>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-6 ">
                    <label> Nome: </label>
                    <input type="text" class="form-control" placeholder="Nome" required name="nome" id="nome" maxlength="255">
                </div>
                <div class="form-group col-6 ">
                    <label> Sobrenome: </label>
                    <input type="text" class="form-control" placeholder="Sobrenome" required name="sobrenome" id="sobrenome" maxlength="255">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-4 ">
                    <label> CPF: </label>
                    <input type="text" class="cpf form-control" placeholder="###.###.###-##" required name="cpf" id="cpf" maxlength="14" onkeypress="return onlynumber();" onkeyup="mascara('###.###.###-##', this, event)">
                </div>
                <div class=" form-group col-4 ">
                    <label> R.G: </label>
                    <input type="text" class="form-control" placeholder="##.###.###-##" required name="rg" id="rg" maxlength="14"onkeypress="return onlynumber();" onkeyup="mascara('##.###.###-##', this, event)">
                </div>
                <div class="form-group col-4 ">
                    <label> Data de Nascimento: </label>
                    <input type="text" class="cpf form-control data-mask" placeholder="dd/MM/yyyy" required name="dataNascimento" id="dataNascimento" maxlength="10"  onkeypress="return onlynumber();" onkeyup="mascara('##/##/####', this, event)">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-4 ">
                    <label> CEP: </label>
                    <input type="text" class="form-control" placeholder="00000-000" required name="cep" id="cep" maxlength="10" onkeypress="return onlynumber();" onkeyup="mascara('#####-###', this, event)">
                </div>
                <div class="form-group col-4 ">
                    <label> Cidade: </label>
                    <input type="text" class="form-control" placeholder="Chicago" required name="cidade" id="cidade" maxlength="255">
                </div>
                <div class="form-group col-4">
                    <label> Estado: </label>
                    <select class="form-control" name="estado" id="estado" required >
                        <option selected>Escolha...</option>
                        <option value="AC">Acre</option>
                        <option value="AL">Alagoas</option>
                        <option value="AP">Amapá</option>
                        <option value="AM">Amazonas</option>
                        <option value="BA">Bahia</option>
                        <option value="CE">Ceará</option>
                        <option value="DF">Distrito Federal</option>
                        <option value="ES">Espírito Santo</option>
                        <option value="GO">Goiás</option>
                        <option value="MA">Maranhão</option>
                        <option value="MT">Mato Grosso</option>
                        <option value="MS">Mato Grosso do Sul</option>
                        <option value="MG">Minas Gerais</option>
                        <option value="PA">Pará</option>
                        <option value="PB">Paraíba</option>
                        <option value="PR">Paraná</option>
                        <option value="PE">Pernambuco</option>
                        <option value="PI">Piauí</option>
                        <option value="RJ">Rio de Janeiro</option>
                        <option value="RN">Rio Grande do Norte</option>
                        <option value="RS">Rio Grande do Sul</option>
                        <option value="RO">Rondônia</option>
                        <option value="RR">Roraima</option>
                        <option value="SC">Santa Catarina</option>
                        <option value="SP">São Paulo</option>
                        <option value="SE">Sergipe</option>
                        <option value="TO">Tocantins</option>
                    </select>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-8 ">
                    <label> Endereço: </label>
                    <input type="text" class="form-control" placeholder="1234 Main St" name="endereco" id="endereco" required maxlength="255">
                </div>
                <div class="form-group col-4">
                    <label> Complemento: </label>
                    <input type="text" class="form-control" placeholder="Apartament" name="complemento" id="complemento" required maxlength="20">
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="form-group col-6 ">
                    <label> E-mail: </label>
                    <input type="text" class="form-control" placeholder="example@example.com" name="email" id="email" required maxlength="40">
                </div>
                <div class="form-group col-3">
                    <label> Telefone: </label>
                    <input type="text" class="form-control" placeholder="(00)0000-0000" name="telefone" id="telefone" required onkeypress="return onlynumber();" maxlength="20" onkeyup="mascara('(##)####-####', this, event)">
                </div>
                <div class="form-group col-3">
                    <label> Celular: </label>
                    <input type="text" class="form-control" placeholder="(00)90000-0000" name="celular" id="celular" required onkeypress="return onlynumber();" maxlength="15" onkeyup="mascara('(##)#####-####', this, event)">
                </div>
            </div>
            <div class="row ">
                <div class ="form group col-8 ">
                </div>
                <div class ="form group col-sm-2" id="classBtnForm">
                    <button type="reset" class="btn btn-primary" id="btn-form"> Cancelar </button>
                </div>
                <div class="form-group col-sm-2 " id="classBtnForm">
                    <button type="submit" class="btn btn-primary" id="btn-form" data-toggle="modal" data-target="#modalResposta" > Salvar </button>
                </div>
            </div>
        </form>
    </body>
</html>

