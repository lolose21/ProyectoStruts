<%-- 
    Document   : web14empleados
    Created on : 15-feb-2021, 17:07:21
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
        <h1>Empleados!</h1>
         <logic:present name="listaempleados">
            <ul>
                <logic:iterate name="listaempleados" id="emp">
                    <li>
                        <html:link action="/Action14DetallesEmpleado"
                                   paramName="emp" paramProperty="idEmpleado"
                                   paramId="idempleado">
                                Detalles
                            </html:link>
                            <bean:write name="emp" property="apellido"/>
                        
                    </li>
                </logic:iterate>
            </ul>
        </logic:present>
    </body>
</html>
