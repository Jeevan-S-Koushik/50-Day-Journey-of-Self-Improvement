import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1, c;
        int num = scan.nextInt();
        System.out.print("The Fibonacci series: ");
        System.out.print(a + "," + b + ",");
        for(int i = 2; i < num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ",");
        }
        scan.close();
    }
}
