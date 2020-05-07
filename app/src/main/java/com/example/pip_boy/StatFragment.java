package com.example.pip_boy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;

public class StatFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_stat, container, false);
        //generate random numbers
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        TextView brain = (TextView) rootView.findViewById(R.id.intnum);
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        TextView strength = (TextView) rootView.findViewById(R.id.strnum);
        Random random2 = new Random();
        int randomNumber2 = random2.nextInt(100);
        TextView agility = (TextView) rootView.findViewById(R.id.dexnum);
        Random random3 = new Random();
        int randomNumber3 = random3.nextInt(100);
        TextView charisma = (TextView) rootView.findViewById(R.id.charnum);
        Random random4 = new Random();
        int randomNumber4 = random4.nextInt(100);
        TextView endurance = (TextView) rootView.findViewById(R.id.endnum);
        Random random5 = new Random();
        int randomNumber5 = random5.nextInt(100);
        TextView luck = (TextView) rootView.findViewById(R.id.lucknum);
        brain.setText(String.valueOf(randomNumber));
        strength.setText(String.valueOf(randomNumber1));
        agility.setText(String.valueOf(randomNumber2));
        charisma.setText(String.valueOf(randomNumber3));
        endurance.setText(String.valueOf(randomNumber4));
        luck.setText(String.valueOf(randomNumber5));

        TextView gender = (TextView) rootView.findViewById(R.id.genderBox);
        TextView classType = (TextView) rootView.findViewById(R.id.classBox);
        TextView name = (TextView) rootView.findViewById(R.id.namebox);
        TextView age = (TextView) rootView.findViewById(R.id.agebox);
        name.setText("NAME: " + MainActivity.name);
        age.setText("AGE: " + MainActivity.age);
        gender.setText("GENDER: " + MainActivity.gender);
        classType.setText("CLASS: " + MainActivity.classType);
        return rootView;

    }
}
