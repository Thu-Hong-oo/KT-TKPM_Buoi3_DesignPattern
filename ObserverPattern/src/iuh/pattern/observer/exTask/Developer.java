package iuh.pattern.observer.exTask;

public class Developer implements TeamMember{
    private String name;
    
    
    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println("Developer " + name + " nhận thông báo: Công việc '" + 
        task.getName() + "' hiện có trạng thái '" + task.getStatus() + "'");
    }
    
}
