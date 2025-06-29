import java.util.Scanner;
public class Armstrong_number {
    public static int cube_fun(int num){
        return num*num*num;
    }
    public static boolean Armstrong_fun(int num){
        int temp=num;
        int sum=0;
           while(num>0){
            int rem = num%10;
           sum = sum+cube_fun(rem);
            num=num/10;
           }
           if(temp== sum){
            return true;
           }
           else{
             return false;
           }
           
    }

     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num value");
    int num=sc.nextInt();
    boolean Armstrong_num_func = Armstrong_fun(num);
    System.out.println(Armstrong_num_func);
     }


}
