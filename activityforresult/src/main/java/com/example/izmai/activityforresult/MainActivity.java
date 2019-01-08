package com.example.izmai.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    private  final static int requestCode= 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(data!=null){
            String university = data.getStringExtra("name");
            setUniversitytextView(university);
        }
    }

    public  void startDataActivityOnClick(View view){
        Intent intent = new Intent(this, DataActivity.class);
        startActivityForResult(intent, requestCode);
    }

    public void setUniversitytextView(String university){textViewResult.setText(university);}
}
