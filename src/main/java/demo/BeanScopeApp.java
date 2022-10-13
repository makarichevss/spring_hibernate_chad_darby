package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resourcesOld2/applicationContext2.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
//        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
//        boolean result = (theCoach == alphaCoach);
//        System.out.println(result);
        context.close();
    }
}
