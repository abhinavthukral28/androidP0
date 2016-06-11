package com.abhinavthukral.abhinav_portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View view) {
        String id = getResources().getResourceName(view.getId());
        int index = id.indexOf(":id/");
        id = id.substring(index);
        switch (id){
            case (":id/p1"):
                Toast.makeText(getApplicationContext(), "Link to Popular Movies", Toast.LENGTH_SHORT ).show();
                break;
            case (":id/p2"):
                Toast.makeText(getApplicationContext(), "Link to Stock Hawk", Toast.LENGTH_SHORT ).show();
                break;
            case (":id/p3"):
                Toast.makeText(getApplicationContext(), "Link to Build it Bigger", Toast.LENGTH_SHORT ).show();
                break;
            case (":id/p4"):
                Toast.makeText(getApplicationContext(), "Link to Make your App Material", Toast.LENGTH_SHORT ).show();
                break;
            case (":id/p5"):
                Toast.makeText(getApplicationContext(), "Link to Go Ubiquitous", Toast.LENGTH_SHORT ).show();
                break;
            case (":id/p6"):
                Toast.makeText(getApplicationContext(), "Link to Capstone Project", Toast.LENGTH_SHORT ).show();
                break;
        }

    }
}
