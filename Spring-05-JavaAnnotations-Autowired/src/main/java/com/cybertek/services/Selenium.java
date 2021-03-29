package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Autowired
    OfficeHours officeHours;

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : 23" + " + " + officeHours.getHours());
    }

}
