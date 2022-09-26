package demo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "30 min batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
