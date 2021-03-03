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
        <h1>MENU de STRUTS</h1>
        <ul>
            <li>
                <html:link href="/web02sumarnumeros.jsp">
                    SUMAR NUMEROS
                </html:link>
            </li>
            <li>
                <html:link action="/Action06Departamentos">
                    DEPARTAMENTOS
                </html:link>
            </li>
            <li>
                <html:link action="webmenuoficiosdinamicos">
                    MENU OFICIOS DINAMICOS
                </html:link>
            </li>
            <li>
                <html:link action="/Action11MenuOficiosDinamicos">
                    Menú oficios dinámicos
                </html:link>
            </li>

            <li>
                <html:link action="/Action12MenuDepartamentosDinamico">
                    Menú departamentos dinámicos
                </html:link>
            </li> 
            <li>
                <html:link action="/Action13Tabladepartamentos">
                    Eliminar departamento
                </html:link>
            </li>    
              <li>
                  <html:link action="/Action14Empleados">
                    Empleados
                </html:link>
            </li>    
        </ul>
    </body>
</html>
