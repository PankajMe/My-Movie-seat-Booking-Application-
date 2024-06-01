package com.example.mymovieseatbooking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class IdCheckPage extends AppCompatActivity {

    private  FirebaseAuth mfirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_id_check_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mfirebaseAuth = FirebaseAuth.getInstance();
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser mfirebaseUser = mfirebaseAuth.getCurrentUser();
        if(mfirebaseUser!=null){
            //there is some user logged in
            String id = mfirebaseUser.toString();
            Toast.makeText(getApplicationContext(),"id ==>"+id,Toast.LENGTH_LONG).show();
            startActivity(new Intent(IdCheckPage.this, HomePage.class));
        }else {
            // on one login
            startActivity(new Intent(IdCheckPage.this,MainActivity.class));
            finish();
        }}
}