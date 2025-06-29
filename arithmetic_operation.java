import java.util.Scanner;
public class arithmetic_operation{

    //void function
    // public static void add_func(int a,int b){
    //     System.out.println(a+b);
    //     return;
    // }
    //  public static void main(String args[]){
    //     add_func(10,20);
    
    // }


    //  int function
    public static int add_func(int a,int b){
        return(a+b);

    }
    public static void main(String args[]){
        int add = add_func(30,20);
        System.out.println(add);

    
    }
}