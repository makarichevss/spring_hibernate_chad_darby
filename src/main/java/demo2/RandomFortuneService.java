package demo2;

import demo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    public RandomFortuneService() {
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
