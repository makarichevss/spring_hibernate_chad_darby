package demo2;

import demo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    public DatabaseFortuneService() {
    }

    @Override
    public String getFortune() {
        return "Database - Today is your lucky day!";
    }

}
