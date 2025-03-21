## Ex: Composite Design Pattern
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
![image](https://github.com/user-attachments/assets/cc990e8f-4144-4fe2-b61d-a64e0a6b9199)

### Sử dụng Composite Pattern khi nào?
* Composite Pattern chỉ nên được áp dụng khi nhóm đối tượng phải hoạt động như một đối tượng duy nhất (theo cùng một cách).
* Composite Pattern có thể được sử dụng để tạo ra một cấu trúc giống như cấu trúc cây.


## Ex: Observer Design Pattern
* Khi giá của một cổ phiếu thay đổi, các nhà đầu tư đã đăng ký để theo dõi cổ phiếu đó sẽ nhận thông báo ngay lập tức về sự thay đổi.
* Trong một dự án phần mềm, khi có sự thay đổi về tình trạng hoặc trạng thái công việc (task), các thành viên trong nhóm sẽ nhận được thông báo tự động để theo dõi tiến độ.										
* Hãy áp dụng Observer Design Pattern vào các trường hợp trên					
Yêu cầu: vẽ sơ đồ trước khi viết code.					
### Định nghĩa
Observer Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern). Nó định nghĩa mối phụ thuộc một – nhiều giữa các đối tượng để khi mà một đối tượng có sự thay đổi trạng thái, tất các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động.
* Observer có thể đăng ký với hệ thống. Khi hệ thống có sự thay đổi, hệ thống sẽ thông báo cho Observer biết. Khi không cần nữa, mẫu Observer sẽ được gỡ khỏi hệ thống.
#
Các thành phần tham gia Observer Pattern:
![image](https://github.com/user-attachments/assets/931b6d30-9bab-472c-a1aa-14a421fcaea6)

* Subject : chứa danh sách các observer,  cung cấp phương thức để có thể thêm và loại bỏ observer.
* Observer : định nghĩa một phương thức update() cho các đối tượng sẽ được subject thông báo đến khi có sự thay đổi trạng thái.
* ConcreteSubject : cài đặt các phương thức của Subject, lưu trữ trạng thái danh sách các ConcreateObserver, gửi thông báo đến các observer của nó khi có sự thay đổi trạng thái.
* ConcreteObserver : cài đặt các phương thức của Observer, lưu trữ trạng thái của subject, thực thi việc cập nhật để giữ cho trạng thái đồng nhất với subject gửi thông báo đến.

![image](https://github.com/user-attachments/assets/9ce67c7a-077a-4468-947b-d4e03f235db8)
![image](https://github.com/user-attachments/assets/055d5c4d-a6b8-4990-a611-75c303f6f649)


![image](https://github.com/user-attachments/assets/07a330a1-8389-4796-bd21-39f8a1e52b22)
![image](https://github.com/user-attachments/assets/0a4d6310-9a6b-4c1b-ad0d-73d571d7b0ec)


    
