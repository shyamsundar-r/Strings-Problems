import java.util.*;
class Main {
    public static Character nonRepeat(String str){
       Map<Character, Integer> m = new LinkedHashMap<>();
       for(char ch:str.toCharArray()){
           m.put(ch,m.getOrDefault(ch,0)+1);
       }
       for(char c:m.keySet()){
           if(m.get(c)==1){
               return c;
           }
       }
       return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Character result = nonRepeat(str);
        if(result != null){
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}


// Index of the First Non-Repeating Character in a String
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;        
    }
}
