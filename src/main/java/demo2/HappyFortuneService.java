package demo2;

import demo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
