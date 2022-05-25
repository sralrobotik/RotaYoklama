package com.cdev.rotayoklama.common;

public class Account {
    public enum AccountType{
        STUDENT, TEACHER
    }

    public int id;
    public String username;
    public String password;
    public AccountType type;
    public String name;
    public int number;
    public int classId;
    public Account(int id, String username, String password, int type, String name, int number, int classId){
        this.id = id;
        this.username = username;
        this.password = password;
        this.type = type == 0 ? AccountType.TEACHER : AccountType.STUDENT;
        this.name = name;
        this.number = number;
        this.classId = classId;
    }
}
