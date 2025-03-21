package iuh.pattern.observer.exstock;

public class StockDemo {
    public static void main(String[] args) {
        // Tạo Subject (cổ phiếu)
        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2700.0);

        // Tạo Observers (nhà đầu tư)
        Investor investor1 = new ConcreteInvestor("John");
        Investor investor2 = new ConcreteInvestor("Ngọc Bích");
        Investor investor3 = new ConcreteInvestor("Thanh Di");

        // Đăng ký theo dõi cổ phiếu
        appleStock.attach(investor1);
        appleStock.attach(investor2);

        googleStock.attach(investor2);
        googleStock.attach(investor3);

        // Thay đổi giá cổ phiếu và gửi thông báo
        appleStock.setPrice(155.5);

        // Hủy đăng ký
        appleStock.detach(investor1);

        // Thay đổi giá lần nữa
        appleStock.setPrice(160.0);

        // Thay đổi giá cổ phiếu Google
        googleStock.setPrice(2750.0);
    }
}