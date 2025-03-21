package iuh.composite.exercise;

public class File extends FileSystemComponent {
    private int size;
    private String content;
    
    public File(String name, int size) {
        super(name);
        this.size = size;
        this.content = "";
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + " bytes)");
    }
    
    @Override
    public int getSize() {
        return size;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
        // Cập nhật kích thước dựa trên nội dung
        this.size = content.getBytes().length;
    }
}
