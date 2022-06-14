<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - INSTRUMENTOS</title>
    <body>
       <div class="container"/>
       <h1>CONSULTAR INSTRUMENTOS</h1>
       <form name="consultarInstrumentos" action="validaConsultarInstrumentos.jsp" method="post">
           Nome <input type="text" name ="NOME" value=""> <br>
           <input type="submit" name ="Enviar" value="Enviar"> <br>
       </form>
       </div>
    </body>
</html>
