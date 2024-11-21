package com.quest.oops.school;

public class Main {
    public static void main(String[] args) {
        Person std1=new Student("Student1",10,1,new String[]{"English","Maths"});
        Person std2=new Student("Student2",10,2,new String[]{"English","Maths"});
        Person std3=new Student("Student3",10,3,new String[]{"English","Maths"});

        Person tchr1=new Teacher("Teacher1",20,11,new String[]{"English","Maths"});
        Person tchr2=new Teacher("Teacher2",30,12,new String[]{"English","Maths"});
        Person tchr3=new Teacher("Teacher3",40,13,new String[]{"English","Maths"});

School school=new School("ABC School");
school.addStudent((Student) std1);
school.addStudent((Student) std2);
school.addStudent((Student) std3);
school.addTeacher((Teacher) tchr1);
school.addTeacher((Teacher) tchr2);
school.addTeacher((Teacher) tchr3);
school.displaySchoolDetails();

    }
}
