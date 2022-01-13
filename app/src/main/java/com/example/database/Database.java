package com.example.database;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Persoana.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract PersoanaDAO persoanaDAO();
}
