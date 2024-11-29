package a1128.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 17, 22, 11, 90 };
        SelectionSort(array);
    }

    private static void SelectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j]< array[minIndex] ){ 
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    }
}
