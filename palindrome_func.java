import java.util.Scanner;
public class palindrome_func {
    public static int reverse_num_func(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10; 
             
        }
        return rev;
        
    }
    public static boolean palindrome(int num){
        return num==reverse_num_func(num);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        boolean ispalindrome = palindrome(num);
        System.out.println(ispalindrome);
        

    }

    
}

