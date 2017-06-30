public class BinarySearchTest {

    public static void main (String[] args) {
        int[] a = new int[]{1,5,8,20,25};
        boolean isFound = false;

        int low = 0;
        int mid = 0;
        int high = a.length-1;
        int toSearch = 19;
        int numOfTry = 0;

        while (!isFound) {
            if (low > high) { System.out.println("NUmber not found"); break; }

            mid = low + ((high-low)/2);
            numOfTry ++;
            if (a[mid] == toSearch) {
                isFound = true;
                System.out.println("Number found at " + numOfTry);
                break;
            }
            if (a[mid] < toSearch) low = mid+1;
            if (a[mid] > toSearch) high = mid-1;

        }

    }
}