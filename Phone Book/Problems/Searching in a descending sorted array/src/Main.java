import java.util.*;

public class Main {
    public static int binarySearch(Integer[] array, int elem, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2; // the index of the middle element

            if (elem == array[mid]) {
                return mid - 1; // the element is found, return its index
            } else if (elem < array[mid]) {
                right = mid - 1; // go to the left array
            } else {
                left = mid + 1;  // go the the right array
            }
        }
        return -1; // the element is not found
    }

    public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int key = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);
        int left = 0;
        int right = arr.length - 1;

        System.out.println(binarySearch(arr, key, left, right));

    }
}
