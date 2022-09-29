package demo2;

import demo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationOnlyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach3 = context.getBean("tennisCoach", Coach.class);
        Coach coach4 = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach3.getDailyWorkout());
        System.out.println(coach4.getDailyFortune());
        context.close();
    }
}
