<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Acessorios"%>
<%@page import="projetomusica.controller.ControllerAcessorios"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Acessorios ace = new Acessorios(id);
    ControllerAcessorios pesCont = new ControllerAcessorios();
    ace = pesCont.buscar(ace);
    String pbusca = request.getParameter("PBUSCA");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - Acessorios</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR Acessorios</h1>
        <form name="alterarAcessorios" action="validaAlterarAcessorios.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=ace.getNome()%>"> <br>
            Valor: <input type="text" name="VALOR" value="<%=ace.getValor()%>"> <br>
            Id_Instrumento: <input type="number" name="ID_INSTRUMENTO" value="<%=ace.getId_instrumentos()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=ace.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>