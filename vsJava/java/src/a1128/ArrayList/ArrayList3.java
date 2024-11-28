package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Integer li : list){
            System.out.println(li);
        }
        
        list.remove(1);

        System.out.println(list);
        
        list.remove(Integer.valueOf(30));

        System.out.println(list);
    }
}
