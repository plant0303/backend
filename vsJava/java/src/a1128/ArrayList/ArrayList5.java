package a1128.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
    
        Collections.sort(list);
        System.out.println("정렬 후 출력" + list);

        Collections.reverse(list);
        System.out.println("열순정렬" + list);
    }
}
