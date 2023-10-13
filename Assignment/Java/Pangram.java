import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String str) {
        String lowercaseInput = str.toLowerCase();

        HashSet<Character> set = new HashSet<>();

        for(char c : lowercaseInput.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        for(char c = 'a'; c <= 'z'; c++){
            if(!set.contains(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        if(isPangram(str) == true) {
            System.out.println("The input is a pangram");
        }
        else{
            System.out.println("The input is not a pangram");
        }
        
    }
}
