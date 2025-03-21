package iuh.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> children;
    
    public Directory(String name) {
        super(name);
        this.children = new ArrayList<>();
    }
    
    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
        // Cập nhật đường dẫn cho component con
        component.setPath(this.path + "/" + component.getName());
    }
    
    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }
    
    @Override
    public FileSystemComponent getChild(int index) {
        return children.get(index);
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name + " (" + getSize() + " bytes)");
        
        // Hiển thị tất cả các thành phần con với indent sâu hơn
        for (FileSystemComponent component : children) {
            component.display(indent + "  ");
        }
    }
    
    @Override
    public int getSize() {
        int totalSize = 0;
        
        // Tính tổng kích thước của tất cả các thành phần con
        for (FileSystemComponent component : children) {
            totalSize += component.getSize();
        }
        
        return totalSize;
    }
    
    public List<FileSystemComponent> getChildren() {
        return children;
    }
}
    

