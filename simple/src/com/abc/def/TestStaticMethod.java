package com.abc.def;

//Java Program to demonstrate the use of a static method.
class Student{
int rollno;
String name;
static String college = "ITS";
//static method to change the value of static variable
static void change(){
college = "BBDIT";
}
//constructor to initialize the variable
Student(int r, String n){
rollno = r;
name = n;
}
//method to display values
void display(){System.out.println(rollno+" "+name+" "+college);}
}

//Java Program to demonstrate the use of a static method.
class Studentabc{
int rollno;
String name;
static String college = "ITS";
//static method to change the value of static variable
static void change(){
college = "BBDIT";
}
//constructor to initialize the variable
Studentabc(int r, String n){
rollno = r;
name = n;
}
//method to display values
void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
public static void main(String args[]){
Student.change();//calling change method
//creating objects
Student s1 = new Student(111,"Karan12");
Student s2 = new Student(222,"Aryan12");
Student s3 = new Student(333,"Sonoo12");
//calling display method1
//calling display method1
//calling display method
s1.display();
s2.display();
s3.display();
}
}
