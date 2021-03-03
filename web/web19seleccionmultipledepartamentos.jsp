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
        <h1>SELECCION MULTIPLE DEPARTAMENTOS</h1>
        <html:form action="/Action19SeleccionMultipleDepartamentos">
            <ul>
                <logic:iterate name="LISTADEPARTAMENTOS"
                               id="dept">
                    <li>
                        <html:multibox property="departamentos">
                            <bean:write name="dept" 
                                        property="numero"/>
                        </html:multibox>
                        <bean:write name="dept" 
                                    property="nombre"/>
                    </li>
                </logic:iterate>
            </ul>
            <button type="submit">
                MOSTRAR EMPLEADOS
            </button>
        </html:form>
        <hr/>
        <logic:present name="LISTAEMPLEADOS">
            <table border="1">
            <thead>
            <tr>
            <th>APELLIDO</th>
            <th>OFICIO</th>
            <th>SALARIO</th>
            <th>DEPARTAMENTO</th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="LISTAEMPLEADOS" id="emp">
            <tr>
            <td>
            <bean:write name="emp" property="apellido"/>
            </td>
            <td>
            <bean:write name="emp" property="oficio"/>
            </td>
            <td>
            <bean:write name="emp" property="salario"/>
            </td>
            <td><bean:write name="emp" property="iddepartamento"/></td>
            </tr>
            </logic:iterate>
        
            </tbody>
            </table>
            </logic:present>
    </body>
</html>
