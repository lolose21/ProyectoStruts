

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
        <h1>DETALLES OFICIO</h1>
        <html:form action="/Action18EmpleadosOficiosCombo">
            <label>Seleccione Oficio</label>
            <html:select property="oficio">
                <logic:iterate name="LISTAOFICIOS" id="ofi">
                    <html:option value="${ofi}">
                        <bean:write name="ofi"/>
                    </html:option>
                    
                </logic:iterate>
                
            </html:select>
            <button type="submit">
                DETALLES OFICIO
            </button>
        </html:form>
           <hr/>
            <logic:present name="EMPLEADOS">
            <table border="1">
            <thead>
            <tr>
            <th>APELLIDO</th>
            <th>OFICIO</th>
            <th>SALARIO</th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="EMPLEADOS" id="emp">
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
            </tr>
            </logic:iterate>
            </tbody>
            </table>
            </logic:present>
            <html:form action="/Action18InsertarEmpleado">
                <table border="1">
                    <thead>
                        <tr>
                            <td>EMP_NO</td>
                            <td>APELLIDO</td>
                            <td>OFICIO</td>
                            <td>DIR</td>
                            <td>fECHA_ALT</td>
                            <td>SALARIO</td>
                            <td>COMISION</td>
                            <td>DEPT_NO</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                            <td>
                                <html:text property=""/>
                            </td>
                        </tr>
                    </tbody>
                </table>
                
            </html:form>
            
    </body>
</html>
