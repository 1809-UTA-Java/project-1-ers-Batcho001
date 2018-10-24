<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="com.revature.repositories.LoginService"%>
<%@page import="com.revature.models.Employees"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" type="text/css" href="css/style.css"/>
     <title>Result Page</title>
</head>
<body>
     <div>
         <h1>Result Page</h1>
             <b>Employee Home Page</b><br/>
             <%=new Date()%>
             <%
                 Employees emp = (Employees) session.getAttribute("employees");
             %>     
             
            
             <a href="logout.jsp">Logout</a>
 
         <table>
             <thead>
                 <tr>
                     <th>User ID</th>
                     <th>Username</th>
                     <th>First Name</th>
                     <th>Last Name</th>
                     <th>email</th>
                 </tr>
             </thead>
             
         </table>    
         <br/>
     </div>
</body>
</html>