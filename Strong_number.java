import java.util.Scanner;
public class Strong_number {
    public static int factorial_func(int num){
        
       int fact=1;
       int i=1;
      
       while(num>=i){
        fact = fact*i;
        i++;
       }
       return fact;
    }
    public static boolean strong_func(int num){
         int sum=0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            sum = sum+factorial_func(rem);
            num = num/10;

        }
        if(temp==sum){
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
        boolean strong = strong_func(num);
        System.out.println(strong);
    }
    
}
