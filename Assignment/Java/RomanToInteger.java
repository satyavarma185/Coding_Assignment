import java.util.*;
public class RomanToInteger {
    static final Map<Character, Integer> romanToIntegerMap = new HashMap<>();
    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }
    public static int romanToInt(String str){
         int result = 0;
        
         for(int i=0; i< str.length(); i++){
            int currentValue = romanToIntegerMap.get(str.charAt(i));
            int nextValue = (i + 1 < str.length()) ? romanToIntegerMap.get(str.charAt(i+1)) : 0;

            if(currentValue < nextValue) {
                result -= currentValue;
            }
            else{
                result += currentValue;
            }
         }

         return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        int result = romanToInt(roman);
        System.out.println(result);
        sc.close();
    }
}
