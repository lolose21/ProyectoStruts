

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
        <h1>PLUG IN DEPARTAMENTOS</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>
                        NUMERO
                    </th>
                        <th>
                            NOMBRE
                        </th>
                    <th>
                        LOCALIDAD
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="LISTADEPARTAMENTOS" id="departamentos">
                    <tr>
                        <td>
                            <bean:write name="departamentos" property="numero"/>
                        </td>
                        <td>
                            <bean:write name="departamentos" property="nombre"/>
                            
                        </td>
                        <td>
                            <bean:write name="departamentos" property="localidad"/>
                        </td>
                    </tr>
                    
                </logic:iterate>
            </tbody>
        </table>
    </body>
</html>










