<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>

<jsp:include page="header.jsp"/>
    
    
    <%
    
    String jdbcURL = "jdbc:mysql://localhost:3306/food-app";
    String jdbcUsername = "root";
    String jdbcPassword = "Sai@01Mysql";

    Connection con = null;
   
   

    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        Statement st = con.createStatement();
       
        String sql = "SELECT cloudinaryImageId, name, avgRatingString, costForTwo FROM restaurantdetails";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            String cloudinaryImageId = rs.getString("cloudinaryImageId");
            String name = rs.getString("name");
            String avgRatingString = rs.getString("avgRatingString");
            String costForTwo = rs.getString("costForTwo");
        
%>
    
    <div class="res-container">
    <div class="res-card" >
        <img
          class="res-logo"
          alt="res-logo"
          src="https://media-assets.swiggy.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,w_660/<%= cloudinaryImageId %>";  
        />
        <h3><%= name %></h3>
        
        <h4><%= avgRatingString %></h4>
        <h4><%= costForTwo %></h4>
    </div>
    </div>
    
<%
        } 
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        
        if (con != null) try { con.close(); } catch (SQLException ignore) {}
    }
%>

<jsp:include page="footer.jsp"/>

</body>
</html>