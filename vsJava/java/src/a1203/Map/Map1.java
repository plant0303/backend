package a1203.Map;

import java.util.HashMap;
import java.util.Iterator;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("삼십", 30);
        hm.put("십", 30);
        hm.put("사십", 30);
        hm.put("이십", 20);
        
        System.out.println("맵에 저장된 키들의 집합: " + hm.keySet());
        for(String key  : hm.keySet()){
            System.out.println(String.format("키 %s, 값: %s", key, hm.get(key)));
        }

        System.out.println();
        // 요소 제거
        hm.remove("사십");
        for (String key : hm.keySet()) {
            System.out.println(String.format("키: %s, 값: %s", key, hm.get(key)));
        }
        System.out.println();
        System.out.println("맵의 크기" + hm.size());
    }
}
