package com.example.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersoanaDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void InsertAll(Persoana... persoane);

    @Delete
    void delete(Persoana persoana);

    @Query("SELECT * FROM persoana")
    List<Persoana> getAll();

    @Query("SELECT * FROM PERSOANA WHERE Salary>2500")
    List<Persoana> getAllWithSalary();

    @Query("SELECT * FROM PERSOANA WHERE SALARY>:value")
    List<Persoana> getAllSalaryHigherThan(int value);

    @Query("DELETE FROM persoana")
    void deleteAll();
}
