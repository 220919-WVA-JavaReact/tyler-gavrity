package com.revature.models;

import com.revature.services.MotivationalService;

public interface Coach {

    //Recall that an interface is a contract that stipulates that anything that implements it
    //is guaranteed to have these methods at the least

    String getDailyWorkout();

    String getMotivation();

    MotivationalService getMotivationalService();
}
