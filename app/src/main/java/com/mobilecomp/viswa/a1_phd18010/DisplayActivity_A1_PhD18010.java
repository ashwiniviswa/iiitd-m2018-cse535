package com.mobilecomp.viswa.a1_phd18010;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.mobilecomp.viswa.a1_phd18010.R;

import java.util.Random;

public class DisplayActivity_A1_PhD18010 extends AppCompatActivity {
    //DisplayActivity_A1_PhD18010
    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__a1__ph_d18010);
        Log.d(TAG, "LOG INFO: State of DisplayActivity is onCreate()");
        Toast onCreateToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onCreate()!", Toast.LENGTH_SHORT);
        onCreateToast.show();
        showDetails();
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to onRestart()");
        Toast restartToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onRestart()!", Toast.LENGTH_SHORT);
        restartToast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to onStart()");
        Toast onStartToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onStart()!", Toast.LENGTH_SHORT);
        onStartToast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to onResume()");
        Toast onResumeToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onResume()!", Toast.LENGTH_SHORT);
        onResumeToast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to onPause()");
        Toast onPauseToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onPause()!", Toast.LENGTH_SHORT);
        onPauseToast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to  onStop()");
        Toast onStopToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onStop()!", Toast.LENGTH_SHORT);
        onStopToast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "LOG INFO: State of DisplayActivity changed to onDestroy()");
        Toast onDestroyToast = Toast.makeText(DisplayActivity_A1_PhD18010.this," DisplayActivity onDestroy()!", Toast.LENGTH_SHORT);
        onDestroyToast.show();
    }


    public String display_nameText,display_Rollno;
    //display_Branch,display_Crs1,display_Crs2,display_Crs3,display_Crs4;
    public void showDetails () {


        Bundle extras = getIntent().getExtras();




        TextView nameView = findViewById(R.id.textview_name);
        String name = extras.getString("Name");
        nameView.setText(getString(R.string.name_string,name));

        TextView rollView=findViewById(R.id.textview_rollno);
        String rollNo = extras.getString("RollNo");
        rollView.setText(getString(R.string.rollno_string,rollNo));

        TextView branchView = findViewById(R.id.textview_branch);
        String displayBranch = extras.getString("Branch");
        branchView.setText(getString(R.string.branch_string,displayBranch));

        TextView crs1View = findViewById(R.id.textview_course1);
        String displayCrs1 = extras.getString("Course1");
        crs1View.setText(getString(R.string.course1_string,displayCrs1));

        TextView crs2View = findViewById(R.id.textview_course2);
        String displayCrs2 = extras.getString("Course2");
        crs2View.setText(getString(R.string.course2_string,displayCrs2));

        TextView crs3View = findViewById(R.id.textview_course3);
        String displayCrs3 = extras.getString("Course3");
        crs3View.setText(getString(R.string.course3_string,displayCrs3));

        TextView crs4View = findViewById(R.id.textview_course4);
        String displayCrs4 = extras.getString("Course4");
        crs4View.setText(getString(R.string.course4_string,displayCrs4));

    }
}
