public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        for(int i=65;i<65+n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}
