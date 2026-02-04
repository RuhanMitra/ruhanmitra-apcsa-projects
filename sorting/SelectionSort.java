package sorting;

public class SelectionSort implements Sorter {
   public void algorithm(int[] input) {
       System.out.println("Selection Sort!!!");
   }


   public void sort(int[] input) {
       for (int i = 0; i < input.length - 1; i++) {
           int minIndex = i;
           for (int r = i + 1; r < input.length; r++) {
               if (input[r] < input[minIndex]) {
                   minIndex = r;
               }
           }
           int temp = input[minIndex];
           input[minIndex] = input[i];
           input[i] = temp;
       }
   }
}
