
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give a string");
        String s = "aeiouäö";
        System.out.println(allVowels(s));

    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public static boolean allVowels(String string) {
       string = string.toLowerCase();
        if (string.matches("^[aeyiuoäö]+$")) {
            return true;
        }
        return false;
    }
    
     public static boolean clockTime(String string){
         if(string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
             return true;
         }
         return false;
     }

}
