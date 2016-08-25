<%--
  Created by IntelliJ IDEA.
  User: vsanghav
  Date: 8/25/2016
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Olympic 2016 Medal Count</title>
</head>
<body>

<div class="col-md-9">
    <table border="1" align="center">
  
        <c:forEach var="country" items="${data.countries}">
            <tr>
                <td>${country.name}</td>
                <td>${country.medals}</td>
                <td>${country.gold}</td>
                <td>${country.silver}</td>
                <td>${country.bronze}</td>
            </tr>
        </c:forEach>
    </table>

</div>


</body>
</html>
