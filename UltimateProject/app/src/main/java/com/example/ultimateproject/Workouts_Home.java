package com.example.ultimateproject;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.view.MotionEvent;
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
    Button add_workoutbtn;
    Button ran_workoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWorkoutsHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        add_workoutbtn = findViewById(R.id.addworkoutbtn);
        ran_workoutbtn = findViewById(R.id.randomworkout);
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
                        for (String exer : workoutList){
                            workouts_format.append(exer).append("\n");
                        }
                        workouts_format.append(workouts.getText());
                        workouts.setText(workouts_format);
                        //Toast.makeText(Workouts_Home.this,"You Clicked " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
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
                            workouts_format.append(exer).append("\n");
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
    }

}