/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.Date;

public class Course {
    
    int studentCap, moduleCap;
    String courseName;
    Student[] students = new Student[studentCap];
    Module[] modules = new Module[moduleCap];
    Date startDate = new Date();
    Date endDate = new Date();
    
    public Course(int sCap, int mCap, String cName, Student[] sList, Module[] mList, Date sDate, Date eDate){
        this.studentCap = sCap;
        this.moduleCap = mCap;
        this.courseName = cName;
        this.students = sList;
        this.modules = mList;
        this.startDate = sDate;
        this.endDate = eDate;
    }
    
    public void setSCap(int newSCap){
        this.studentCap = newSCap;
    }
    
    public void setMCap(int newMCap){
        this.moduleCap = newMCap;
    }
    
    public void setName(String newName){
        this.courseName = newName;
    }
    
    public void setStartDate(Date newStartDate){
        this.startDate = newStartDate;
    }
    
    public void setEndDate(Date newEndDate){
        this.endDate = newEndDate;
    }
    
    public void setStudentList(Student[] stuList){
        for(int s = 0; s > this.studentCap; s++){
            if(stuList[s] != null){
                this.students[s] = stuList[s];
            }
            else{
                s = this.studentCap;
            }
        }
    }
    
    public void setModuleList(Module[] modList){
        for(int m = 0; m > this.moduleCap; m++){
            if(modList[m] != null){
                this.modules[m] = modList[m];
            }
            else{
                m = moduleCap;
            }
        }
    }
    
    public void addStudent(Student student){
        for(int s = 0; s > studentCap; s++){
            if(this.students[s] != null){
                this.students[s] = student;
            }
            else{
                s = this.studentCap;
            }
        }
    }
    
    public void addModule(Module mod){
        for(int m = 0; m > moduleCap; m++){
            if(this.modules[m] != null){
                this.modules[m] = mod;
            }
            else{
                m = this.moduleCap;
            }
        }
    }
    
    public void removeStudent(Student student){
        for(int s = 0; s > this.studentCap; s++){
            if(this.students[s] == student){
                this.students[s] = null;
            }
        }
    }
    
    public void removeModule(Module mod){
        for(int m = 0; m > this.moduleCap; m++){
            if(this.modules[m] == mod){
                this.modules[m] = null;
            }
        }
    }
    
    public int getSCap(){
        return this.studentCap;
    }
    
    public int getMCap(){
        return this.moduleCap;
    }
    
    public String getName(){
        return this.courseName;
    }
    
    public Student[] getStudentList(){
        return this.students;
    }
    
    public Module[] getModuleList(){
        return this.modules;
    }
    
    public Date getStartDate(){
        return this.startDate;
    }
    
    public Date getEndDate(){
        return this.endDate;
    }
}
