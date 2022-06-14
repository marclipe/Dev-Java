<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="projetomusica.model.bean.Clientes"%>
<%@page import="projetomusica.controller.ControllerClientes"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>

<%
    ControllerInstrumentos insCont = new ControllerInstrumentos();
    Instrumentos ins = new Instrumentos("");
    List<Instrumentos> inst = insCont.listar(ins);

    ControllerClientes cliCont = new ControllerClientes();
    Clientes cliEnt = new Clientes("");
    List<Clientes> clie = cliCont.listar(cliEnt);
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR COMPRAS</title>
    <body>
        <div class="container"/>
            <h1>Inseri Compras</h1>
            <form name="inseriCompras" action="validaRelacaoCompras.jsp" method="POST">
                <table>
                    <tr>
                        <td>Instrumentos:</td>
                        <td>
                            <select NAME ="ID_INSTRUMENTOS" class="browser-default">
                                <% for (Instrumentos ins_ : inst) { %>
                                    <option value="<%=ins_.getId()%>"><%=ins_.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Clientes:</td>
                        <td>
                            <select NAME="ID_CLIENTES" class="browser-default">
                                <% for (Clientes cli : clie) { %>
                                    <option value="<%=cli.getId()%>"><%=cli.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>VALOR TOTAL:</td>
                        <td><input type="text" name="VALORTOTAL" value=""></td>
                        <td>Nome do Cliente:</td>
                        <td><input type="text" name="NOMECLIENTES" value=""></td>
                    </tr>
                </table>    
                <input type="submit" name="Enviar" value="Enviar">  <br>
            </form>
        </div>                     
    </body>
</html>
