package sorting;


public class InsertionSort implements Sorter {
    private int step = 0;
    public void algorithm(int[] input) {
        System.out.println("Insertion Sort!!!");
    }
    
    public void sort(int[] input) {
        step = 0;
        for (int i = 1; i < input.length; i++) {
            int temp = input[i];
            
            int r = i - 1;
            while (r >= 0 && input[r] > temp) {
                input[r+1] = input[r];
                r--;
                step++;
            }
            input[r+1] = temp;
            step++;
        }
        System.out.println("Total steps: " + step);
    }
}
