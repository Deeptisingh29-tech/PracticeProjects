<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.reflect.Array" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int pid;
String pname;
float price;
String url;%>
<%
pid = Integer.parseInt(request.getParameter("pid"));
pname = request.getParameter("pname");
price = Float.parseFloat(request.getParameter("price"));
url = request.getParameter("url");

Product p = new Product();
p.setPid(pid);
p.setPname(pname);
p.setPrice(price);
p.setUrl(url);
%>
<h2>Details of Product:</h2><br> <%out.println(p); %>
<hr>
<a href="index.jsp">Main Page</a>
<%
%>
</body>
</html>