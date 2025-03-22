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

***

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

***
## Ex: Adapter Design Pattern (Wrapper Pattern)

Một dịch vụ web yêu cầu đầu vào ở định dạng JSON, nhưng một hệ thống khác chỉ hỗ trợ XML. Bạn có thể viết một adapter để chuyển đổi dữ liệu từ XML sang JSON và ngược lại.					
* Hãy áp dụng Adapter Design Pattern vào trường hợp trên					
Yêu cầu: vẽ sơ đồ trước khi viết code.

### Định nghĩa
Adapter Pattern is a structural design pattern that convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
*Adapter Pattern (Người chuyển đổi) là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). Adapter Pattern cho phép các inteface (giao diện) không liên quan tới nhau có thể làm việc cùng nhau. Đối tượng giúp kết nối các interface gọi là Adapter.
    ![image](https://github.com/user-attachments/assets/ac2b0969-e6b6-4816-8bd5-a220156dc437)

***
Một Adapter Pattern bao gồm các thành phần cơ bản sau:
* Adaptee: định nghĩa interface không tương thích, cần được tích hợp vào.
* Adapter: lớp tích hợp, giúp interface không tương thích tích hợp được với interface đang làm việc. Thực hiện việc chuyển đổi interface cho Adaptee và kết nối Adaptee với Client.
* Target: một interface chứa các chức năng được sử dụng bởi Client (domain specific).
* Client: lớp sử dụng các đối tượng có interface Target.
### Có hai cách để thực hiện Adapter Pattern dựa theo cách cài đặt (implement) của chúng:
* Object Adapter – Composition (Chứa trong)(phổ biến nên dùng hơn): trong mô hình này, một lớp mới (Adapter) sẽ tham chiếu đến một (hoặc nhiều) đối tượng của lớp có sẵn với interface không tương thích (Adaptee), đồng thời cài đặt interface mà người dùng mong muốn (Target). Trong lớp mới này, khi cài đặt các phương thức của interface người dùng mong muốn, sẽ gọi phương thức cần thiết thông qua đối tượng thuộc lớp có interface không tương thích.
  ![image](https://github.com/user-attachments/assets/71e2943e-fc96-4ecd-b1b3-1c9a6544b664)
* Class Adapter – Inheritance (Kế thừa) : trong mô hình này, một lớp mới (Adapter) sẽ kế thừa lớp có sẵn với interface không tương thích (Adaptee), đồng thời cài đặt interface mà người dùng mong muốn (Target). Trong lớp mới, khi cài đặt các phương thức của interface người dùng mong muốn, phương thức này sẽ gọi các phương thức cần thiết mà nó thừa kế được từ lớp có interface không tương thích.
![image](https://github.com/user-attachments/assets/7375beb5-943c-418c-906f-c8b177c424f5)



![image](https://github.com/user-attachments/assets/39891357-042f-438f-b52c-7d612126ddad)
![image](https://github.com/user-attachments/assets/2b956357-cc6a-40bc-aeaf-c794bec01298)



* Bài tập thêm:
* Bạn đang làm việc với hệ thống quản lý nhân viên trong một công ty. Công ty có hai loại nhân viên:
* FullTimeEmployee (Nhân viên toàn thời gian) - đã triển khai interface Employee.
* Freelancer (Nhân viên tự do) - không triển khai Employee, nhưng bạn muốn quản lý họ như một Employee.
* Yêu cầu:
* Tạo interface Employee với các phương thức getName(), getSalary().
* Tạo class FullTimeEmployee triển khai Employee.
* Tạo class Freelancer có name và hourlyRate, nhưng không triển khai Employee.
* 
* Tạo class FreelancerAdapter giúp Freelancer hoạt động như Employee (giả sử Freelancer có lương = hourlyRate * 160 giờ).
Viết chương trình quản lý danh sách List<Employee>, trong đó chứa cả nhân viên toàn thời gian và freelancer.

***
### Bài tập: Thiết kế hệ thống quản lý thư viện sử dụng các Design Pattern									
* Đề bài: Bạn đang xây dựng một hệ thống quản lý thư viện. Hệ thống này sẽ cho phép người dùng thực hiện các chức năng cơ bản như: mượn sách, trả sách, thêm sách mới vào thư viện, xem danh sách sách có sẵn, tìm kiếm sách theo tên, tác giả và thể loại. Hệ thống sẽ được phát triển với nhiều thành phần và có thể mở rộng trong tương lai.										
* Hãy sử dụng các Design Patterns phù hợp để xây dựng hệ thống này. Các yêu cầu chi tiết như sau:										
* 1. Singleton Pattern:					
Xây dựng một đối tượng Library để quản lý tất cả các sách trong thư viện. Đảm bảo rằng chỉ có một đối tượng duy nhất của Library trong hệ thống (chỉ có một thư viện duy nhất).										
* 2. Factory Method Pattern:					
Khi thêm sách mới vào thư viện, bạn có thể chọn loại sách (sách giấy, sách điện tử, sách nói, v.v.). Hãy sử dụng Factory Method để tạo ra các loại sách khác nhau.									
* 3. Strategy Pattern:					
Xây dựng các chiến lược tìm kiếm sách khác nhau (tìm kiếm theo tên, theo tác giả, theo thể loại). Dựa vào lựa chọn của người dùng, chiến lược tìm kiếm sẽ được thay đổi.										
* 4. Observer Pattern:					
Khi có sách mới hoặc sách đã hết hạn mượn, hệ thống sẽ gửi thông báo cho những người quan tâm (ví dụ: các nhân viên thư viện hoặc những người dùng đã đăng ký theo dõi). Hãy sử dụng Observer Pattern để xử lý việc này.										
* 5. Decorator Pattern:					
Cho phép người dùng mượn sách với các tính năng bổ sung như gia hạn thời gian mượn, hay yêu cầu sách với phiên bản đặc biệt (sách có chữ nổi, sách có bản dịch, v.v.). Sử dụng Decorator Pattern để mở rộng các tính năng của việc mượn sách mà không thay đổi các lớp sách cơ bản.
			
