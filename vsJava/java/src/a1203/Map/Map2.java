package a1203.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>();

        tm.put(30, "삼십");
        tm.put(10, "십");
        tm.put(40, "사십");
        tm.put(20, "이십"); 
        
        System.out.println("맵에 저장된 키들의 집합: " + tm.keySet());
        for(Integer key  : tm.keySet()){
            System.out.println(String.format("키 %s, 값: %s", key, tm.get(key)));
        }

        System.out.println();
        // 요소 제거
        tm.remove("사십");
        for (Integer key : tm.keySet()) {
            System.out.println(String.format("키: %s, 값: %s", key, tm.get(key)));
        }
        System.out.println();
        System.out.println("맵의 크기" + tm.size());

        TreeMap<String, Integer> tm1 = new TreeMap<>();
        tm1.put("ㄷㄷㄷ", 30);
        tm1.put("ㅅㅅㅅ", 10);
        tm1.put("ㄱㄱㄱ", 40);
        tm1.put("ㅗㅗㅗ", 20); 

        System.out.println("맵에 저장된 키들의 집합: " + tm1.keySet());
        for(String key  : tm1.keySet()){
            System.out.println(String.format("키 %s, 값: %s", key, tm1.get(key)));
        }
    }
}
