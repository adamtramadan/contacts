package com.example.contacts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private Context context;
    ArrayList<Person> list = new ArrayList<>();
    public Adapter(Context ctx)
    {
        this.context = ctx;
    }
    public void setItems(ArrayList<Person> person)
    {
        list.addAll(person);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);
        return new PersonVH(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        PersonVH vh = (PersonVH) holder;
        Person person = list.get(position);
        vh.txt_name.setText(person.getName());
        vh.txt_number.setText(person.getNumber());
        vh.txt_address.setText(person.getAddress());
    }

//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, Person p)
//    {
//        PersonVH vh = (PersonVH) holder;
//        Person person = p==null? list.get(position):p;
//        vh.txt_name.setText(person.getName());
//        vh.txt_number.setText(person.getNumber());
//        vh.txt_address.setText(person.getAddress());
//
//    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
}
