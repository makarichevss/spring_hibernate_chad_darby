package demo2;

import demo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    public RESTFortuneService() {
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
