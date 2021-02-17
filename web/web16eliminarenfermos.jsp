<%-- 
web16eliminarenfermos.jsp
Al cargar la página, vemos a los enfermos.
CARGAMOS DATOS ArrayList<Enfermo>
Tendremos una caja con la inscripción para eliminar enfermo.
Veremos los cambios al eliminar.
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
        <h1>ELIMINAR EMFERMOS</h1>
         <html:form action="/Action16EliminarEnfermos">
        <table border="1">
           
            <thead>
                <tr>
                    INSCRIPCION
                </tr>
                </thead>
            <tbody>
            
            <td>
                <html:text property="inscripcion"/>
                    <button type="submit">
                            ELIMINAR
                    </button> 
                    </td>
         
                
                </tbody>
         </table>  
             </html:form>
        <logic:present name="mensaje">
            <bean:write name="mensaje" filter="false"/>
        </logic:present>
        <table border="1">
            <thead>
                <tr>
                    <th>
                       inscripcion
                    </th>
                        <th>
                          APELLIDO
                        </th>
                    <th>
                        DIRECCION
                    </th>
                     <th>
                        NSS
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="LISTAENFERMO" id="enfermos">
                    <tr>
                        <td>
                            <bean:write name="enfermos" property="inscripcion"/>
                        </td>
                        <td>
                            <bean:write name="enfermos" property="apellido"/>
                            
                        </td>
                        <td>
                            <bean:write name="enfermos" property="direccion"/>
                        </td>
                         <td>
                            <bean:write name="enfermos" property="nss"/>
                        </td>
                    </tr>
                    
                </logic:iterate>
            </tbody>
        </table>
    </body>
</html>
