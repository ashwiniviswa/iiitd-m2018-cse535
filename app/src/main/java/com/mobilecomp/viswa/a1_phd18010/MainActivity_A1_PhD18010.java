package com.mobilecomp.viswa.a1_phd18010;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mobilecomp.viswa.a1_phd18010.R;

public class MainActivity_A1_PhD18010 extends AppCompatActivity {
    final String TAG = "States";
    //MainActivity_A1_PhD18010

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__a1__ph_d18010);
        Log.d(TAG, "LOG INFO: State of MainActivity is onCreate()");
        Toast onCreateToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onCreate()!", Toast.LENGTH_SHORT);
        onCreateToast.show();
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to onRestart()");
        Toast restartToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onRestart()!", Toast.LENGTH_SHORT);
        restartToast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to onStart()");
        Toast onStartToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onStart()!", Toast.LENGTH_SHORT);
        onStartToast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to onResume()");
        Toast onResumeToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onResume()!", Toast.LENGTH_SHORT);
        onResumeToast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to onPause()");
        Toast onPauseToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onPause()!", Toast.LENGTH_SHORT);
        onPauseToast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to  onStop()");
        Toast onStopToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onStop()!", Toast.LENGTH_SHORT);
        onStopToast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "LOG INFO: State of MainActivity changed to onDestroy()");
        Toast onDestroyToast = Toast.makeText(MainActivity_A1_PhD18010.this," MainActivity onDestroy()!", Toast.LENGTH_SHORT);
        onDestroyToast.show();
    }


    public void clearFunction(View view) {

        Button clearButton=findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {


                TextView nameTextView = (TextView)findViewById(R.id.nameEditText);
                nameTextView.setText("");

                TextView rollTextView = (TextView)findViewById(R.id.rollEditText);
                rollTextView.setText("");

                TextView branchTextView = (TextView)findViewById(R.id.branchEditText);
                branchTextView.setText("");

                TextView crs1TextView = (TextView)findViewById(R.id.crs1EditText);
                crs1TextView.setText("");

                TextView crs2TextView = (TextView)findViewById(R.id.crs2EditText);
                crs2TextView.setText("");

                TextView crs3TextView = (TextView)findViewById(R.id.crs3EditText);
                crs3TextView.setText("");

                TextView crs4TextView = (TextView)findViewById(R.id.crs4EditText);
                crs4TextView.setText("");

                Toast myToast = Toast.makeText(MainActivity_A1_PhD18010.this," Cleared!", Toast.LENGTH_SHORT);
                myToast.show();

            }

        });


    }


    public void submitDetails(View view) {
        TextView nameTextView = (TextView)findViewById(R.id.nameEditText);
        String nameText=nameTextView.getText().toString();

        TextView rollTextView = (TextView)findViewById(R.id.rollEditText);
        String rollNoText=rollTextView.getText().toString();

        TextView branchTextView = (TextView)findViewById(R.id.branchEditText);
        String branchText=branchTextView.getText().toString();

        TextView crs1TextView = (TextView)findViewById(R.id.crs1EditText);
        String crs1Text=crs1TextView.getText().toString();

        TextView crs2TextView = (TextView)findViewById(R.id.crs2EditText);
        String crs2Text=crs2TextView.getText().toString();

        TextView crs3TextView = (TextView)findViewById(R.id.crs3EditText);
        String crs3Text=crs3TextView.getText().toString();

        TextView crs4TextView = (TextView)findViewById(R.id.crs4EditText);
        String crs4Text=crs4TextView.getText().toString();

        Intent intent=new Intent(MainActivity_A1_PhD18010.this, com.mobilecomp.viswa.a1_phd18010.DisplayActivity_A1_PhD18010.class);
        Bundle extras = new Bundle();
        extras.putString("Name", nameText);
        extras.putString("RollNo", rollNoText);
        extras.putString("Branch", branchText);
        extras.putString("Course1", crs1Text);
        extras.putString("Course2", crs2Text);
        extras.putString("Course3", crs3Text);
        extras.putString("Course4", crs4Text);

        intent.putExtras(extras);
        startActivity(intent);



    }
}