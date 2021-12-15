package tech.pragmat.javabuildagenttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;
    private final String someString;
    private final String anotherString;

    public GreetingController(GreetingService greetingService, String someString, String anotherString) {
        this.greetingService = greetingService;
        this.someString = someString;
        this.anotherString =anotherString;
    }

    @GetMapping("/hello")
    String hello() {
        return someString + " " + greetingService.sayHello() + " " + anotherString;
    }
}
