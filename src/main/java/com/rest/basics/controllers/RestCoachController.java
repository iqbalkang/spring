package com.rest.basics.controllers;

import com.rest.basics.interfaces.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCoachController {
    private Coach coach;
    private Coach coach1;

    public RestCoachController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach coach1) {
        this.coach = coach;
        this.coach1 = coach1;
    }

    @GetMapping("/check")
    public String areSame() {
        return "same = " + (coach == coach1);
    }

    @GetMapping("/")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
