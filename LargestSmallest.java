
public class LargestSmallest {
    public static void main(String[] args) {
        int[] array = {10, 50, 20, 70, 130, 100, 160};

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}

