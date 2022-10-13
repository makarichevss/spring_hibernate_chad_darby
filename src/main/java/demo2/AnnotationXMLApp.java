package demo2;

import demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationXMLApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resourcesOld2/applicationContext2.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
