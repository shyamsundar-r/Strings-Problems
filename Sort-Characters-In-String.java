import java.util.*;
class Main {
    public static String sortCharacter(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Sorted Characters: " + sortCharacter(str));
        sc.close();
    }
}
