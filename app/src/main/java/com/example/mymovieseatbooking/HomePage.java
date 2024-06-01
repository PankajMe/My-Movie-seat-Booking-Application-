package com.example.mymovieseatbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    List<Item> items =new ArrayList<>();
    Button profile,order,history;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView =findViewById(R.id.recyclerView);

        items.add(new Item("movie1","","jaipur",10,R.drawable.a));
        items.add(new Item("movie2","","jaipur",10,R.drawable.a));
        items.add(new Item("movie3","","jaipur",10,R.drawable.a));
        items.add(new Item("movie4","","jaipur",10,R.drawable.a));
        items.add(new Item("movie5","","jaipur",10,R.drawable.a));
        items.add(new Item("movie6","","jaipur",10,R.drawable.a));
        items.add(new Item("movie7","","jaipur",10,R.drawable.a));

        MyAdpater myAdpater = new MyAdpater(items,this);
        recyclerView.setAdapter(myAdpater);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        profile = findViewById(R.id.profile);
        order = findViewById(R.id.order);
        history = findViewById(R.id.history);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, Profile.class);
                startActivity(intent);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(HomePage.this, Order.class);
//                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(HomePage.this, History.class);
//                startActivity(intent);
            }
        });
    }
}