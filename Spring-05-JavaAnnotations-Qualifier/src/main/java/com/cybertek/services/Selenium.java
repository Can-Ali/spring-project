package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

//    @Autowired
//    @Qualifier("mockInterviewHours")
//    ExtraSessions extraSessions;

    @Autowired
    @Qualifier("officeHours")
    ExtraSessions extraSessions;

    public void getTeachingHours() {

//        System.out.println("Weekly teaching hours : 23" + " + Mockinterview Hours: " + extraSessions.getHours() );

        System.out.println("Weekly teaching hours : 23" + " + Office Hours: " + extraSessions.getHours() );
    }

}
