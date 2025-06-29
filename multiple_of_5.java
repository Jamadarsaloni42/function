import java.util.Scanner;
public class multiple_of_5 {
    public static boolean multiple_5_func(int num){
        if(num%5==0){
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
        boolean multiple_5 = multiple_5_func(num);
        System.out.println(multiple_5);
    }
    
}
