package problem;

import java.util.Scanner;

public class q1075 {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int n = input.nextInt();
      int f = input.nextInt();
      
      int start = (n / 100) * 100;
      int end = start + 100;
      int ans = 0;
      for(int i = start; i < end; i++) {
         if(i % f == 0) {
            ans = i % 100;
            if(ans / 10 == 0) {
               System.out.println("0" + ans);
            }
            else {
               System.out.println(ans);
            }
            break;
         }
      }
   }
}
