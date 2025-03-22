package iuh.adapter.exampleStudent;

public class SchoolStudentAdapter implements Student {

    private SchoolStudent schoolStudent;

    
    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String serName() {
        // TODO Auto-generated method stub
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return this.schoolStudent.getEmailAddress();
    }
    
}
