package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_number = findViewById(R.id.edit_number);
        final EditText edit_address = findViewById(R.id.edit_address);
        Button btn = findViewById(R.id.btn_save);

        Button btn_open = findViewById(R.id.btn_open);
        btn_open.setOnClickListener(v->
        {
            Intent intent =new Intent(MainActivity.this, RvActivity.class);
            startActivity(intent);
        });

        DatabasePerson databasePerson = new DatabasePerson();

        btn.setOnClickListener(v->
        {
            Person person = new Person(edit_name.getText().toString(), edit_number.getText().toString(), edit_address.getText().toString());
           // if(emp_edit==null)
           // {
            databasePerson.add(person).addOnSuccessListener(suc ->
                {
                    Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er ->
                {
                    Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
                });
          //  }

           /* else
            {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("name", edit_name.getText().toString());
                hashMap.put("position", edit_position.getText().toString());
                dao.update(emp_edit.getKey(), hashMap).addOnSuccessListener(suc ->
                {
                    Toast.makeText(this, "Record is updated", Toast.LENGTH_SHORT).show();
                    finish();
                }).addOnFailureListener(er ->
                {
                    Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
                });
            }

            */
        });



    }
}