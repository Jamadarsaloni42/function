import java.util.Scanner;
public class area {
    public static double area_func(int length,int height){
          return(length*height);
     
    }
    public static void main(String args[]){
        double triangle_area = 0.5*area_func(20,40);
        System.out.println(triangle_area);

        double rectangle_area = area_func(20,50);
        System.out.println(rectangle_area);


    }
    
}
