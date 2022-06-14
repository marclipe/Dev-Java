
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Usuario"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>

<%
    String nome = request.getParameter("NOME");
    Instrumentos cli = new Instrumentos(nome);
    ControllerInstrumentos inscont = new ControllerInstrumentos();
    List<Instrumentos> inst = inscont.listar(cli);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + nome + "&ID=";
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA INSTRUMENTOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
                <tr>
                    <th data-field="Id">Id</th>
                    <th data-field="Nome">Nome</th>
                    <th data-field="Valor">Valor</th>
                    <th data-field="Tipo">Tipo</th>
                    <th data-field="Excluir">Excluir</th>
                    <th data-field="Alterar">Alterar</th>
                </tr>
            </thead>
            <% if (!(inst.isEmpty())) { %>    
            <tbody>
                <% for (Instrumentos listaInstrumentos : inst) {%>
                <tr>
                    <td><%=listaInstrumentos.getId()%></td>
                    <td><%=listaInstrumentos.getNome()%></td>
                    <td><%=listaInstrumentos.getValor()%></td>
                    <td><%=listaInstrumentos.getTipo()%></td>
                    <% if (usuLogado.getTipo().equals("ADM")) {%>
                    <td><a href="excluirInstrumentos.jsp?<%=url + listaInstrumentos.getId()%>">Excluir</a></td>
                    <td><a href="alterarInstrumentos.jsp?<%=url + listaInstrumentos.getId()%>">Alterar</a></td>
                    <% } %>
                </tr>
                <% } %>
            </tbody>
            <% }%>
        </table>    
    </body>
</html>