package com.bawp.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private String number;
    private EditText get_number;
   // private RequestQueue requestQueue = Volley.newRequestQueue(this);;

    ArrayList<Dataclass> DataList = new ArrayList<>();
    String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.Submit_button);
        get_number = findViewById(R.id.phone_number);
//        getQuestions();


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               number = String.valueOf(get_number.getText());
               if(number.equals("25522552")){
                   Intent intent = new Intent(MainActivity.this , MainActivity2.class);

                   intent.putExtra("phone_number", number);
                   // start the Intent
                   startActivity(intent);

               }
               else{
                   Toast.makeText(MainActivity.this, "Write correct number  !!!", Toast.LENGTH_SHORT).show();
               }



            }


        });








    }
//    void getQuestions() {
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
//                url, null, response -> {
//          //  Log.d("manish", "getQuestions: "+response.length());
//
//            for (int i = 0; i < response.length(); i++) {
//                try {
//                    Dataclass dataclass = new Dataclass();
//                    dataclass.setStatus(String.valueOf(response.getJSONObject("status")));
//                    dataclass.setOTP(String.valueOf(response.getJSONObject("otp")));
//                   // Log.d("hello peter", "getQuestions: "+"is empty");
//                    DataList.add(dataclass);
//
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//
//
//        }, error -> {
//
//        });
//
//        requestQueue.add(jsonObjectRequest);
//
//        if(DataList.isEmpty()){
//          Log.d("hello peter", "getQuestions: "+"is empty");
//        }


//    }
}