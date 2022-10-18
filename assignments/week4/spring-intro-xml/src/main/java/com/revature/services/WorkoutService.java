package com.revature.services;

public class WorkoutService {

    public WorkoutService(){
        System.out.println("Workout service instantiated ");
    }
        //We could pretend that this is coming from an api
    public String fetchWorkoutRoutine(String coachType){

        switch(coachType.toLowerCase()){
            case "baseball":
                return "Today's workout:Spend an hour at batting practice";
            case "track":
                return "Today's workout: Run a 5k";
            case "football":
                return "Today's workout: Suicide runs to the 40, 50, 60, 70, 80, 90, and 100 yard lines";
            default:
                return "No workout to provide, Enjoy your day";
        }
    }
}
