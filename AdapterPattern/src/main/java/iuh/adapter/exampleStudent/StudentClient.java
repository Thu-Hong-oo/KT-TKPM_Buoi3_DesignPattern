package iuh.adapter.exampleStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();

        CoollegeStudent coollegeStudent = new CoollegeStudent("a","b","c");
    
        SchoolStudent schoolStudent = new SchoolStudent("e", "f", "g");

        students.add(coollegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));
        return students;
    }
    
    

    
}
