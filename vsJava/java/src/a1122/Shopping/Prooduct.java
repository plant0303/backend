package a1122.Shopping;

public class Prooduct {

    private String name;
    private double price;
    private int stock;

    public Prooduct(String name, double price, int stock) {
        this.name = name;
        setPrice(price);
        setStock(stock);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if(price < 0) {
            this.price = 0;
        } else{
            this.price = price;
        }
    }
    public void setStock(int stock) {
        if(stock < 0){
            this.stock = 0;
        }else{
            this.stock = stock;
        }
    }

    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public String toStr() {
        return String.format("제품: %s, 가격: %.2f, 재고: %d", name, price, stock);
    }

    public void addStock(int amount){
        if(amount < 0){
            System.out.println("재고 부족");
        } else{
            stock += amount;
            System.out.println(amount + "개의 재고가 추가됨 / 현재 주문 수량: " + stock);
        }
    }

    public void sellProduct(int sale) {
        if(sale > stock){
            System.out.println("재고가부족합니다아");
        } else if(sale < 0){
            System.out.println("0보다 작은값은 입력할수 없습니다아");
        } else{
            System.out.println( sale + "개 상품이 주문됏습니다아");
            stock -= sale;
            System.out.println("남은 수량: " + stock);
        }
    }
}