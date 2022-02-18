package tech.pragmat.javabuildagenttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void sayHelloTest() {
        String actual = greetingService.sayHello();
        Assertions.assertEquals("hello world", actual);
    }

}