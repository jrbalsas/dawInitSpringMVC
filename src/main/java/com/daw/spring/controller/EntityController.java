package com.daw.spring.controller;

import com.daw.spring.model.Entity;
import com.daw.spring.model.dao.EntityDAO;
import com.daw.spring.model.dao.EntityDAOJDBC;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/entity")
public class EntityController {

    private final Logger logger = Logger.getLogger(EntityController.class.getName());
    
    @Autowired
    @Qualifier("entityDAOList")
    private EntityDAO entities;

    public EntityController() {
    }

    @GetMapping("/init")
    public String listado(ModelMap model) {
        logger.info("GET /init request");
        
        model.addAttribute("msg", "Hello world!");
        model.addAttribute("entity", entities.findById(1));

        return "entity/view";
    }

//@ExceptionHandler
//public String errorHandler (Exception e) {
//    
//    return "generalError.jsp";
//}
}
