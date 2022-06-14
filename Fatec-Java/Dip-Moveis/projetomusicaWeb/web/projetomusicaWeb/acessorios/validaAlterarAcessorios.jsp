<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Acessorios"%>
<%@page import="projetomusica.controller.ControllerAcessorios"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    
    String nome = request.getParameter("NOME");
    
    String id_ =  request.getParameter("ID_INSTRUMENTO");
    int id_instrumento = Integer.parseInt(id_);
    
    String valor_ = request.getParameter("VALOR");
    double valor = Double.parseDouble(valor_);
    
    String pbusca = request.getParameter("PBUSCA");
    Acessorios pes = new Acessorios(id,nome, valor, id_instrumento);
    ControllerAcessorios pesCont = new ControllerAcessorios();
    pes = pesCont.alterar(pes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarAcessorios.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>