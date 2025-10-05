import java.util.*;
class Main {
    public static void countVowel(String str){
        str = str.toLowerCase();
        int v = 0, con = 0;
        
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if("aeiou".indexOf(ch) != -1){
                    v++;
                } else {
                    con++;
                }
            }
        }
        System.out.println("Vowels: " + v + " Consonants: " + con);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        countVowel(str);
        sc.close();
    }
}
