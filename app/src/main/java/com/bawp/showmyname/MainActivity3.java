package com.bawp.showmyname;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    ArrayList<Ordering> order = new ArrayList<>();
    private TextView orderText;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private CardView search_Card;
    private LinearLayout linearLayout;
    private ImageView order_view;
    private ImageView home_image;
    private ImageView menu_image;
    private ImageView setting_image;
    private ImageView account_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        orderText = findViewById(R.id.textView2);
        search_Card = findViewById(R.id.search_card);
        recyclerView = findViewById(R.id.recycler_view);
        linearLayout = findViewById(R.id.bottom_sheet);
        order_view = findViewById(R.id.order_image);
        home_image = findViewById(R.id.home_image);
        menu_image = findViewById(R.id.menu_image);
        setting_image = findViewById(R.id.setting_image);
        account_image = findViewById(R.id.account_image);


        order_view.setOnClickListener(v -> {
            orderText.setVisibility(View.VISIBLE);
            search_Card.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.VISIBLE);

        });

        home_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderText.setVisibility(View.INVISIBLE);
                search_Card.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.INVISIBLE);
            }
        });

        search_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderText.setVisibility(View.INVISIBLE);
                search_Card.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.INVISIBLE);
            }
        });

        setting_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderText.setVisibility(View.INVISIBLE);
                search_Card.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.INVISIBLE);
            }
        });
        account_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderText.setVisibility(View.INVISIBLE);
                search_Card.setVisibility(View.INVISIBLE);
                recyclerView.setVisibility(View.INVISIBLE);
            }
        });




        for(int i = 0 ; i<10 ; i++){
            Ordering ordering = new Ordering();
            ordering.setOrders("2000" +i);
            order.add(ordering);
        }
        Log.d("hello", "onCreate: "+order.size());


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getApplicationContext() , order);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);
    }
}