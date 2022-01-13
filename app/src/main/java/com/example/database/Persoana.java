package com.example.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "persoana")
public class Persoana {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    @ColumnInfo(name = "Name")
    private String nume;

    @ColumnInfo(name = "Salary")
    private Integer salariu;

    public Persoana() { }

    public Persoana(String nume, Integer salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getSalariu() {
        return salariu;
    }

    public void setSalariu(Integer salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }


}
