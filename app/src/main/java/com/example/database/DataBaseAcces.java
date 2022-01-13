package com.example.database;

import android.content.Context;

import androidx.room.Room;

public class DataBaseAcces {

    private Database database;

    private DataBaseAcces(Context context) {

        database= Room.databaseBuilder(context,Database.class,"DB_Seminar").allowMainThreadQueries().build();
        //database= Room.databaseBuilder(context,Database.class,"DB_Seminar").build();
    }

    private static DataBaseAcces instance;

    public static DataBaseAcces getInstance(Context context){
        if(instance==null){
            instance=new DataBaseAcces(context);
        }
        return instance;
    }

    public Database getDatabase(){
        return database;
    }
}
