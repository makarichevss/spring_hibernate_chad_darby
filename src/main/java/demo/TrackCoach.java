package demo;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "5k run";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
