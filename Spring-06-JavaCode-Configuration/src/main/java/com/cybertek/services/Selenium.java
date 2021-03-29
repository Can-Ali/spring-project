package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Selenium implements Course {

    private ExtraSessions extraSessions;

    public Selenium (ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Selenium Weekly teaching hours 22" + " + " + extraSessions.getHours() );
    }
}
