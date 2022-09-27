package demo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "5k run";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It! " + fortuneService.getFortune();
    }

    public void doInitStuff() {
        System.out.println("init method");
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }
}
