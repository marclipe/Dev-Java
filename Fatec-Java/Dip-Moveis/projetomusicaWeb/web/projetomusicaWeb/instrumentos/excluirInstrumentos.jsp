<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Instrumentos ins = new Instrumentos(id);
    ControllerInstrumentos insCont = new ControllerInstrumentos();
    ins = insCont.excluir(ins);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarInstrumentos.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>