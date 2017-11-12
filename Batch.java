/* 
        Code for OOM Assignment 5a by LUV || IIT2016085
*/

package StudentDatabase;

import java.util.*;




public class Batch{
    private int size_total, size_graduate, department;  // size_total : number of students, size_graduate : number of graduating students
    private ArrayList <Student>  student;          //Array of object of Student
    public Batch(){
        this.size_graduate = 0;
        student = new ArrayList <Student> ();
    }
    public void AddStudent(Student s){
        student.add(s);
    }
    public String getdata(int i){
        String myString = student.get(i).Display();
        return ("<html>" + myString.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
    }
    public int getstudentsize(){
        return student.size();
    }
    public void deletedata(int i){
        student.remove(i);
    }
    public int search(String roll){
        int ret = -1;
        for(int i = 0; i < student.size(); ++i){
            if(student.get(i).getroll_num().compareTo(roll) == 0){
                ret = i;
                break;
            }
        }
        return ret;
    } 
}

abstract class Student{                 // Student Class having abstract Display method, also the base class for inheritance
    private String course, name, roll_num;
    private int period_reg, credits;
    public Student(String course, String roll_num, String name, int period_reg, int credits){
        this.course = course;
        this.roll_num = roll_num;
        this. name = name;
        this.period_reg = period_reg;
        this.credits = credits;
    }
    public abstract String Display();
    public String getcourse(){          // Getter methods
        return course;
    }
    public String getroll_num(){
        return roll_num;
    }
    public String getname(){
        return name;
    }
    public int getperiod_reg(){
        return period_reg;
    }
    public int getcredits(){
        return credits;
    }
    
}

class UG extends Student{        //Derived UG class
    private String department;
    private int cgpa;
    public UG(String course, String roll_num, String name, String department, int period_reg, int cgpa, int credits){
        super(course, roll_num, name, period_reg, credits);
        this.department = department;
        this.cgpa = cgpa;
    }
    public String Display(){
        if((getperiod_reg() >= 4 || getperiod_reg() <= 7) && (getcredits() >= 185)){
            return ("Roll Number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + department + "\nCgpa : " + cgpa+"\nStatus : Pass");
        }
        return ("Roll Number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + department + "\nCgpa : " + cgpa+"\nStatus : Fail");
    }
}
 
class PG extends Student{        // Derived PG class
    private String department, specialization, thesis;
    private int cgpa;
    public PG(String course, String roll_num, String name, String department, String specialization, int period_reg, int cgpa, int credits, String thesis){
        super(course, roll_num, name, period_reg, credits);
        this.department = department;
        this.specialization = specialization;
        this.cgpa = cgpa;
        this.thesis = thesis;
    }
    public String Display(){
        if((getperiod_reg() >= 2 || getperiod_reg() <= 4) && (getcredits() >= 80)){
            return ("Roll Number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + department + "\nSpecialization : " + specialization + "\nCgpa : " + cgpa + "\nStatus : Pass");
        }
        return ("Roll Number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + department + "\nSpecialization : " + specialization + "\nCgpa : " + cgpa + "\nStatus : Fail");
    }
    public String getdepartment(){          // Getter methods
        return department;
    }
    public String getspecialization(){
        return specialization;
    }
    public int getcgpa(){
        return cgpa;
    }
}
 
class UGPG extends PG{       // Derived UG+PG class (3 level inheritance)
    private int conformation_year;
 
    public UGPG(String course, String roll_num, String name, String department, String specialization, int period_reg, int cgpa, int credits, String thesis, int conformation_year){
        super(course, roll_num, name, department, specialization, period_reg, cgpa, credits, thesis);
        this.conformation_year = conformation_year;
    }
    public String Display(){
        if((getperiod_reg() >= 5 || getperiod_reg() <= 8) && (getcredits() >= 265)){
            return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + getdepartment() + "\nSpecialization : " + getspecialization() + "\nCgpa : " + getcgpa() + "\nStatus : Pass");
        }
        return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nDepartment : " + getdepartment() + "\nSpecialization : " + getspecialization() + "\nCgpa : " + getcgpa() + "\nStatus : Fail");
    }
}
 
class PhD extends Student{   // Derived PhD class
    private String thesis;
    public PhD(String course, String roll_num, String name, int period_reg, int credits, String thesis){
        super(course, roll_num, name, period_reg, credits);
        this.thesis = thesis;
    }
    public String Display(){
        if((getperiod_reg() >= 2 || getperiod_reg() <= 6) && (getcredits() >= 64)){
            return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nStatus : Pass");
        }
        return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + "\nStatus : Fail");
    }
}
 
class PGPhD extends PhD{     // Derived PhD + PG Class (3 Level Inheritance)
    private int migration_year, cgpa;
    public PGPhD(String course, String roll_num, String name, int period_reg, int cgpa, int credits, String thesis, int migration_year){
        super(course, roll_num, name, period_reg, credits, thesis);
        this.migration_year = migration_year;
        this.cgpa = cgpa;
    }
    public String Display(){
        if((getperiod_reg() >= 4 || getperiod_reg() <=7) && (getcredits() >= 135)){
            return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + " " + cgpa + "\nStatus : Pass");
        }
        return ("Roll number : " + getroll_num() + "\nName : " + getname() + "\nCourse : " + getcourse() + " " + cgpa + "\nStatus : Fail");
    }
}