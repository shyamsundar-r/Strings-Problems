import java.util.*;
class Main {
    public static String revString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reverse of the String: " + revString(str));
        sc.close();
    }
}
