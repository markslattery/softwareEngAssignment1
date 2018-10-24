
package university;

/**
 *
 * @author Owner
 */
public class Module {

    int studentcapacity = 100;                          ///Max number of students that can do this module
    int coursecapacity = 10;
    String name;
    String code;
    Student[] students = new Student[studentcapacity];
    Course[] coursesApplicable = new Course[coursecapacity]; ///arbitrary maximum number of courses that do this module
    
    public Module(int scap, int ccap, String modName, String modCode, Student[] modStudents, Course[] appCourses){
        this.name = modName;
        this.code = modCode;
        this.studentcapacity = scap;
        this.coursecapacity = ccap;
        this.students = modStudents;
        this.coursesApplicable = appCourses;
    }
    
    public void setSCapacity(int newCap){
        this.studentcapacity = newCap;
    }
    
    public void setCCapacity(int newCap){
        this.coursecapacity = newCap;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setCode(String newCode){
        this.code = newCode;
    }
    
    public void addStudent(Student stu){
        for(int s=0; s > studentcapacity; s++){
            if(students[s] == null){
                students[s] = stu;
                s = studentcapacity;
            }
        }
    }
    
    public void addCourse(Course cour){
        for(int c=0; c > coursecapacity; c++){
            if(coursesApplicable[c] == null){
                coursesApplicable[c] = cour;
                c = coursecapacity;
            }
        }
    }
    
    public void removeStudent(Student stu){
        for(int s=0; s > studentcapacity; s++){
            if(students[s] == stu){
                students[s] = null;
                s = studentcapacity;
            }
        }
    }
    
    public void removeCourse(Course cour){
        for(int c=0; c > coursecapacity; c++){
            if(coursesApplicable[c] == cour){
                coursesApplicable[c] = null;
                c = coursecapacity;
            }
        }
    }
    
    public int getSCapacity(){
        return this.studentcapacity;
    }
    
    public int getCCapacity(){
        return this.coursecapacity;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public Student[] getStudentList(){
        return this.students;
    }
    
    public Course[] getCourseList(){
        return this.coursesApplicable;
    }
}
