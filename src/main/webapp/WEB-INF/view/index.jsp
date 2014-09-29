<%-- 
    Document   : index
    Created on : 2014-09-26, 20:29:39
    Author     : Bartek
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            .error{
                color: #FF8080;
                padding: 10px;
                display: block;
                text-transform: uppercase;
            }
            .line {
                display: inline-block;
                width: 118px;
                height: 120px;
                background-color: #BEEDBE;
                margin: 10px;
            }
            .conteiner {
                width: 710px;
                margin: 0 auto;
                margin-top: 20px;
            }
            .form{
                margin: 0 auto;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <div class="conteiner">   
            <div class="form">
                <%@ include file="/WEB-INF/view/shared/form.jsp" %>
            </div>
            <c:forEach items="${users}" var="user">
                <div class="line"><a href="/show/${user.firstname}">${user.firstname}</a></div>
            </c:forEach>
        </div>    
            
    </body>
</html>
