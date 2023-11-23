public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
       for(int i=n;i>=1;i--){
           for(int j=1;j<=2*i-2;j++){
               System.out.print(" ");
           }
           for(int k=0;k<=n-i;k++){
               System.out.print((char)(k+65)+" ");
           }
           for(int l=n-i;l>0;l--){
               System.out.print((char)((l-1)+65)+" ");
           }
           for(int j=1;j<=2*i-2;j++){
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}
