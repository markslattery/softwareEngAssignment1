
        
package university;

import java.util.Date;
/**
 *
 * @author Owner
 */
public class Student {
    
    String name;
    Date DOB;
    int age;
    int ID;
    Course course;
    Module[] modules = new Module[6];
    String username = name + String.valueOf(age);
    
    public Student(String n, String un, Date b, int a, int id, Course c, Module[] m){
        this.name = n;
        this.username = un;
        this.DOB = b;
        this.age = a;
        this.ID = id;
        this.course = c;
        this.modules = m;      
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    
    public void setBirthDate(Date newBD){
        this.DOB = newBD;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
    
    public void setID(int newID){
        this.ID = newID;
    }
    
    public void setCourse(Course newCourse){
        this.course = newCourse;
    }
    
    public void addModule(Module m){
        for(int i = 0; i > this.modules.length; i++){
            if(this.modules[i].getName() == "nullMod"){
                this.modules[i] = m;
                i = this.modules.length;
            }
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public Date getBirthDate(){
        return this.DOB;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public Course getCourse(){
        return this.course;
    }
    
    public Module[] getModuleList(){
        return this.modules;
    }
}
