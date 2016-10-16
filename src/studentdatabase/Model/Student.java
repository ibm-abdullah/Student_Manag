/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase.Model;

/**
 *
 * @author derry
 */
public class Student {
    String studentID;
    String surname;
    String firstName;
    int admissionYear;
    float GPA;
    Major program;
    
    public Student(){
    this.studentID = null;
    this.surname = null;
    this.firstName = null;
    }
    public String getSurname(){
        return this.surname;
    }
    
    public void setSurname(String sureName){
        this.surname = sureName;
    }
    
    public String getStudentID(){
        return this.studentID;
    }
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public String getFirstname(){
        return this.firstName;
    }
    
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public int getadmissionYear(){
        return this.admissionYear;
    }
    
    /**
     *
     * @param admissionYear
     */
    public void setadmissionYear(int admissionYear){
        this.admissionYear = admissionYear;
    }
    public float getGPA(){
        return this.GPA;
    }
    
    public void setgpa(float gpa){
        this.GPA = gpa;
    }
    public Major getProgram(){
        return this.program;
    }
    
    public void setProgram(Major program){
        this.program = program;
    }
    public String toStrings() {
     String data = studentID + " " + firstName + " " + surname + " " + admissionYear + " " + GPA + " " + program + "\n";
            return data ;
        }
 
    
    
}
enum Major{BA,CS,MIS,EE,CE,ME}
