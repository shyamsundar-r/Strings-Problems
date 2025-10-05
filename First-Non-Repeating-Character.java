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
