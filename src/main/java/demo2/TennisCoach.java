package demo2;

import demo.Coach;
import demo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
    }

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void doStuff(){
        System.out.println("PostConstruct method");
    }

    @PreDestroy
    public void doAnotherStuff(){
        System.out.println("PostConstruct method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It! " + fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
}
