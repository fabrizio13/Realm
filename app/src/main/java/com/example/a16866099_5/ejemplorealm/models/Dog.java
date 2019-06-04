package com.example.a16866099_5.ejemplorealm.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a16866099_5.ejemplorealm.application.MyApplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Dog extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;

    public Dog() {} //Solo para Realm

    public Dog(String name){
        Id = MyApplication.DogId.incrementAndGet();
        Name = name;
    }

    public int getId(){ return Id; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
