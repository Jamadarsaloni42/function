import java.util.Scanner;
public class factorial {
    public static int fact_func(int fact){
        int i=1;
        int factorial =1;
        while(i>=fact){
         factorial = fact*i;
           i++;
        }
        return factorial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fact value");
        int fact = sc.nextInt();
        int factorial_func = fact_func(fact);
        System.out.println(factorial_func);
    }
}
