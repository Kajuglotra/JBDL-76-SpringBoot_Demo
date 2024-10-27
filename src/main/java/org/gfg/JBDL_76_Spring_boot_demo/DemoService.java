package org.gfg.JBDL_76_Spring_boot_demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DemoService {

    @Autowired
    private ObjectMapper objectMapper; // @Inject java // @Autowired @Qualifier

    public ModelAndView demo(){
        System.out.println(objectMapper);
        // third party, db connection here
        ModelAndView modelAndView = new ModelAndView("dynamic-content.html");
        List<Person> list = new ArrayList<>();
        list.add(new Person( "Aakash", 1));
        list.add(new Person( "Ajay", 2));
        modelAndView.getModelMap().put("personList", list);
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD mm:hh:ss");
        modelAndView.getModelMap().put("date", dateFormat.format(new Date()));
        System.out.println(objectMapper);
        return modelAndView; // html
    }

}
// {"serverTime: " ", "personList: [{"name": "ajay", "id" : 1}, {"name": "Aakash" , "id": 2}]}
