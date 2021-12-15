package tech.pragmat.javabuildagenttest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public String someString(){
        return "Some string";
    }

    @Bean
    public String anotherString(){
        return "Another string";
    }
}
