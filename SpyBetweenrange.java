import java.util.Scanner;
public class SpyBetweenrange {
    public static boolean spy_range_func(int num){
        int mul=1;
        int add=0;
        
        while(num>0){
            int rem = num%10;
            add = add+rem;
            mul = mul*rem;
            num = num/10;
        }
        if(add==mul){
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
        
        System.out.println("Total spy numbers between 1 to "+ num +" are ");
        for(int i=1;i<=num;i++){
             boolean isSpy = spy_range_func(i);
             if(isSpy){ 
             System.out.println(i);
             }
        }
            
        }
        
    }

    

