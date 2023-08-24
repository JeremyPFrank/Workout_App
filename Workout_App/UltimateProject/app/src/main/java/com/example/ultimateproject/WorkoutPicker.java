package com.example.ultimateproject;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class WorkoutPicker {

    List<String> getWorkouts (String workouttypes){
        double num = (Math.random() * 10) + 1;
        List<String> workout = new ArrayList<String>();
        if (workouttypes.equals("Chest")){
            if (num>=5)
            workout.add("BenchPress");
            else
            workout.add("Cable Filies");
        }
        else if (workouttypes.equals("Triceps")){
            workout.add("Tricep Pushdowns");
            workout.add("Tricept Extentions");
        }
        else if (workouttypes.equals("Squat")){
            workout.add("Squat");
        }
        return workout;
    }

}
