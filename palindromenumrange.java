import java.util.Scanner;

public class palindromenumrange {
    public static boolean rev_func(int num){
        int no = num;
        int rev=0;
         while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
          } 
          if(no==rev){
             return true;
         }
         else{
               return false;
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
             boolean palindrome_func = rev_func(i);
             if(palindrome_func){
                   System.out.println(i);
             }
       
        }
        

    }
    
    
}
