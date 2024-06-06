package com.example.mymovieseatbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Payment extends AppCompatActivity {

    String option;
    TextView display;
    Button googlepay,phonepay,pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        googlepay = findViewById(R.id.googlepay);
        phonepay = findViewById(R.id.phonepa);

        googlepay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option.equals("phonepay")){
                    option = "googlepay";
                }else {
                    option = "googlepay";
                }
            }
        });

        phonepay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option.equals("googlepay")){
                    option = "phonepay";
                }else {
                    option = "phonepay";
                }
            }
        });

        String name = getIntent().getStringExtra("dataName");
        String detail = getIntent().getStringExtra("dataDetail");
        String location = getIntent().getStringExtra("dataLocation");
        int image = getIntent().getIntExtra("dataImage",0);
        int price = getIntent().getIntExtra("count",0);


        display =findViewById(R.id.displayPay);

        String info= ("movie name:"+name+"\n"+"movie detail:"+"\n"+"movie location:"+location+"\n"+"movie price:"+price*10);


        pay = findViewById(R.id.Payment);

//        pay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent order = new Intent(Payment.this,Order.class);
//                order.putExtra("dataName",name);
//                order.putExtra("dataDetail",detail);
//                order.putExtra("dataLocation",location);
//                order.putExtra("dataImage",image);
//                order.putExtra("count",price);
//                order.putExtra("option",option);
//                finish();
//
//                Toast.makeText(Payment.this, "payment Done",Toast.LENGTH_SHORT).show();
//            }
//        });

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = info.toString();
                if (!name.isEmpty()) {
                    DatabaseHelper databaseHelper = null;
                    databaseHelper.open();
                    databaseHelper.insertName(name);
                    databaseHelper.close();
                }
            }
        });

    }
}