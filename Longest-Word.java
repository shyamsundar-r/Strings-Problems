import java.util.*;
class Main {
    public static String longWord(String str) {
    String[] c = str.split(" ");
    String l="";
    for(String word : c){
        if(word.length()>l.length()){
            l = word;
        }
    }
    return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Reverse Words: " +longWord(str));
        sc.close();
    }
}
