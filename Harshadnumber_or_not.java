
import java.util.Scanner;
public class Harshadnumber_or_not{
    public static boolean HarshadNum(int num){
        int sum=0;
        int temp=num;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
            
        }
        if(temp%sum==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num value : ");
        int num = sc.nextInt();
        boolean HarshadNum = HarshadNum(num);
        System.out.println(HarshadNum);
    }

    
}

