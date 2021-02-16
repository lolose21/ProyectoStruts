<%-- 
    Document   : web14detallesempleado
    Created on : 15-feb-2021, 17:16:55
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DETALLES EMPLEADOS!</h1>
        <ul>
            <li>
                <html:link action="/Action14Empleados">
                    EMPLEADOS
                </html:link>
                <logic:present name="detallesempleado">
                    <bean:write name="detallesempleado" filter="false"/>
                </logic:present>
                    
                        <html:link action="/Action14Empleados">
                             Incremento
                             </html:link>
                             
                <logic:present name="incremento">
                        <bean:write name="incremento" filter="false"/>
                        <h1 style="color: red" > Muestro empleados</h1>
                   
                </logic:present>
                             
            </li>
        </ul>
    </body>
</html>
