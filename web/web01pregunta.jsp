

<%@page  contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <title>Plantilla</title>
    </head>
    <body>
        <jsp:include page="includes/webmenu.jsp"/>
    <main role="main" class="container">

        <div class="starter-template">
          <h1 style="color: green">PREGUNTA</h1>
        <html:form action="/Action01VistaControlador">
            <p><b>¿cuanto son 2 + 2?</b></p>
            <html:text property="respuesta"/>
            <html:submit value="Comprobar respuesta"/>
        </html:form>
        </div>
    </main><!-- /.container -->
    <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>



