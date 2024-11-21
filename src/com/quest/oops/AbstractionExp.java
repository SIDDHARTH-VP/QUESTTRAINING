package com.quest.oops;

public class AbstractionExp {
    public static void main(String[] args) {
        Student online = new OnlineStd();
        Student offline = new OfflineStd();
        Student regular = new RegularStudent();
        online.attendClass();
        online.submitAssignment();

        offline.attendClass();
        offline.submitAssignment();

        regular.attendClass();
        regular.submitAssignment();


        Student onlinestudent=StudentFactory.getStudent("online");
        Student offlinestudent=StudentFactory.getStudent("offline");
//        Student regularstudent=StudentFactory.getStudent("regular");

        onlinestudent.attendClass();
        offlinestudent.attendClass();
//        regularstudent.attendClass();
        onlinestudent.submitAssignment();
        offlinestudent.submitAssignment();
//        regularstudent.submitAssignment();
    }
}
