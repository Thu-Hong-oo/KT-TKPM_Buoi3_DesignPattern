package iuh.adapter.exampleStudent;

public class CoollegeStudent implements Student {

    private String name;
    private String serName;
    private String email;
    

    public CoollegeStudent(String name, String serName, String email) {
        this.name = name;
        this.serName = serName;
        this.email = email;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public String serName() {
        // TODO Auto-generated method stub
        return this.serName;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return this.email;
    }

}
