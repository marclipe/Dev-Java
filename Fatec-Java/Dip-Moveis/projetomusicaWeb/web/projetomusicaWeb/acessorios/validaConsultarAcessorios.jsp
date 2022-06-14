<%@page import="projetomusica.model.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.model.bean.Acessorios"%>
<%@page import="projetomusica.controller.ControllerAcessorios"%>

<%
    String nome = request.getParameter("NOME");
    Acessorios pes = new Acessorios(nome);
    ControllerAcessorios pescont = new ControllerAcessorios();
    List<Acessorios> pess = pescont.listar(pes);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + nome+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA PESSOAS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Id_Instrumento">Id_Instrumento</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Valor">Valor</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(pess.isEmpty())) { %>    
                <tbody>
                    <% for (Acessorios listaAcessorios : pess) { %>
                        <tr>
                            <td><%=listaAcessorios.getId()%></td>
                            <td><%=listaAcessorios.getId_instrumentos()%></td>
                            <td><%=listaAcessorios.getNome()%></td>
                            <td><%=listaAcessorios.getValor()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirAcessorios.jsp?<%=url + listaAcessorios.getId()%>">Excluir</a></td>
                                <td><a href="alterarAcessorios.jsp?<%=url + listaAcessorios.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>