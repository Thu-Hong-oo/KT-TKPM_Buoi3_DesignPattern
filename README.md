### Ex: Composite Design Pattern
"Bạn được giao nhiệm vụ xây dựng một hệ thống quản lý thư mục và tập tin theo mô hình cây (tree structure). Trong hệ thống này:
Một thư mục có thể chứa nhiều tập tin hoặc các thư mục con.
Một tập tin chỉ có thể chứa dữ liệu, không thể chứa thư mục hoặc tập tin khác.
Cả thư mục và tập tin đều có thể được hiển thị với thông tin của chúng."								
Trong một giao diện người dùng, các thành phần như nút bấm, các hộp thoại, thanh điều hướng có thể là các phần tử riêng biệt hoặc nhóm lại thành các phần tử phức tạp hơn. Composite Design Pattern có thể giúp bạn tổ chức các phần tử UI này vào các nhóm hợp lý mà không cần phải thay đổi cách thức hoạt động của chúng.								
* Hãy áp dụng Composite Design Pattern để giải bài toán trên.					
Yêu cầu: vẽ sơ đồ trước khi viết code.					
#
Một Composite Pattern bao gồm các thành phần cơ bản sau:
* Base Component : là một interface hoặc abstract class quy định các method chung cần phải có cho tất cả các thành phần tham gia vào mẫu này.
* Leaf : là lớp hiện thực (implements) các phương thức của Component. Nó là các object không có con.
* Composite : lưu trữ tập hợp các Leaf và cài đặt các phương thức của Base Component. Composite cài đặt các phương thức được định nghĩa trong interface Component bằng cách ủy nhiệm cho các thành phần con xử lý.
* Client: sử dụng Base Component để làm việc với các đối tượng trong Composite.

### Áp dụng
* Thư mục có thể chứa thư mục con và tập tin (Composite)
* Tập tin chỉ chứa dữ liệu, không chứa thành phần khác (Leaf)
* Cả thư mục và tập tin đều có thể hiển thị thông tin (phương thức chung trong Component)
![image](https://github.com/user-attachments/assets/eeb70864-d245-43b6-9f5b-4df3cbd6f6ef)
