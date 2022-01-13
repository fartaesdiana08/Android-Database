package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PersoanaDAO persoanaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persoana persoana1=new Persoana("Ana",2500);
        Persoana persoana2=new Persoana("Maria",3500);
        Persoana persoana3=new Persoana("Andrei",1000);

        persoanaDAO=DataBaseAcces.getInstance(this).getDatabase().persoanaDAO();

        persoanaDAO.deleteAll();

        persoanaDAO.InsertAll(persoana1,persoana2,persoana3);

        List<Persoana> lista1=persoanaDAO.getAll();
        List<Persoana> listSalarii=persoanaDAO.getAllSalaryHigherThan(2500);
        persoanaDAO.delete(persoana1);
        List<Persoana> list=persoanaDAO.getAll();

        Log.v("Lista1",lista1.toString());
        Log.v("ListaSalarii",listSalarii.toString());
        Log.v("ListaStergere",list.toString());



    }
}