package com.rest.basics.classes;

import com.rest.basics.interfaces.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "play cricket";
    }
}
