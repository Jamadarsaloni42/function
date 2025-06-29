import java.util.Scanner;
public class spy {
    public static boolean spy_func(int num){
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
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num value : ");
        int num = sc.nextInt();
        boolean isSpy = spy_func(num);
        System.out.print(isSpy);


    }
}
