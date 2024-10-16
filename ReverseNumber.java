import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter an input");
        int num = scan.nextInt();
        System.out.println("The reverse of " + num + " is : ");
        int rev= 0, rem= 0;
        while (num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        System.out.print(rev);
        scan.close();
    }
}
