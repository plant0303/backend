package a1113;

public class Increase {
    public static void main(String[] args) {
        int y = 10;
        int x = 10;
        int z;

        x++;
        x++;
        System.out.println(x);
        
        y--;
        --y;
        System.out.println("y= " + y);
        z = ++x + y++;
        System.out.println("-----------------------");
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
