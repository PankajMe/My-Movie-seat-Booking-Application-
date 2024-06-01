package com.example.mymovieseatbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeatBooking extends AppCompatActivity {

    TextView display;
    Button buySeat;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    public  int count;
    boolean arr[] = new boolean[16];
    private Boolean flag[] ={false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seat_booking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buySeat = findViewById(R.id.BuySeat);
        b1 = findViewById(R.id.s1);
        b2 = findViewById(R.id.s2);
        b3 = findViewById(R.id.s3);
        b4 = findViewById(R.id.s4);
        b5 = findViewById(R.id.s5);
        b6 = findViewById(R.id.s6);
        b7 = findViewById(R.id.s7);
        b8 = findViewById(R.id.s8);
        b9 = findViewById(R.id.s9);
        b10 = findViewById(R.id.s10);
        b11 = findViewById(R.id.s11);
        b12 = findViewById(R.id.s12);
        b13 = findViewById(R.id.s13);
        b14 = findViewById(R.id.s14);
        b15 = findViewById(R.id.s15);
        b16 = findViewById(R.id.s16);

        display = findViewById(R.id.display);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[0]){
                    flag[0]=true;
                    b1.setImageResource(R.drawable.charfull);
                }else{
                    flag[0]=false;
                    b1.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[0]){
                    count++;
                    arr[0] = true;
                }else {
                    count--;
                    arr[0] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[1]){
                    flag[1]=true;
                    b2.setImageResource(R.drawable.charfull);
                }else{
                    flag[1]=false;
                    b2.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[1]){
                    count++;
                    arr[1] = true;
                }else {
                    count--;
                    arr[1] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[2]){
                    flag[2]=true;
                    b3.setImageResource(R.drawable.charfull);
                }else{
                    flag[2]=false;
                    b3.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[2]){
                    count++;
                    arr[2] = true;
                }else {
                    count--;
                    arr[2] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[3]){
                    flag[3]=true;
                    b4.setImageResource(R.drawable.charfull);
                }else{
                    flag[3]=false;
                    b4.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[3]){
                    count++;
                    arr[3] = true;
                }else {
                    count--;
                    arr[3] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[4]){
                    flag[4]=true;
                    b5.setImageResource(R.drawable.charfull);
                }else{
                    flag[4]=false;
                    b5.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[4]){
                    count++;
                    arr[4] = true;
                }else {
                    count--;
                    arr[4] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[5]){
                    flag[5]=true;
                    b6.setImageResource(R.drawable.charfull);
                }else{
                    flag[5]=false;
                    b6.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[5]){
                    count++;
                    arr[5] = true;
                }else {
                    count--;
                    arr[5] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[6]){
                    flag[6]=true;
                    b7.setImageResource(R.drawable.charfull);
                }else{
                    flag[6]=false;
                    b7.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[6]){
                    count++;
                    arr[6] = true;
                }else {
                    count--;
                    arr[6] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[7]){
                    flag[7]=true;
                    b8.setImageResource(R.drawable.charfull);
                }else{
                    flag[7]=false;
                    b8.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[7]){
                    count++;
                    arr[7] = true;
                }else {
                    count--;
                    arr[7] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[8]){
                    flag[8]=true;
                    b9.setImageResource(R.drawable.charfull);
                }else{
                    flag[8]=false;
                    b9.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[8]){
                    count++;
                    arr[8] = true;
                }else {
                    count--;
                    arr[8] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[9]){
                    flag[9]=true;
                    b10.setImageResource(R.drawable.charfull);
                }else{
                    flag[9]=false;
                    b10.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[9]){
                    count++;
                    arr[9] = true;
                }else {
                    count--;
                    arr[9] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[10]){
                    flag[10]=true;
                    b11.setImageResource(R.drawable.charfull);
                }else{
                    flag[10]=false;
                    b11.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[10]){
                    count++;
                    arr[10] = true;
                }else {
                    count--;
                    arr[10] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[11]){
                    flag[11]=true;
                    b12.setImageResource(R.drawable.charfull);
                }else{
                    flag[11]=false;
                    b12.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[11]){
                    count++;
                    arr[11] = true;
                }else {
                    count--;
                    arr[11] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[12]){
                    flag[12]=true;
                    b13.setImageResource(R.drawable.charfull);
                }else{
                    flag[12]=false;
                    b13.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[12]){
                    count++;
                    arr[12] = true;
                }else {
                    count--;
                    arr[12] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[13]){
                    flag[13]=true;
                    b14.setImageResource(R.drawable.charfull);
                }else{
                    flag[13]=false;
                    b14.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[13]){
                    count++;
                    arr[13] = true;
                }else {
                    count--;
                    arr[13] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!flag[14]){
                    flag[14]=true;
                    b15.setImageResource(R.drawable.charfull);
                }else{
                    flag[14]=false;
                    b15.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[14]){
                    count++;
                    arr[14] = true;
                }else {
                    count--;
                    arr[14] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(!flag[15]){
                    flag[15]=true;
                    b16.setImageResource(R.drawable.charfull);
                }else{
                    flag[15]=false;
                    b16.setImageResource(R.drawable.chairemtpy);
                }
                if(!arr[15]){
                    count++;
                    arr[15] = true;
                }else {
                    count--;
                    arr[15] = false;
                }
                display.setText("total amount: "+count*100+"\n"+count+"seats booked");
            }
        });



        buySeat.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                Intent data = new Intent(SeatBooking.this, Payment.class);

                data.putExtra("count",count);
                startActivity(data);

            }
        });

    }
}