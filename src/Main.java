import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) {
        List<String> list = inputList();
        list.stream()
                .map(Codechef::isComplexString)
                .map(a -> a?"NO":"YES")
                .forEach(System.out::println);


    }

    private static List<String> inputList() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        for(int i =0;i<totalInput;i++){
            int n =scan.nextInt();
            String s = scan.next();
            s = s.substring(0,n);
            list.add(s);
        }
        return list;
    }

    private static boolean isComplexString(String string){
        char [] charArray = string.toCharArray();
        int count =0 ;
        for (char c : charArray) {
            if (isVowel(c)) {
                count = 0;
            } else {
                count++;
            }
            if (count >= 4) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
