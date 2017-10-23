<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: art--%>
  <%--Date: 10/17/17--%>
  <%--Time: 12:04 PM--%>
  <%--To change this template use File | Settings | File Templates.--%>


<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<jsp:include page="partials/topPart.jsp">--%>
        <%--<jsp:param name="title" value="Your Profile" />--%>
    <%--</jsp:include>--%>
<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="partials/navBar.jsp" />--%>

<%--<div class="container">--%>
    <%--<h1>Viewing your profile.</h1>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/webapp/partials/topPart.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="/webapp/partials/navBar.jsp" />
${sessionScope.get("firstAd")}
<div class="container">
    <h1>Viewing your profile ${sessionScope.user}.</h1>
</div>

</body>
</html>