package iuh.pattern.observer.exstock;

import java.util.ArrayList;
import java.util.List;

public class Stock {
 private String symbol;
 private double price;
 private List<Investor> investors = new ArrayList<>();
 public Stock(String symbol, double price) {
    this.symbol = symbol;
    this.price = price;
}

public String getSymbol() {
    return symbol;
}

public double getPrice() {
    return price;
}

public void setPrice(double newPrice) {
    if (this.price != newPrice) {
        System.out.println("Giá cổ phiếu " + symbol + " thay đổi từ " + price + " thành " + newPrice);
        this.price = newPrice;
        notifyInvestors();
    }
}

public void attach(Investor investor) {
    investors.add(investor);
}

public void detach(Investor investor) {
    investors.remove(investor);
}

private void notifyInvestors() {
    for (Investor investor : investors) {
        investor.update(this);
    }
}

}
