package a1112;

public class Promotion1 {
    public static void main(String[] args) {
        
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue" + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue" + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue" + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue" + doubleValue);
    }
}
