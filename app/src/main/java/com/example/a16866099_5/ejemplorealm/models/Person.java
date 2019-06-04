package com.example.a16866099_5.ejemplorealm.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a16866099_5.ejemplorealm.application.MyApplication;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;
    private RealmList<Dog> Dogs;

    public Person() {} //Solo para Realm

    public Person(String name){
        Id = MyApplication.PersonId.incrementAndGet();
        Name = name;
        Dogs = new RealmList<Dog>();
    }

    public int getId(){ return Id; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public RealmList<Dog> getDogs() {
        return Dogs;
    }
}
