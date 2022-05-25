package com.cdev.rotayoklama.common;

public class Checkup {
    public int id;
    public String date;
    public int studentId;
    public int teacherId;
    public boolean option;

    public Checkup(int id, String date, int studentId, int teacherId, int option) {
        this.id = id;
        this.date = date;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.option = option == 0;
    }
}
