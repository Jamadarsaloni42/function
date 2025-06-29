import java.util.Scanner;
public class leap_range {
    public static boolean leap_year_func(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year value : ");
        int year = sc.nextInt();
        for(int i=2000;i<=year;i++){
        boolean leapyear = leap_year_func(i);
        if(leapyear){
        System.out.println(i);
        }
        }
    }
    
}
