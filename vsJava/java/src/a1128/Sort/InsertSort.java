package a1128.Sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 17, 22, 11, 90 };
        InsertionSort(arr);
        System.out.println("sort Array: " + Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 현재 정렬할 요소
            int j = i - 1;

            // 현재 요소(key)가 정렬된 부분의 요소보다 작으면
            // 그 요소들을 한 칸씩 뒤로 밀어냅니다.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // key를 올바른 위치에 삽입합니다.
            arr[j + 1] = key;
        }
    }
}
