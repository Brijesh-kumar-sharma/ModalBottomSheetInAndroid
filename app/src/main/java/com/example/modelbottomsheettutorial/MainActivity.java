package com.example.modelbottomsheettutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private Button showbottomsheet;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        showbottomsheet=findViewById(R.id.showbottomsheet);

        showbottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.BottomSheetTheme);
                View sheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetlayout,null);


                sheetview.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Share is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                sheetview.findViewById(R.id.comment).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Comment is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                sheetview.findViewById(R.id.programming).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"Programming is Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                sheetview.findViewById(R.id.gotosecond).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,second.class);
                        startActivity(intent);
                    }
                });

                bottomSheetDialog.setContentView(sheetview);
                bottomSheetDialog.show();


            }
        });

    }
}