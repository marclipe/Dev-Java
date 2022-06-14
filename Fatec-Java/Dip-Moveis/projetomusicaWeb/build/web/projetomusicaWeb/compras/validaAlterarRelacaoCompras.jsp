<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="projetomusica.model.bean.Clientes"%>
<%@page import="projetomusica.controller.ControllerClientes"%>
<%@page import="projetomusica.model.bean.Instrumentos"%>
<%@page import="projetomusica.controller.ControllerInstrumentos"%>
<%@page import="projetomusica.model.bean.Compras"%>
<%@page import="projetomusica.controller.ControllerCompras"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    int id_clientes = Integer.parseInt(request.getParameter("ID_CLIENTES"));
    int id_instrumentos = Integer.parseInt(request.getParameter("ID_INSTRUMENTOS"));
    double valor_total = Double.parseDouble(request.getParameter("VALORTOTAL"));
    String nome_clientes = request.getParameter("NOMECLIENTES");
    Compras comp = new Compras(id, valor_total,id_clientes,id_instrumentos, nome_clientes);
    ControllerCompras compcont = new ControllerCompras();
    comp = compcont.alterar(comp);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarRelacaoCompras.jsp?NOMECLIENTES="+nome_clientes;
    response.sendRedirect(url);
%>    
    
    