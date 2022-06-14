<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - INSTRUMENTOS</title>
    <body>
       <div class="container"/>
        <h1>INSERIR INSTRUMENTOS</h1>
        <form name="inserirInstrumentos" action="validaInserirInstrumentos.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Valor: <input type="number" name="VALOR" value=""> <br>
            Tipo: <input type="text" name="TIPO" value=""> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
