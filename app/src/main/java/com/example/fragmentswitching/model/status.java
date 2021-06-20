package com.example.fragmentswitching.model;

public class status {
    String Name, Rollno;

    public status(String name, String rollno) {
        Name = name;
        Rollno = rollno;
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
