package com.example.ultimateproject;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Application;
import android.content.Context;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.view.MotionEvent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Button;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Spinner;
import com.example.ultimateproject.databinding.ActivityWorkoutsHomeBinding;

import org.w3c.dom.Text;

import java.util.List;

public class Workouts_Home extends AppCompatActivity {

    private ActivityWorkoutsHomeBinding binding;
    private WorkoutPicker picker = new WorkoutPicker();
    private static Application sApplication;
    Button add_workoutbtn;
    Button ran_workoutbtn;
    Button remove_workoutbtn;
    Button new_workoutbtn;
    TextView reps;
    TextView weight;
    //TextView workouts = (TextView) findViewById(R.id.Workout_list);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkoutsHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        reps = findViewById(R.id.reps);
        weight = findViewById(R.id.weight);
        add_workoutbtn = findViewById(R.id.addworkoutbtn);
        ran_workoutbtn = findViewById(R.id.randomworkout);
        remove_workoutbtn = findViewById(R.id.removeworkout);
        new_workoutbtn = findViewById(R.id.newdaybtn);
        TextView workouts = (TextView) findViewById(R.id.Workout_list);

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        add_workoutbtn.setOnClickListener(new View.OnClickListener() { //Create a popup when add_workoutbtn is pressed
            @Override
            public void onClick(View view) {
                //initilize popup menu
                PopupMenu popupMenu = new PopupMenu(Workouts_Home.this,add_workoutbtn);
                //inflate popup menu
                popupMenu.getMenuInflater().inflate(R.menu.add_workout_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        //This is what happens after the user clicks a menu item - should add item to the workout
                        String workout = menuItem.getTitle().toString();
                        List<String> workoutList = picker.getWorkouts(workout);
                        StringBuilder workouts_format = new StringBuilder();
                        if (workout.equals("**CUSTOM**")){
                            AlertDialog.Builder builder = new AlertDialog.Builder(Workouts_Home.this);
                            builder.setTitle("Enter New Exercise");
                            // Set up the input
                            EditText input = new EditText(Workouts_Home.this);
                            input.setInputType(InputType.TYPE_CLASS_TEXT);
                            builder.setView(input);
                            builder.setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    workouts_format.append(input.getText().toString()).append(" " + reps.getText().toString() + "x" + weight.getText().toString()).append("  \n");
                                    workouts_format.append(workouts.getText());
                                    workouts.setText(workouts_format);
                                }
                            });
                            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });
                            builder.show();
                        }
                        else {
                            for (String exer : workoutList) {
                                workouts_format.append(exer).append(" " + reps.getText().toString() + "x" + weight.getText().toString()).append("  \n");
                            }
                            workouts_format.append(workouts.getText());
                            workouts.setText(workouts_format);
                        }
                        return true;
                    }
                });
                //show popup menu
                popupMenu.show();
            }
        });
        ran_workoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initilize popup menu
                PopupMenu ran_popupMenu = new PopupMenu(Workouts_Home.this,ran_workoutbtn);
                //inflate popup menu
                ran_popupMenu.getMenuInflater().inflate(R.menu.add_random_menu,ran_popupMenu.getMenu());
                ran_popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem){
                        //This is what happens after the user clicks a menu item - should add item to the workout
                        String workout = menuItem.getTitle().toString();
                        List<String> workoutList = picker.getWorkouts(workout);
                        StringBuilder workouts_format = new StringBuilder();
                        for (String exer : workoutList){
                            workouts_format.append(exer).append(" " + reps.getText().toString() + "x" + weight.getText().toString()).append("  \n");
                        }
                        workouts_format.append(workouts.getText());
                        workouts.setText(workouts_format);
                        return true;
                    }
                });
                //show popup menu
                ran_popupMenu.show();
            }
        });
        remove_workoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder workouts_format = new StringBuilder();
                String wklist = workouts.getText().toString();
                for (int i =0;i < wklist.length()-4;i++){
                    if (wklist.charAt(i) == ' ' && wklist.charAt(i+1) == ' '){//if we find a double space
                        workouts_format.append(workouts.getText());
                        workouts_format.delete(0,i+3);
                        workouts.setText(workouts_format);
                        break;
                    }
                }
            }
        });
        new_workoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date currentTime = Calendar.getInstance().getTime();
                StringBuilder workouts_format = new StringBuilder();
                workouts_format.append("\n").append(currentTime.toString()).append("  \n");
                workouts_format.append(workouts.getText());
                workouts.setText(workouts_format);

            }

        });

    }
    protected void onResume(){
        super.onResume();
        TextView workouts = (TextView) findViewById(R.id.Workout_list);
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String sworkouts = sh.getString("sworkouts", "");
        workouts.setText(sworkouts);
    }
    protected void onPause(){
        super.onPause();
        TextView workouts = (TextView) findViewById(R.id.Workout_list);
        //do stuff when the activity is destroyed
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        // Creating an Editor
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        // Storing the key and its value
        myEdit.putString("sworkouts", workouts.getText().toString());
        myEdit.apply();
    }


}