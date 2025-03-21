# Ex: Composite Design Pattern
"Bạn được giao nhiệm vụ xây dựng một hệ thống quản lý thư mục và tập tin theo mô hình cây (tree structure). Trong hệ thống này:
Một thư mục có thể chứa nhiều tập tin hoặc các thư mục con.
Một tập tin chỉ có thể chứa dữ liệu, không thể chứa thư mục hoặc tập tin khác.
Cả thư mục và tập tin đều có thể được hiển thị với thông tin của chúng."								
Trong một giao diện người dùng, các thành phần như nút bấm, các hộp thoại, thanh điều hướng có thể là các phần tử riêng biệt hoặc nhóm lại thành các phần tử phức tạp hơn. Composite Design Pattern có thể giúp bạn tổ chức các phần tử UI này vào các nhóm hợp lý mà không cần phải thay đổi cách thức hoạt động của chúng.								
Hãy áp dụng Composite Design Pattern để giải bài toán trên.					
Yêu cầu: vẽ sơ đồ trước khi viết code.					
#
Composite Design Pattern là một mẫu thiết kế cấu trúc cho phép xây dựng các đối tượng thành cấu trúc cây và làm việc với chúng như với các đối tượng riêng lẻ. 
\n Component: Interface hoặc lớp cơ sở định nghĩa các phương thức chung cho tất cả các thành phần
\n Leaf: Đối tượng cơ bản, không có con (trong trường hợp này là tập tin)
\n Composite: Đối tượng phức hợp, có thể chứa các đối tượng con (trong trường hợp này là thư mục)

# Áp dụng
Thư mục có thể chứa thư mục con và tập tin (Composite)
Tập tin chỉ chứa dữ liệu, không chứa thành phần khác (Leaf)
Cả thư mục và tập tin đều có thể hiển thị thông tin (phương thức chung trong Component)
