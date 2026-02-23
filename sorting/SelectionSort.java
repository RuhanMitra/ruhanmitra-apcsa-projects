package sorting;

public class SelectionSort implements Sorter {
    private int stepCount;

    public void algorithm(int[] data) {
        System.out.println("Selection Sort!!!");
    }

    public int getNumStep() {
        return stepCount;
    }

    public void sort(int[] data) {
        stepCount = 0;
        for (int a = 0; a < data.length - 1; a++) {
            int smallestPos = a;
            for (int b = a + 1; b < data.length; b++) {
                stepCount++;
                if (data[b] < data[smallestPos]) {
                    smallestPos = b;
                }
            }
            int swapValue = data[smallestPos];
            data[smallestPos] = data[a];
            data[a] = swapValue;
            stepCount++;
        }
        System.out.println("Total steps: " + stepCount);
    }
}