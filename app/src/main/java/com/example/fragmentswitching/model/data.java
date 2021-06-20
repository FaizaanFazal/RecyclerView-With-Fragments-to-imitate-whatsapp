package com.example.fragmentswitching.model;


public class data {
    String Name,Rollno;
    int img;

    public data(String name, String rollno, int img) {
        this.Name = name;
        this.Rollno = rollno;
        this.img = img;
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
