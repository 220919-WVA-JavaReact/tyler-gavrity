package com.revature;

import com.revature.models.Coach;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlDriver {

    public static void main(String[] args) {
        System.out.println("Creating the bean container...or IOC");

        try(ClassPathXmlApplicationContext beanContainer = new ClassPathXmlApplicationContext("beans.xml")){

            System.out.println("Bean container created");

            //Let's try retrieivng the bean from the container with the id :""my coach
            Coach headCoach = beanContainer.getBean("myCoach", Coach.class);

            //Call some methods on the retrieved bean to make sure it is wired/configured correctly
            System.out.println(headCoach.getDailyWorkout());
            System.out.println(headCoach.getMotivation());

            //Let's say I wanted to create another coach, maybe an assistant

            Coach assistantCoach = beanContainer.getBean("myCoach", Coach.class);

            System.out.println("Do the coaches use the same motivational service" + ());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
