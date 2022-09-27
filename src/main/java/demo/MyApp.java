package demo;

public class MyApp {

    public static void main(String[] args) {
        Coach coach = new BaseballCoach(String::new);
        System.out.println(coach.getDailyWorkout());
    }
}
