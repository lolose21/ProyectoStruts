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
        <h1>NUMERO COLLATZ</h1>
        <html:form action="/Action04Collatz">
            <label>NUMERO</label>
            <html:text property="collatz"/>
            <button type="submit">
                ENTER
            </button>
        </html:form>
            <logic:present name="collatz">
                <bean:write name="collatz" filter="false"/>
            </logic:present>
    </body>
</html>
