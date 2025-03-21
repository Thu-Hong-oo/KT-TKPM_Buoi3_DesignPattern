package iuh.composite.exercise;

public abstract class FileSystemComponent {
    protected String name;
    protected String path;
    
    public FileSystemComponent(String name) {
        this.name = name;
        this.path = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    // Phương thức chung
    public abstract void display(String indent);
    public abstract int getSize();
    
    // Các phương thức mặc định để xử lý các thành phần con
    // Được cài đặt trong Directory, còn File sẽ không sử dụng
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }
    
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }
    
    public FileSystemComponent getChild(int index) {
        throw new UnsupportedOperationException("Cannot get child from a file");
    }
}
