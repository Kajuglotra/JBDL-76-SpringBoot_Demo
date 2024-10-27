package org.gfg.JBDL_76_Spring_boot_demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService1Impl implements PersonService{
    @Override
    public List<Person> getPersonList() {
        List<Person> l = new ArrayList<>();
        l.add(new Person("Sachin", 1));
        l.add(new Person("sharad", 2));
        return  l;
    }
}
