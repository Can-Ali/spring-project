package com.cybertek;

import com.cybertek.config.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course = container.getBean("java",Course.class);

        Course course1 = container.getBean("selenium",Course.class);

        course.getTeachingHours();
        course1.getTeachingHours();


        ((AnnotationConfigApplicationContext)container).close();


    }
}
