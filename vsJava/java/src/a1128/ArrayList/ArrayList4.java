package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("바나나?? " + list.contains("banana"));
        System.out.println("바나나?? " + list.contains("Grape"));

        String fruit = list.get(1);
        
        for(String i : list){
            System.out.println(i);
        }
    }
}
