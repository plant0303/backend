package a1122.Shopping;

public class ProductEx {
    public static void main(String[] args) {
        Prooduct laptop = new Prooduct("노트북", 120000, 10);
        Prooduct desktop = new Prooduct("데탑", -1000000, -54);
        // System.out.println("제품명 " + laptop.getName());
        // System.out.println("가격 " + laptop.getPrice());
        // System.out.println("재고 " + laptop.getStock());

        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());

        laptop.setPrice(-5200);
        laptop.addStock(5);
        laptop.sellProduct(5);

        System.out.println("수정된 가격" + laptop.getPrice());
    }
}
