import java.util.*;
class Main {
    public static int longWord(String str) {
    String[] c = str.trim().split(" ");
   return c.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Reverse Words: " +longWord(str));
        sc.close();
    }
}
