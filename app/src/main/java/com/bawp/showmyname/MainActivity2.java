package com.bawp.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;

public class MainActivity2 extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private TextView otp_num;
    private Button verify;
    private PinView pinView;
    String otp;




    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        otp_num = findViewById(R.id.confirm_OTP);
        verify = findViewById(R.id.Verify);
        pinView = findViewById(R.id.pinview);



        Intent intent = getIntent();
        String number = intent.getStringExtra("phone_number");
        otp_num.setText("Enter the code we have sent to "+ number + " via SMS" );

        pinView.setText("123456");


        int num = Integer.parseInt(String.valueOf(pinView.getText()));




        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num == 123456){

                    Intent intent1 = new Intent(MainActivity2.this , MainActivity3.class);
                    startActivity(intent1);

                }
                else{
                    Toast.makeText(MainActivity2.this, "enter correct OTP", Toast.LENGTH_SHORT).show();
                }


            }
        });







    }
}