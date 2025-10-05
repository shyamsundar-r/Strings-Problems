import java.util.*;
class Main {
    public static boolean isAnagram(String s1, String s2){
      if(s1.length() != s2.length()){
          return false;
      }
      char[] a1 = s1.toCharArray();
      char[] a2 = s2.toCharArray();
      Arrays.sort(a1);
      Arrays.sort(a2);
      return Arrays.equals(a1,a2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String: ");
        String s2 = sc.nextLine();
        System.out.println("Is Anagram:" +isAnagram(s1,s2));
    }
}
