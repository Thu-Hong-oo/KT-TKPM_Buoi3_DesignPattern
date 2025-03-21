package iuh.pattern.observer.exTask;

public  class ProjectManager implements TeamMember {
    private String name;
    
    public ProjectManager(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Task task) {
        System.out.println("Project Manager " + name + " nhận thông báo: Công việc '" + 
                          task.getName() + "' hiện có trạng thái '" + task.getStatus() + "'");
    }
}
