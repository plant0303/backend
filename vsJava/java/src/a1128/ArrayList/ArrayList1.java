package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Integer li : list){
            System.out.println(li);
        }

        list.set(3, 50);

        System.out.println("ArrayList: " + list);
        
    }
}
