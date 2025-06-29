import java.util.Scanner;
public class spyrange {
    public static boolean spy_range_func(int num){
        int mul=1;
        int sum=0;
    
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            mul = mul*rem;
            num = num/10;
           
        }
        if(sum==mul){
            return true;
        }
        else{
            return false;
        }
            
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
             boolean isSpy = spy_range_func(i);
             if(isSpy){
                System.out.println(i);
             }
             
        }
            
        }
        
    }

    


