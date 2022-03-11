package com.company;



class Student{
    String name;
    int rollno;
    String college;


    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;

    }
    Student(String college){
        this("qadeer",42);
        this.college=college;
    }

}
public class  SixB{

    public static void main(String[] args) {
//object creation
        Student s = new Student("MJCET");
        System.out.println(s.name+"   "+s.rollno+"    "+s.college);
    }
}

