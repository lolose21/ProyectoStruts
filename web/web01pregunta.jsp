<%-- 
    Document   : web01pregunta
    Created on : 08-feb-2021, 17:10:05
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/fondo02.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PREGUNTA</title>
    </head>
    <body>
        <h1 style="color: green">PREGUNTA</h1>
        <html:form action="/Action01VistaControlador">
            <p><b>¿cuanto son 2 + 2?</b></p>
            <html:text property="respuesta"/>
            <html:submit value="Comprobar respuesta"/>
        </html:form>
    </body>
</html>
