<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>ProductId</title>
        </head>

        <body>
            <form:form  modelAttribute="productdto" action="gettingproductdata" method="post">

                <table align="center">
                    <tr>
                          <td>
                            <form:label path="productId">ProductId</form:label>
                        </td>
                        <td>
                            <form:input path="productId" name="productId"  />
                        </td>
                    </tr>
                      <tr>
                        <td></td>
                        <td>
                            <form:button id="SearchProduct" name="SearchProduct">SearchProduct</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                    </table>
                    </form:form>
                    
        </body>
       </html>
                   