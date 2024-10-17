import java.util.*;
public class FrequencyChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        int[] frequency = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            frequency[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)i + ": " + frequency[i]);
            }
        }
    }
}
