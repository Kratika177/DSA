public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((n-j-1)+65)+" ");
            }
            System.out.println();
        }
    }
}
