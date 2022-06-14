<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Acessorios"%>
<%@page import="projetomusica.controller.ControllerAcessorios"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Acessorios pes = new Acessorios(id);
    ControllerAcessorios pesCont = new ControllerAcessorios();
    pes = pesCont.excluir(pes);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarAcessorios.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>