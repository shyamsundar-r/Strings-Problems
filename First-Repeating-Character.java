import java.util.*;
class Main {
    public static Character repeat(String str){
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(set.contains(ch)){
                return ch;  // First repeating character found
            }
            set.add(ch);
        }
        return null;  // No repeating character
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Character result = repeat(str);
        if(result != null){
            System.out.println("First Repeating Character: " + result);
        } else {
            System.out.println("No Repeating character found.");
        }
        sc.close();
    }
}
