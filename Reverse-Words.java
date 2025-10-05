import java.util.*;
class Main {
    public static String revWords(String str) {
    String[] c = str.split(" ");
    StringBuilder res = new StringBuilder();
    for(String w:c){
        res.append(new StringBuilder(w).reverse().append(" "));
    }
    return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Reverse Words: " +revWords(str));
        sc.close();
    }
}
