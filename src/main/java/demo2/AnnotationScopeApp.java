package demo2;

import demo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach2.getDailyFortune());
        System.out.println(coach + coach2.toString());
        context.close();
    }
}
