public class BubbleSortTest {

    public static void main (String[] args) {
        int[] arr = new int[]{100 ,-4, -1, 8, 99, 8438, 737};

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k: arr) {
            System.out.println(k);
        }

    }

}