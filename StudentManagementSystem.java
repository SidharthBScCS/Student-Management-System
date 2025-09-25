/* Coded by | Sidharth Krishna | 2401720003 | BSc Computer Science | 3rd Semester | Java | Lab Assignment 1 | */ 

import java.util.*;
class Student{
    int RollNo;
    String Name;
    String Course;
    double Marks;
    char Grade;

    Student(int RollNo,String Name,String Course,double Marks){
        this.RollNo=RollNo;
        this.Name=Name;
        this.Course=Course;
        this.Marks=Marks;
        this.Grade=CalcGrade();
    }

    char CalcGrade(){
        if(Marks>=90){
            return 'A';
        }
        else if(Marks>=80 && Marks<=89){
            return 'B';
        }
        else if(Marks>=70 && Marks<=79){
            return 'C';
        }
        else if(Marks>=60 && Marks<=69){
            return 'D';
        }
        else if(Marks>=50 && Marks<=59){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    void Display(){
        System.out.println("Roll No: "+this.RollNo);
        System.out.println("Name: "+this.Name);
        System.out.println("Course: "+this.Course);
        System.out.println("Marks: "+this.Marks);
        System.out.println("Grade: "+this.Grade);
        System.out.println("_________________________________");
    }
}

public class StudentManagementSystem{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args){
        int choice;
        do{
            DisplayChoice();
            System.out.print("Enter Choice: ");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    Create();
                    break;
                case 2:
                    DisplayAll();
                    break;
                case 3:
                    System.out.println("Exited......");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while(choice!=3);
    }

    public static void DisplayChoice(){

        System.out.println("1.Create student");
        System.out.println("2.Display all students");
        System.out.println("3.Exit");
    }

    public static void Create(){

        System.out.print("Enter Roll No: ");
        int RollNo=scan.nextInt();
        scan.nextLine();

        System.out.print("Enter student's name: ");
        String Name=scan.nextLine();

        System.out.print("Enter student's course: ");
        String Course=scan.nextLine();

        double Marks;
        while(true){
            System.out.print("Enter student's total marks: ");
            Marks=scan.nextDouble();
            scan.nextLine();
            if(Marks<0 || Marks>100){
                System.out.println("Invalid Marks......");
            }
            else{
                break;
            }
        }

        Student S = new Student(RollNo,Name,Course,Marks);
        students.add(S);
    }

    public static void DisplayAll(){

        if(students.isEmpty()){
            System.out.println("No data of students founded......");
        }
        for(Student X:students){
            X.Display();
        }
    }
}


