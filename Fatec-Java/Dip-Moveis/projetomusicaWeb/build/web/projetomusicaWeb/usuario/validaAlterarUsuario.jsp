<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Usuario"%>
<%@page import="projetomusica.controller.ControllerUsuario"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String status = request.getParameter("STATUS");
    String tipo = request.getParameter("TIPO");
    String pbusca = request.getParameter("PBUSCA");
    int id_clientes = Integer.parseInt(cod);

    Usuario usu = new Usuario(id,login,senha,status,tipo, id_clientes);
    ControllerUsuario usuCont = new ControllerUsuario();
    usu = usuCont.alterar(usu);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarUsuario.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>