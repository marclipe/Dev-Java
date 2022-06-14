<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Usuario"%>
<%@page import="projetomusica.controller.ControllerUsuario"%>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario usuEntrada = new Usuario(login,senha);
    ControllerUsuario usucont = new ControllerUsuario();
    Usuario usuSaida = usucont.validarWeb(usuEntrada);
    session.setAttribute("UsuarioLogado",usuSaida);
%>


<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>SISTEMA </title>
    <body>
        <% if (usuSaida != null) { %>
            <!-- Dropdown1 Trigger -->
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown1'>Manter Usuário</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown2'>Manter Clientes</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown3'>Manter Compras</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown4'>Manter Instrumentos</a>
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown5'>Manter Acessorios</a>
            
            <% if (usuSaida.getTipo().equals("ADM")) { %>
                <!-- Dropdown1 Structure -->
                <ul id='dropdown1' class='dropdown-content'>
                    <li><a href="../usuario/inserirUsuario.jsp"> InseriUsuario</a></li>
                    <li><a href="../usuario/consultarUsuario.jsp"> ConsultaUsuarioParametro </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown1' class='dropdown-content'>
                    <li><a href="../usuario/consultarUsuario.jsp"> ConsultaUsuarioParametro </a></li>
                </ul>
            <% } %>
            <% if (usuSaida.getTipo().equals("ADM")) { %>
                <!-- Dropdown2 Structure -->
                <ul id='dropdown2' class='dropdown-content'>
                    <li><a href="../clientes/inserirClientes.jsp"> InseriCliente </a></li>
                    <li><a href="../clientes/consultarClientes.jsp"> ConsultaCliente </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown2' class='dropdown-content'>
                    <li><a href="../clientes/consultarClientes.jsp"> ConsultaCliente </a></li>
                </ul>
            <% } %>
            <% if (usuSaida.getTipo().equals("ADM")) { %>
                <!-- Dropdown3 Structure -->
                <ul id='dropdown3' class='dropdown-content'>
                    <li><a href="../compras/inserirRelacaoCompras.jsp"> InseriCompras </a></li>
                    <li><a href="../compras/consultarRelacaoCompras.jsp"> ConsultaCompras </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown3' class='dropdown-content'>
                    <li><a href="../compras/consultarCompras.jsp"> ConsultaCompras </a></li>
                </ul>
            <% } %>
            
            <!-- Dropdown4 Instrumentos-->
            <% if (usuSaida.getTipo().equals("ADM")) { %>
                <!-- Dropdown4 Structure -->
                <ul id='dropdown4' class='dropdown-content'>
                    <li><a href="../instrumentos/inserirInstrumentos.jsp"> InserirInstrumentos</a></li>
                    <li><a href="../instrumentos/consultarInstrumentos.jsp"> ConsultaInstrumentos </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown4' class='dropdown-content'>
                    <li><a href="../instrumentos/consultarInstrumentos.jsp"> ConsultaInstrumentos </a></li>
                </ul>
            <% } %>
            
            <!-- Dropdown5 Acessorios-->
            <% if (usuSaida.getTipo().equals("ADM")) { %>
                <!-- Dropdown5 Structure -->
                <ul id='dropdown5' class='dropdown-content'>
                    <li><a href="../acessorios/inserirAcessorios.jsp"> InserirAcessorios</a></li>
                    <li><a href="../acessorios/consultarAcessorios.jsp"> ConsultaAcessorios </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown5' class='dropdown-content'>
                    <li><a href="../acessorios/consultarAcessorios.jsp"> ConsultaAcessorios </a></li>
                </ul>
            <% } %>

            <% } else { %>
                <h1>USUÁRIO INVÁLIDO</h1>
        <% } %>
    </body>
</html>