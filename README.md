# Introduction to Java – Lab Assignment 1

## Student Details
- **Name:** Sidharth Krishna S  
- **Course:** B.Sc. Computer Science  
- **Semester:** 3rd Semester  
- **Roll No:** 2401720003  

---

## Subject Information
- **Subject:** Introduction to Java  
- **Task:** Lab Assignment 1  

---

### Code Structure

#### Student Class
- Student class stores individual student details the RollNo,Name,Course,Marks & Grade
- There is a constructor which initializes the student data and a function CalcGrade() for calculating the grade and another function for Display() for displaying the details of eaxh student.

#### StudentManagementSystem Class
- It contains the main() method
- It usese ArrayList<Student> to store multiple student details.
- It also provides a menu so that the user can select which choice he/she wants like Create() for creating a new student and DisplayAll() for displaying all the students.
- Create() is used to create a new student with RollNo,Name,Course & Marks.It also validates whether the Marks inputed by the user are within the range (0-100).
- DisplayAll() is used to display all the students created by the user. It uses s for-loop to go through the ArrayList<Student> students and prints it.
- DisplayChoice() is used to give options to the user using Switch-case.

### Learning Outcome
#### By doing this assigned I learned 
- The principles of OOP in Java.
- Encapsulation
- Using ArrayList to store multiple records.
- Input validation
- Menu-Driven Programs
- Practical Java Skills

### Sample Output 
<img width="1356" height="721" alt="Screenshot (26)" src="https://github.com/user-attachments/assets/bf8235f8-0b6a-4d4c-a3b5-43db4e90ff57" />

<img width="1366" height="725" alt="Screenshot (27)" src="https://github.com/user-attachments/assets/4b71c068-725a-4c56-8c97-a58f51350f6d" />

### How to run the StudentManagementSystem

- Step 1 : Click on Code in blue color.
- Step 2 : Click on the Codespace.
- Step 3 : Click on the '+' sign.
- Step 4 : After opening the VSCode like setup.
- Step 5 : Open terminal 
- Step 6 : Type ' javac StudentManagementSystem.java '
- Step 7 : Type ' java StudentManagementSystem ' 
- OR Clicking on any existing CodeSpace.



### Click here to see the file -> https://github.com/SidharthBScCS/Student-Management-System/blob/main/StudentManagementSystem.java
