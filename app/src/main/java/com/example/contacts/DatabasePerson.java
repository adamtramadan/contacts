package com.example.contacts;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class DatabasePerson {
    private DatabaseReference databaseReference;
    public DatabasePerson()
    {
        FirebaseDatabase db =FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Person.class.getSimpleName());
    }

    public  Task<Void> add(Person person)
    {
        return databaseReference.push().setValue(person);
    }

    public Query get(String key)
    {
        if (key == null){
            return databaseReference.orderByKey().limitToFirst(8);

        }
        return databaseReference.orderByKey().startAfter(key).limitToFirst(8);
    }

}
