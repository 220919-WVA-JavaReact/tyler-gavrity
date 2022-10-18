package com.revature.models;

import com.revature.services.MotivationalService;
import com.revature.services.WorkoutService;

public class FootballCoach implements Coach{

    private String email;

    private String teamName;

    private WorkoutService workoutService;

    private MotivationalService motivationalService;
    public FootballCoach(){
        System.out.println("Football coach initialzied");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public WorkoutService getWorkoutService() {
        return workoutService;
    }

    public void setWorkoutService(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    public MotivationalService getMotivationalService() {
        return motivationalService;
    }

    public void setMotivationalService(MotivationalService motivationalService) {
        this.motivationalService = motivationalService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRoutine("football");
    }

    @Override
    public String getMotivation() {
        return motivationalService.fetchMotivationalQuote();
    }
}
