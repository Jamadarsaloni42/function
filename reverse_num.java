import java.util.Scanner;
public class reverse_num{
    public static int reverseNum(int num){
        int rev=0;
        for(int i=1;i<=num;i++){
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        int reverseNum = reverseNum(num);
        System.out.println(reverseNum);
    }
}