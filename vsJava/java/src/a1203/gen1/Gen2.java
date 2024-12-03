package a1203.gen1;

import java.util.ArrayList;

public class Gen2 {
    public static void main(String[] args) {
        ArrayList<String> piches = new ArrayList<>();
        piches.add("123");
        piches.add("129");

        String one = piches.get(0);
        String two = piches.get(0);


        
        // String one = piches.get(0);
        // String two = piches.get(0);
        // 제네릭 안쓰면 자료 넣을때는 문제 없지만 값을 가져올 때 Object -> String으로 형변환 해야함
        
    }
}
