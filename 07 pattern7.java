public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
