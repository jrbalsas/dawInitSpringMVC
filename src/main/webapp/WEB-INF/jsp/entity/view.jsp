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
        <main class="row" >
        <nav class="col-md-3">
        <h2>Options</h2>
        <ul class="nav nav-pills flex-colum">
            <li class="nav-item"><a class="nav-link active" href="#" >Option 1</a></li>
        </ul>
        </nav>
        <section class="col-md-9">
        <h1>Sample entity</h1>
        <p>Message: ${msg}</p>
        <p>Entity name: ${entity.name}</p>        
        </section>
        </main>
        <%@include file="/WEB-INF/layout/footer.jspf"%>
    </body>
</html>
