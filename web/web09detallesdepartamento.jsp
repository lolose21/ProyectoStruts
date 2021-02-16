<%-- 
  
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
        <h1>DETALLES DEPARTAMENTO</h1>
        <logic:present name="detallesdepartamento">
            <bean:write name="detallesdepartamento" filter="false"/>
        </logic:present>
        <ul>
           <li>
                <html:link href="web09menudepartamentossestatico.jsp">
                    Menu departamentos estatico
                </html:link>
            </li>
            </ul>
    </body>
</html>
