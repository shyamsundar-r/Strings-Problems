import java.util.*;
class Main {
    public static int countString(String str){
       int c=0;
       for(char ch:str.toCharArray()){
           c++;
       }
       return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Length: " + countString(str));
        
    }
}
