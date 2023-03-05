package com.example.contacts;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonVH extends RecyclerView.ViewHolder
{
    public TextView txt_name,txt_number,txt_address;
    public PersonVH(@NonNull View itemView)
    {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        txt_number = itemView.findViewById(R.id.txt_number);
        txt_address = itemView.findViewById(R.id.txt_address);
    }
}