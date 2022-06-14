<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Compras"%>
<%@page import="projetomusica.controller.ControllerCompras"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Compras compPes = new Compras(id);
    ControllerCompras cliInsCont = new ControllerCompras();
    compPes = cliInsCont.excluir(compPes);
    
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarRelacaoCompras.jsp?CLIENTE=" + pbusca;
    response.sendRedirect(url);

%>

