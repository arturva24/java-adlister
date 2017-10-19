<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 10/17/17
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%--@WebServlet(urlPatterns = "/hi")--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Login Form</title>--%>
<%--</head>--%>
<%--<body>--%>
    <%--<h2> Login Form</h2>--%>
    <%--<form method = "post">--%>
    <%--<p>--%>
        <%--<label for="username">USERNAME</label>--%>
        <%--<input id=" username" name = "username"--%>
               <%--type = "text" placeholder = "Enter username here">--%>
    <%--</p>--%>
    <%--<p>--%>
        <%--<label for="password">Password</label>--%>
        <%--<input id="password" name = "password"--%>
               <%--type = "password" placeholder="Enter password here">--%>
    <%--</p>--%>
    <%--<p>--%>
        <%--<button type="submit">Login</button>--%>
    <%--</p>--%>
    <%--</form>--%>

<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/topPart.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navBar.jsp" />

<div class="container">
    <h1>Viewing your profile.</h1>
</div>

</body>
</html>