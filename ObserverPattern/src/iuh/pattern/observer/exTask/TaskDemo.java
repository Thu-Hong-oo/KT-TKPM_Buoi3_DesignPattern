package iuh.pattern.observer.exTask;

public class TaskDemo {
    public static void main(String[] args) {
        // Tạo Subject (công việc)
        Task implementFeature = new Task("Triển khai tính năng đăng nhập", "Mới");
        Task fixBug = new Task("Sửa lỗi hiển thị", "Đang phát triển");
        
        // Tạo Observers (thành viên nhóm)
        TeamMember dev1 = new Developer("John");
        TeamMember dev2 = new Developer("Dahlia");
        TeamMember pm = new ProjectManager("May");
        
        // Đăng ký theo dõi công việc
        implementFeature.attach(dev1);
        implementFeature.attach(pm);
        
        fixBug.attach(dev2);
        fixBug.attach(pm);
        
        // Thay đổi trạng thái công việc và gửi thông báo
        implementFeature.setStatus("Đang phát triển");
        
        // Thay đổi trạng thái công việc khác
        fixBug.setStatus("Hoàn thành");
        
        // Thêm dev2 vào công việc triển khai tính năng
        implementFeature.attach(dev2);
        
        // Thay đổi trạng thái lần nữa
        implementFeature.setStatus("Đang chờ review");
    }
}