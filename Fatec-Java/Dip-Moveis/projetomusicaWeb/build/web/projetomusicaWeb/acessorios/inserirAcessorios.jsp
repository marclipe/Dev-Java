<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - ACESSORIOS</title>
    <body>
       <div class="container"/>
        <h1>INSERIR ACESSORIOS</h1>
        <form name="inserirAcessorios" action="validaInserirAcessorios.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Valor: <input type="number" name="VALOR" value=""> <br>
            Id_Instrumento: <input type="number" name="ID_INSTRUMENTOS" value=""> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
