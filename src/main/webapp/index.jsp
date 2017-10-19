<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--<title><%= "some title" %></title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<c:if test="true">--%>
<%--<h1>Variable names should be very descriptive</h1>--%>
<%--</c:if>--%>
<%--<c:if test="false">--%>
<%--<h1>single letter variable names are good</h1>--%>
<%--</c:if>--%>
<%--</body>--%>
<%--</html>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/topPart.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navBar.jsp" />
<div class="container">
    <h1>Welcome to the Adlister!</h1>
</div>
</body>
</html>