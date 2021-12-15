package tech.pragmat.javabuildagenttest;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String GREETINGS = "hello world";

    public String sayHello() {
        return GREETINGS;
    }
}
