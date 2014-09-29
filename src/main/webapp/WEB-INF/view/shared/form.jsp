<%-- 
    Document   : form
    Created on : 2014-09-27, 14:34:38
    Author     : Bartek
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="/create" modelAttribute="user" method="POST"> 
    <form:errors path="firstname" cssClass="error" />
    <form:label path="firstname">Firstname</form:label>
    <form:input path="firstname"/>

    <form:errors path="lastname" cssClass="error" />
    <form:label path="lastname">Lastname</form:label>
    <form:input path="lastname"/>

    <form:errors path="email" cssClass="error" />
    <form:label path="email">Email</form:label>
    <form:input path="email"/>

    <input type="submit" value="Submit" />
</form:form>