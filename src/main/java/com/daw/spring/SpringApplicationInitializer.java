
package com.daw.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Servlet 3.0 Programmatic configuration (instead of web.xml)
 *
 * @author jrbalsas
 */
public class SpringApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {

        //Launch and configure SpringMVC
        
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext
                = new AnnotationConfigWebApplicationContext();
        
        //Configure SpringMVC
        rootContext.register(SpringMvcConfig.class);

        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));

        // Register and map the SpringMVC dispatcher servlet
        ServletRegistration.Dynamic dispatcher
                = container.addServlet("springMvcFrontDispatcher", new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/"); //Map all urls to SpringMVC FrontDispatcher

    }
}
