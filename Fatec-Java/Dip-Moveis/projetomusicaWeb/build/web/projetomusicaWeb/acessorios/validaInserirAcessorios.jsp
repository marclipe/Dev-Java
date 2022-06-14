<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Acessorios"%>
<%@page import="projetomusica.controller.ControllerAcessorios"%>

<%
    String id_instrumentos_ = request.getParameter("ID_INSTRUMENTOS");
    int id_instrumento = Integer.parseInt(id_instrumentos_);
    String nome = request.getParameter("NOME");
    double valor = Double.parseDouble(request.getParameter("VALOR"));
    Acessorios pes = new Acessorios(nome,valor,id_instrumento);
    
    ControllerAcessorios pescont = new ControllerAcessorios();
    pes = pescont.inserir(pes);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirAcessorios.jsp";
    response.sendRedirect(url);
%>

