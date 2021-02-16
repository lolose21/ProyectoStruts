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
        <h1>MENU OFICIOS!</h1>
        <ul>
            <li>
                <html:link action="/Action10EmpleadosOficios?oficio=presidente">
                    PRESIDENTE
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficios?oficio=director">
                   DIRECTOR
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficios?oficio=analista">
                    ANALISTA
                </html:link>
            </li>
            <li>
                <html:link action="/Action10EmpleadosOficios?oficio=vendedor">
                    VENDEDOR
                </html:link>
            </li>
        </ul>
    </body>
</html>
