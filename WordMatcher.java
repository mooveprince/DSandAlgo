
public class WordMatcher {

    public static void main (String[] args) {
        String word = "POOL";
        String[] toBeMatchedIn = new String [] {"BOOK", "LOPO", "CATA", "POLO", "LOOP"};

        for (String s : toBeMatchedIn) {
            if (s.length() == word.length()) {
                char[] actualWord = word.toCharArray();
                char[] checkFor = s.toCharArray ();

                int[][] twoDMatchArray = new int [actualWord.length][checkFor.length];
                for (int i =0; i< actualWord.length; i++) {
                    for (int j=0; j<checkFor.length; j++) {
                        int k = i;
                        boolean prevChecked = false;
                        while ( k != 0) {
                            prevChecked = (twoDMatchArray[k][j] == 1?true:false);
                            if (prevChecked) break;
                            k--;
                        }
                        if (!prevChecked) {
                            if (actualWord[i] == checkFor[j]) {
                                twoDMatchArray[i][j] = 1;
                                break;
                            }
                        }
                    }
                }
           /*     System.out.println("For the String " + s);
                loopTwoDIntArray(twoDMatchArray);
                System.out.println("=========================");    */
                if (manipulateAnagaramFrom2D(twoDMatchArray)) {
                    System.out.println ("This Matches " + s);
                }
            }
        }

    }


    public static void loopTwoDIntArray (int[][] c) {
        for (int i=0; i<c.length; i++) {
            for (int j=0; j<c[i].length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static boolean manipulateAnagaramFrom2D ( int[][] c ) {
        int count = 0;
        for (int i=0; i<c.length; i++) {
            for (int j=0; j<c[i].length; j++) {
                if (c[i][j] == 1) {
                    count ++;
                    break;
                }
            }
        }    
        return count == c.length?true:false;    
    }

}