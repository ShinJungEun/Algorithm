package problem;

import java.util.Scanner;

public class q1003 {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int loop = input.nextInt();
      int n;
      int arr[][] = new int[41][2];
      arr[0][0] = 1; arr[0][1] = 0;
      arr[1][0] = 0; arr[1][1] = 1;
      fibo(arr, 40);
      for(int i = 0; i < loop; i++) {
         n = input.nextInt();
         if(n >= 2) {
            System.out.println(arr[n][0] + " " + arr[n][1]);
         }
         else if(n == 1){
            System.out.println(arr[1][0] + " " + arr[1][1]);
         }
      
         else if(n == 0) {
            System.out.println(arr[0][0] + " " + arr[0][1]);

         }

      }

   }
   
   public static void fibo(int arr[][], int n) {
      for(int j = 2; j <= n; j++) {
         arr[j][0] = arr[j - 1][1];
         arr[j][1] = arr[j - 1][0] + arr[j - 1][1];
      }
   }

}
