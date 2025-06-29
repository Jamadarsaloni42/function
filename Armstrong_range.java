import java.util.Scanner;
public class Armstrong_range {
    public static int  cube_func(int num){
          return num*num*num;
    }
    public static boolean ArmstrongNum_func(int num){
    
        int sum=0;
        int temp=num;
        while(num>0){
            int rem = num%10;
       
            sum = sum+cube_func(rem);
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
    
        for(int i=1;i<=num;i++){
        boolean ArmstrongNum = ArmstrongNum_func(i);
        if(ArmstrongNum){
        System.out.println(i);
        }

        }
        
    }
    
}
