import java.lang.*;
import java.util.*;

class Codechef
{
    public static void main (String[] args) {
        inputList().stream().map(Codechef::maxDivisors).forEach(System.out::println);
    }

    private static List<Integer> inputList() {
        List<Integer> res = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        for(int i =0;i<totalInput;i++){
            int n = scan.nextInt();
            res.add(n);
        }
        return res;
    }

    private static int maxDivisors( int n){
        int div= 0;
        int maxCount = 0;
        int tempCount =0;
        while (n % 2 == 0) {
            n /= 2;
            tempCount++;
        }
        if(maxCount<tempCount){
            maxCount=tempCount;
            div =2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            tempCount =0;
            while (n % i == 0) {
                n /= i;
                tempCount++;
            }
            if(maxCount<tempCount){
                maxCount=tempCount;
                div =i;
            }
        }
        if (n > 2){
            tempCount =1;
            if(maxCount<tempCount){
                maxCount=tempCount;
                div =n;
            }
        }
        return div;
    }

}
