<html>
<body>
<h1>Hello</h1>
<% String msg = (String)request.getAttribute("key");
out.println("<h1>" + msg + "</h1>");
%>
</body>
</html>