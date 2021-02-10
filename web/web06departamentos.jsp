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
        <h1>Tabla DEPARTAMENTOS</h1>
        <html:form action="/Action06Departamentos">
            <button type="submit" id="boton" name="boton">
               
                TABLA
            </button>
            </html:form>
            <logic:present name="tabladepartamentos">
    
            <bean:write name="tabladepartamentos" filter="false"/>
       
        </logic:present>
    </body>
</html>
