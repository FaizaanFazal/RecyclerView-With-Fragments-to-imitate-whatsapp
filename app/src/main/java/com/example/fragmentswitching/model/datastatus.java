package com.example.fragmentswitching.model;

import java.util.List;

public class datastatus {
    String Name;
    String Rollno;
    int image;

    public datastatus(String name, String rollno,int image) {
        Name = name;
        Rollno = rollno;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }
}
