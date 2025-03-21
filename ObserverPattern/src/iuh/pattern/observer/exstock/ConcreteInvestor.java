package iuh.pattern.observer.exstock;

//concreate Observer
public class ConcreteInvestor implements Investor {
    private String name;
    
    public ConcreteInvestor(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Stock stock) {
        System.out.println(name + " nhận thông báo: Cổ phiếu " + 
                          stock.getSymbol() + " hiện có giá " + stock.getPrice());
    }
}
