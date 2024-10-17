import java.util.*;
public class CheckIfTwoStringsAreAnagramAreNot {

    public static boolean status(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        if(status(s1, s2)){
            System.out.println("The given strings are Anagram");
        }
        else{
            System.out.println("The given strings are not Anagram");
        }
    }
}
