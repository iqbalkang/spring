package com.rest.basics.classes;

import com.rest.basics.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "play football";
    }
}
