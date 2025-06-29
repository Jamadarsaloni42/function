import java.util.Scanner;

public class HarshadBetweenRange {
    public static boolean HarshadNum_func(int num){
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
        for(int i=1;i<=num;i++){
        boolean HarshadNum = HarshadNum_func(i);
        if(HarshadNum){
        System.out.println(i);
        }
        }
    }

    
    
}
