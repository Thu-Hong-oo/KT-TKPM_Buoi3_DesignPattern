package iuh.pattern.observer.exTask;

import java.util.ArrayList;
import java.util.List;

public class Task {
 private String name;
    private String status;
    private List<TeamMember> members = new ArrayList<>();
    
    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String newStatus) {
        if (!this.status.equals(newStatus)) {
            System.out.println("\nCông việc '" + name + "' thay đổi trạng thái từ '" + 
                              status + "' thành '" + newStatus + "'");
            this.status = newStatus;
            notifyTeamMembers();
        }
    }
    
    public void attach(TeamMember member) {
        members.add(member);
    }
    
    public void detach(TeamMember member) {
        members.remove(member);
    }
    
    private void notifyTeamMembers() {
        for (TeamMember member : members) {
            member.update(this);
        }
    }
}
