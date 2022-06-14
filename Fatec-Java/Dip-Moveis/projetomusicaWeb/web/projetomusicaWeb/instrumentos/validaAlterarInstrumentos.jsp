<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String nome = request.getParameter("NOME");
    double valor = Double.parseDouble(request.getParameter("VALOR"));
    String tipo = request.getParameter("TIPO");
    String pbusca = request.getParameter("PBUSCA");

    Instrumentos ins = new Instrumentos(id,nome,valor,tipo);
    ControllerInstrumentos usuCont = new ControllerInstrumentos();
    ins = usuCont.alterar(ins);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarInstrumentos.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>