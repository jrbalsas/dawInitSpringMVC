JEE application skeleton with SpringMVC
==========

Sample Maven Netbeans project with starting point for MVC application using SpringMVC

Features:
-------------
- Spring 3+ programmatic configuration
- Spring DispatcherServlet initialization using Servlet 3.0 programmatic configuration
- Sample DAO Pattern
- JEE DataSource definition (web.xml)
- DataSource Bean for JNDI connetion pool location
- Optional access constraints for JEE Authentication/Authorization.
- SpringMVC Logout controller and optional logout button for views

## Requeriments

- JEE Application Server, i.e. Payara, Glassfish

## Usage
- Compile and deploy in a JEE Application Server

### DB Access:
1. Configure JEE Datasource in web.xml
2. Configura DataSource Bean (SpringMvcConfig.java)

### Realm Authentication/Authorization:
1. Create Realm in JEE Application Server, e.g. using AS GUI/asadmin tool
2. Uncomment/Create Security-constraints in web.xml
3. Select valid realm in web.xml