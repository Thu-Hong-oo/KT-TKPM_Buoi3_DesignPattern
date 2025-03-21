package iuh.composite.exercise;

// Lớp Client để sử dụng hệ thống quản lý tập tin
public class FileSystemClient {
    public static void main(String[] args) {
        // Tạo hệ thống tập tin
        Directory root = new Directory("root");
        
        // Tạo các thư mục con
        Directory documents = new Directory("documents");
        Directory pictures = new Directory("pictures");
        
        // Tạo các tập tin
        File file1 = new File("document1.txt", 100);
        file1.setContent("Đây là nội dung của document1.txt");
        
        File file2 = new File("document2.txt", 200);
        file2.setContent("Đây là nội dung của document2.txt");
        
        File image1 = new File("image1.jpg", 500);
        File image2 = new File("image2.jpg", 700);
        
        // Thêm tập tin vào thư mục documents
        documents.add(file1);
        documents.add(file2);
        
        // Thêm tập tin vào thư mục pictures
        pictures.add(image1);
        pictures.add(image2);
        
        // Thêm thư mục con vào thư mục gốc
        root.add(documents);
        root.add(pictures);
        
        // Tạo một thư mục con trong pictures
        Directory thumbnails = new Directory("thumbnails");
        File thumbnail1 = new File("thumb1.jpg", 50);
        thumbnails.add(thumbnail1);
        pictures.add(thumbnails);
        
        // Hiển thị cấu trúc thư mục
        root.display("");
        
        // Hiển thị đường dẫn của một tập tin
        System.out.println("\nĐường dẫn của thumbnail1.jpg: " + thumbnail1.getPath());
        
        // Hiển thị tổng kích thước của thư mục gốc
        System.out.println("Tổng kích thước của thư mục gốc: " + root.getSize() + " bytes");
    }}