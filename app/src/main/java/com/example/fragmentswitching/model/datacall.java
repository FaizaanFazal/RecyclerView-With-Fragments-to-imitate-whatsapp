package com.example.fragmentswitching.model;

public class datacall {
    String Name,Rollno;
    int image,ic;

    public datacall(String name, String rollno,int image,int ic) {
        Name = name;
        Rollno = rollno;
        this.image=image;
        this.ic= ic;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
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
