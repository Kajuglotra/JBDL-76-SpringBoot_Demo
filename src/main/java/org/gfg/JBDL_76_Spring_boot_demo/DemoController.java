package org.gfg.JBDL_76_Spring_boot_demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller // view
//@ResponseBody // HTTP responses // rest api response :
//@RestController
public class DemoController {
    private static final Log logger = LogFactory.getLog(DemoController.class);

    // constructor injection
    public DemoController(DemoService service){
        this.demoService  = service;
    }

    // field injection
    @Autowired(required = true)
    @Qualifier("demoService")
    private DemoService demoService; // instance level variable

    @Autowired
    private PersonService personService;

//    @Autowired
//    private PersonService personService2;

    @GetMapping("/demo") // path by which u can reach out the below method ?
    public String getDemo(){ // i stated that, i dont need any param , return string
        return "demo";
    }

    @GetMapping("/dynamic-content")
    public ModelAndView getDynamicContent(){
        logger.info(personService.getPersonList());
//        logger.info(personService2.getPersonList());
        return demoService.demo();
    }
}
// servlet : HTML inside your java // 10-15 years back
// jsp: java inside your HTML // 10-15 years back
// thymeleaf :
// view : HTML
// @Controller  -> view (html) -> this should work fine  -> in a way : taking a req -> model -> view
// @Controller -> string/json/integer/xml ->
// @RestController -> @Controller/ @ResponseBody-> returning type : html, json, string, int...
// @ResponseBody: HTTP : can have any return type ?
