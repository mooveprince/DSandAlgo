

public class SimpleArray {

    public static void main (String[] args) {
        int[] a = new int [10];
        System.out.println("length of the array is " + a.length);
        for (int i=0; i < a.length; i++)
            a[i] = (int)(Math.random()*10);
        
        showList(a);
    }

    public static void showList (int[] a) {
        for (int i=0; i<a.length; i++) {
         System.out.println (a[i]);   
        }
    }

}