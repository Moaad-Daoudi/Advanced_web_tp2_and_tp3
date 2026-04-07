<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% 
        if(session.getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>

    <h1>Hello, ${sessionScope.user.fullName}!</h1>
    
    <p>Welcome to your private dashboard.</p>

    <!-- Logout Link -->
    <a href="logout">Logout</a>
</body>
</html>