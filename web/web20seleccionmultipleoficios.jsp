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
        <h1>SELECCION MULTIPLE OFICIOS</h1>
          <html:form action="/Action20SeleccionMultipleOficios">
            <ul>
                <logic:iterate name="LISTAEMPLEADOS"
                               id="emp">
                    <li>
                        <html:multibox property="empleado">
                            <bean:write name="emp" 
                                        property="ofi"/>
                        </html:multibox>
                        <bean:write name="emp" 
                                    property="ape"/>
                    </li>
                </logic:iterate>
                       </ul>
            <button type="submit">Mostrar empleados</button>
        </html:form>
        <hr/>
        <logic:present name="LISTEMPLEADOS">
            <table border="1">
                <thead>
                    <tr>
                        <th>Apellido</th>
                        <th>Oficio</th>
                        <th>Salario</th>
                        <th>Departamento</th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="LISTEMPLEADOS" id="emp">
                        <tr>
                            <td><bean:write name="emp" property="apellido"/></td>
                            <td><bean:write name="emp" property="oficio"/></td>
                            <td><bean:write name="emp" property="salario"/></td>
                            <td><bean:write name="emp" property="iddepartamento"/></td>
                        </tr>
                    </logic:iterate>
                </tbody>
            </table>
        </logic:present>

    </body>
</html>
