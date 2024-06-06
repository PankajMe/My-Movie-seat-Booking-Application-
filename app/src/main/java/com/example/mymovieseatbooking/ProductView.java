package com.example.mymovieseatbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductView extends AppCompatActivity {

    TextView name,detail,location;
    ImageView image;
    Button selectseat;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        selectseat = findViewById(R.id.SelectSeat);

        name=findViewById(R.id.textView5);
        detail=findViewById(R.id.textView6);
        location=findViewById(R.id.textView7);
        image=findViewById(R.id.imageView2);

        Intent adpater = getIntent();
        String movieName = adpater.getStringExtra("Rname");
        String moviedetail = adpater.getStringExtra("Rdetail");
        String movielocation = adpater.getStringExtra("Rlocation");

        name.setText(movieName);
        detail.setText(moviedetail);
        location.setText(movielocation);
        image.setImageResource(adpater.getIntExtra("Rimage",0));


        selectseat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProductView.this, SeatBooking.class);
                intent.putExtra("dataName", movieName);
                intent.putExtra("dataDetail", moviedetail);
                intent.putExtra("dataLocation", movielocation);
                intent.putExtra("dataImage", adpater.getIntExtra("Rimage",0));
                startActivity(intent);

            }
        });
    }
}