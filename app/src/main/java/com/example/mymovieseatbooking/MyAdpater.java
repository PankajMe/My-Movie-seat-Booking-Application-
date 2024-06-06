package com.example.mymovieseatbooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdpater extends RecyclerView.Adapter<MyAdpater.MyViewHolder> {

    List<Item> list;
    Context context;

    public MyAdpater(List<Item> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // xml item convert into java object

        View myview = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(myview);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Item user = list.get(position);

        holder.name.setText(user.getName());
        holder.detail.setText(user.getDeatail());
        holder.location.setText(user.getLocation());
        holder.image.setImageResource(user.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name,detail,location;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.ItemName);
            detail = itemView.findViewById(R.id.ItemDetails);
            location = itemView.findViewById(R.id.ItemLocation);
            image = itemView.findViewById(R.id.ItemimageView);
        }

        @Override
        public void onClick(View view) {

            int position = this.getAdapterPosition();
            Item contact = list.get(position);

            Intent ProductView = new Intent(context, ProductView.class);
            ProductView.putExtra("Rname", contact.getName());
            ProductView.putExtra("Rdetail", contact.getDeatail());
            ProductView.putExtra("Rlocation",contact.getLocation());
            ProductView.putExtra("Rimage",contact.getImage());
            context.startActivity(ProductView);
        }
    }
}



