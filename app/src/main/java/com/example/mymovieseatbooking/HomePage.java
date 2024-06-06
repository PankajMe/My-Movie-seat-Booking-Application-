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
    Button profile,order,history,Database;
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




        items.add(new Item("Mr. & Mrs. Mahi","Mahendra, a failed cricketer and Mahima, " + "a doctor are brought together by the virtue of an arranged marriage. Having the same nickname, Mahi, together they become Mr. and Mrs. Mahi. They soon discover their common love and passion for Cricket","Raj Mandir Cinema jaipur",12,R.drawable.a1));
        items.add(new Item("Mad Max Saga","As the world fell, young Furiosa is snatched from the Green Place of Many Mothers and falls into the hands of a great Biker Horde led by the Warlord Dementus","Kohinoor Cinema jaipur",120,R.drawable.a2));
        items.add(new Item("Srikanth","In a world with odds stacked against him in every step of the way, Srikanth defies norms, blazing a trail from rural India to becoming the first visually impaired student at MIT","Kohinoor Cinema jaipur",110,R.drawable.a3));
        items.add(new Item("Bhaiyya Ji","After his younger brother is tragically killed over a petty argument, a feared and retired criminal Bhaiyya Ji, sets out to seek justice against the powerful Gujjar responsible, mobilizing his loyal comrades and igniting a wave of vengeance that threatens to shake the criminal underworld.","delhi",120,R.drawable.a4));
        items.add(new Item("Savi","Savi, a simple housewife, attempts a daring jailbreak to get her husband out of one of England`s high-security prisons consisting of 400 inmates, 75 armed guards, and 60 surveillance cameras.","Delite Cinema delhi/jaipur",10,R.drawable.a5));
        items.add(new Item("Kingdom of the Planet of the Apes","Set several generations in the future following Caesar`s reign, where apes are the dominant species living harmoniously and humans have been reduced to living in the shadows.\n" +
                "\n" +
                "As a new tyrannical ape leader builds his empire, one young ape undertakes a harrowing journey that will cause him to question all that he has known about the past and to make choices that will define a future for apes and humans alike","Delite Cinema jaipur/delhi",170,R.drawable.a6));
        items.add(new Item("Chhota Bheem and the Curse of Damyaan (Hindi)","Bheem and his friend`s time-travel 1000 years to Sonapur to stop Evil Demon Damyaan from becoming immortal. Racing against time, the showdown with Damyaan will determine humanity`s fate.\n" +
                "\n" +
                "The epic battle unfolds in Sonapur, offering a suspenseful, magical ride. Will Bheem save the world from a serpent apocalypse?","delhi",190,R.drawable.a7));

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
                Intent intent = new Intent(HomePage.this, Order.class);
                startActivity(intent);
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