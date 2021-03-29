package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Autowired
    private OfficeHours officeHours;


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 7" + " + " + officeHours.getHours());
    }
}
