package com.quest.oops;

public class StudentFactory {
    public static Student getStudent(String studentName) {
        if (studentName.equalsIgnoreCase("online")) {
            Student onlinestudent=new OnlineStd();
            return onlinestudent;
        } else if (studentName.equalsIgnoreCase("offline")) {
            return new OfflineStd();
        }
        else {
            return null;
        }
    }
}
