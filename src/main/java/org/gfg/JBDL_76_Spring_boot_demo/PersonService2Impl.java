package org.gfg.JBDL_76_Spring_boot_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class PersonService2Impl implements PersonService{
    @Override
    public List<Person> getPersonList() {
        List<Person> l = new ArrayList<>();
        l.add(new Person("Dhruv", 3));
        l.add(new Person("Dipti", 4));
        return  l;
    }
}
// @Qualifier: name of the bean
// @Primary: make one implementation as a primary implementation ?
