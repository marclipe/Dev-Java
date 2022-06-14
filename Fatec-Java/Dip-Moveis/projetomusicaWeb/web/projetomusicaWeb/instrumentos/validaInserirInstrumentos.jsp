<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>

<%
    String nome = request.getParameter("NOME");
    double valor = Double.parseDouble(request.getParameter("VALOR"));
    String tipo = request.getParameter("TIPO");
    Instrumentos ins = new Instrumentos(nome, valor, tipo);
    ControllerInstrumentos inscont = new ControllerInstrumentos();
    ins = inscont.inserir(ins);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirInstrumentos.jsp";
    response.sendRedirect(url);
%>

<HTML>
    <BODY>
        <%=nome%>  <BR>
        <%=valor%>  <BR>
        <%=tipo%>   <BR>
    </BODY>
</HTML>
