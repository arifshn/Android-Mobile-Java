package com.arif.ybs4bhafta4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText my_txt_num_1 ;
    EditText my_txt_num_2 ;

    TextView my_message_result ;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        my_txt_num_1 = findViewById(R.id.txt_num1);
        my_txt_num_2 = findViewById(R.id.txt_num2);

        my_message_result = findViewById(R.id.textview_new);

        System.out.println("İlk çalışan motor create bloku");
    }

    @SuppressLint("SetTextI18n")
    public void sum(View view){
    int num1 = Integer.parseInt(my_txt_num_1.getText().toString());
    int num2 = Integer.parseInt(my_txt_num_2.getText().toString());

    int my_result =num1+num2;
        my_message_result.setText(getString(R.string.result_of_sum)+my_result);
    }



    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Your app is just started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Welcome back to the resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Your app is paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Your app is stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Your app is restarting");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Your app is closed/destroyed");
    }
}

