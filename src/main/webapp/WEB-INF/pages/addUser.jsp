<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Aero
  Date: 24.09.17
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<form:form method="post" action="addUser" commandName="user">
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value=""/></td>
            <!--td><form:errors path="name"></form:errors> </td-->
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="text" name="age" value=""/></td>
        </tr>
        <tr>
            <td>Is Admin?</td>
            <td><input type="checkbox" name="isAdmin"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add User"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>