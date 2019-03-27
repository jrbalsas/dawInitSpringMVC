<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="messages"/>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title><fmt:message key="appName"/></title>
        <%@include file="/WEB-INF/layout/bootstrapheader.jspf"%>        
    </head>
    <body class="container">
        <header class="jumbotron">
            <h1>Hello world!</h1>
        </header>     
        <main class="row" >
        <nav class="col-md-3">
        <h2>Options</h2>
        <ul class="nav nav-pills nav-stacked">
            <li class="active"><a href="entity/init" >Entity access</a></li>
        </ul>
        </nav>
        <section class="col-md-9">
        </section>
        </main>
        <%@include file="/WEB-INF/layout/footer.jspf"%>
    </body>
</html>
