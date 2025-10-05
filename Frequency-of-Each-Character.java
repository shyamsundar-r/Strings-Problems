import java.util.*;
class Main {
    public static void countString(String str){
       Map<Character, Integer> m = new HashMap<>();
       for(char ch:str.toCharArray()){
           m.put(ch,m.getOrDefault(ch,0)+1);
       }
       System.out.println(m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        countString(str);
    }
}
