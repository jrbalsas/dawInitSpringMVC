<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Login page</h1>
        </header>     
        <main class="row" >
        <section class="col-md-9">
        <h2>User sign in</h2>
        <c:if test="${param.error}">
            <p class="alert alert-danger">Wrong credentials!</p>
        </c:if>
        <form action="j_security_check" method="POST">
            <label>User</label><input class="form-control" type="text" name="j_username"/>
            <label>Password</label><input class="form-control" type="password" name="j_password"/>
            <input class="btn btn-primary" type="submit" name="Identificarse"/>
        </form>            
        </section>
        </main>
        <%@include file="/WEB-INF/layout/footer.jspf"%>
    </body>
</html>
