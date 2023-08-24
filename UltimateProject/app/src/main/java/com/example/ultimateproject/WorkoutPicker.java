package com.example.ultimateproject;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class WorkoutPicker {
    public int num;
    List<String> getWorkouts (String workouttypes){
        num = (int)(Math.random() * (9) + 1);
        List<String> workout = new ArrayList<String>();
        if (workouttypes.equals("Chest")){
            if (num==1)
            workout.add("Bench Press");
            else if (num ==2)
            workout.add("Cable Flies");
            else if (num ==3)
                workout.add("PushUps");
            else if (num ==4)
                workout.add("Clap PushUps");
            else if (num ==5)
                workout.add("Incline Bench Press");
            else if (num ==6)
                workout.add("Dumbell Bench Press");
            else if (num ==7)
                workout.add("Incline Dumbell Bench Press");
            else if (num ==8)
                workout.add("Dumbell Flies");
            else if (num ==9)
                workout.add("Dips");
            else
                workout.add("Decline Bench Press");
        }
        else if (workouttypes.equals("Triceps")){
            if (num==1)
                workout.add("Single-Arm Tricep Extensions");
            else if (num ==2)
                workout.add("Tricep Cable Pushdowns");
            else if (num ==3)
                workout.add("Dumbell Overhead Extensions");
            else if (num ==4)
                workout.add("Close-Grip Pushups");
            else if (num ==5)
                workout.add("Skull Crushers");
            else if (num ==6)
                workout.add("Tricep Kickbacks");
            else if (num ==7)
                workout.add("Tricep Dips");
            else if (num ==8)
                workout.add("Close Grip Bench Press");
            else if (num ==9)
                workout.add("Cable Overhead Extension");
            else
                workout.add("Pushups (Elbows In)");
        }
        else if (workouttypes.equals("Shoulders")){
            if (num==1)
                workout.add("Lateral Raises");
            else if (num ==2)
                workout.add("Front Raises");
            else if (num ==3)
                workout.add("Dumbell Overhead Press");
            else if (num ==4)
                workout.add("Military Press");
            else if (num ==5)
                workout.add("Push Press");
            else if (num ==6)
                workout.add("Kneeling Landmine Press");
            else if (num ==7)
                workout.add("Behind the Neck Press");
            else if (num ==8)
                workout.add("Single Arm Kettlebell/Dumbell Push");
            else if (num ==9)
                workout.add("Seated Military Press");
            else if (num ==10)
                workout.add("Pike Pushups");
        }
        else if (workouttypes.equals("Biceps")){
            if (num==1)
                workout.add("Neutral Grip Pullups");
            else if (num ==2)
                workout.add("Dumbell Curls");
            else if (num ==3)
                workout.add("Hammer Curls");
            else if (num ==4)
                workout.add("Barbell Curls");
            else if (num ==5)
                workout.add("Preacher Curls");
            else if (num ==6)
                workout.add("Flexed Arm Hang (Neutral Grip)");
            else if (num ==7)
                workout.add("Seated Dumbell Curls");
            else if (num ==8)
                workout.add("Half Curls (Bottom Half)");
            else if (num ==9)
                workout.add("Reverse Curls");
            else if (num ==10)
                workout.add("Half Curls (Top Half)");
        }
        else if (workouttypes.equals("Back")){
            if (num==1)
                workout.add("Lat Pulldowns");
            else if (num ==2)
                workout.add("Single Arm Cable Rows");
            else if (num ==3)
                workout.add("Single Arm Dumbell Rows");
            else if (num ==4)
                workout.add("Barbell Bent Rows");
            else if (num ==5)
                workout.add("Pullups");
            else if (num ==6)
                workout.add("Chinups");
            else if (num ==7)
                workout.add("Renegade Rows");
            else if (num ==8)
                workout.add("Supermans");
            else if (num ==9)
                workout.add("Dumbell Incline Rows");
            else if (num ==10)
                workout.add("Face Pulls");
        }
        else if (workouttypes.equals("Quads")){
            if (num==1)
                workout.add("Leg Extensions");
            else if (num ==2)
                workout.add("Front Squats");
            else if (num ==3)
                workout.add("Step Ups");
            else if (num ==4)
                workout.add("Goblet Squats");
            else if (num ==5)
                workout.add("Leg Press");
            else if (num ==6)
                workout.add("Lunges");
            else if (num ==7)
                workout.add("Reverse Lunges");
            else if (num ==8)
                workout.add("Wall Sits");
            else if (num ==9)
                workout.add("Bulgarian Split Squats");
            else if (num ==10)
                workout.add("Single-Leg Leg Extensions");
        }
        else if (workouttypes.equals("Hamstrings")){
            if (num==1)
                workout.add("Romanian Deadlifts");
            else if (num ==2)
                workout.add("Deadlifts");
            else if (num ==3)
                workout.add("Single Leg Romanian Deadlifts");
            else if (num ==4)
                workout.add("Nordic Hamstring Curls");
            else if (num ==5)
                workout.add("Leg Curls");
            else if (num ==6)
                workout.add("Prone Hamstring Curls");
            else if (num ==7)
                workout.add("HyperExtensions");
            else if (num ==8)
                workout.add("Single Leg Hyper Extensions");
            else if (num ==9)
                workout.add("Single-Leg Leg Curls");
            else if (num ==10)
                workout.add("Good Mornings");
        }
        else if (workouttypes.equals("Calves")){
            if (num==1)
                workout.add("Calf Raises");
            else if (num ==2)
                workout.add("Single Leg Calf Raises");
            else if (num ==3)
                workout.add("Seated Calf Raises");
            else if (num ==4)
                workout.add("Single Leg Seated Calf Raises");
            else if (num ==5)
                workout.add("Calf Raises");
            else if (num ==6)
                workout.add("Single Leg Calf Raises");
            else if (num ==7)
                workout.add("Seated Calf Raises");
            else if (num ==8)
                workout.add("Single Leg Seated Calf Raises");
            else if (num ==9)
                workout.add("Isometric Toe Holds");
            else if (num ==10)
                workout.add("Isometric Toe Holds");
        }
        else if (workouttypes.equals("Groin/Hip")){
            if (num==1)
                workout.add("Squats");
            else if (num ==2)
                workout.add("Dumbell Sumo Squats");
            else if (num ==3)
                workout.add("Fire Hydrants");
            else if (num ==4)
                workout.add("Copenhagen Planks");
            else if (num ==5)
                workout.add("Side Lunges");
            else if (num ==6)
                workout.add("Side Leg Raises");
            else if (num ==7)
                workout.add("Hip Abductor Machine");
            else if (num ==8)
                workout.add("Hip Adductor Machine");
            else if (num ==9)
                workout.add("Banded Side Leg Lift");
            else if (num ==10)
                workout.add("Clamshells");
        }
        else if (workouttypes.equals("Glutes")){
            if (num==1)
                workout.add("Deep Squats");
            else if (num ==2)
                workout.add("Barbell Hip Thrusts");
            else if (num ==3)
                workout.add("Glute Bridges");
            else if (num ==4)
                workout.add("Romanian Deadlifts");
            else if (num ==5)
                workout.add("Single-Leg Romanian Deadlifts");
            else if (num ==6)
                workout.add("Cable Glute Kickbacks");
            else if (num ==7)
                workout.add("Single-Leg Glute Brides");
            else if (num ==8)
                workout.add("Froggy Glute Lifts");
            else if (num ==9)
                workout.add("Donkey Kicks");
            else if (num ==10)
                workout.add("Chinese Planks");
        }
            
        else if (workouttypes.equals("Deadlifts")){
            workout.add("Deadlifts");
        }
        else if (workouttypes.equals("Squats")){
            workout.add("Squats");
        }
        else if (workouttypes.equals("Bench Press")){
            workout.add("Bench Press");
        }
        else if (workouttypes.equals("Power Cleans")){
            workout.add("Power Cleans");
        }else if (workouttypes.equals("Bicep Curls")){
            workout.add("Bicep Curls");
        }else if (workouttypes.equals("Tricep Curls")){
            workout.add("Tricep Curls");
        }else if (workouttypes.equals("Militaries")){
            workout.add("Militaries");
        }else if (workouttypes.equals("Hip Thrusts")){
            workout.add("Hip Thrusts");
        }
        else if (workouttypes.equals("Push Presses")){
            workout.add("Push Presses");
        }else if (workouttypes.equals("Front Squats")){
            workout.add("Front Squats");
        }else if (workouttypes.equals("Lat Pulldowns")){
            workout.add("Lat Pulldowns");
        }else if (workouttypes.equals("Single Arm Dumbbell Rows")){
            workout.add("Single Arm Dumbbell Rows");
        }
        return workout;
    }

}
