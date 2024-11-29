package a1129.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);

        System.out.println("리스트 출력: " + li);

        for(int i : li){
            System.out.print(i + " ");
        }

        Iterator<Integer> iter = li.iterator();
        while(iter.hasNext()){
            // 다음 요소가 있을때까지 반복
            System.out.println(iter.next() + " ");
        }

        li.add(1, 50);
        for(int e : li){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("리스트의 크기: " + li.size());

        li.remove(3);
        for(int i : li){
            System.out.print(i + " ");
        }
    }
}
