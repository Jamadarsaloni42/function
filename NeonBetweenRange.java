import java.util.Scanner;
public class NeonBetweenRange {
    public static boolean Neon_func(int num){
        int square=1;
        int sum=0;
        square = num*num;
        int temp=num;
        
        
        while(square>0){
            int rem = square%10;
            sum = sum+rem;
            square = square/10;
            
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
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        System.out.println("Total neon numbers between 1 to "+ num +" are ");
        for(int i=1;i<=num;i++){
            
            boolean NeonRange = Neon_func(i);
            if(NeonRange){ 
            System.out.println(i);
        }
            

        }
         
    }
    
}
