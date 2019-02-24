package com.example.ramya.hotelbookingapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView itemTextView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemTextView = itemView.findViewById(R.id.item);
        itemView.setOnClickListener(this);
    }

    public void bindData(String amenityName) {
        itemTextView.setText(amenityName);
    }

    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(view.getContext(), "Item clicked", Toast.LENGTH_SHORT);
        toast.show();
    }
}
