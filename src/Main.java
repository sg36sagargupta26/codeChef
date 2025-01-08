import java.lang.*;
import java.util.*;

class Codechef
{
    public static void main (String[] args) {
        List<int[][]> list = inputList();
        list.stream()
                .map(Codechef::maxTrace)
                .forEach(System.out::println);
    }

    private static List<int[][]> inputList() {
        List<int[][]> res = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        for(int i =0;i<totalInput;i++){
            int arrSize = scan.nextInt();
            int [][] temp = new int[arrSize][arrSize];
            for(int j = 0;j<arrSize;j++){
                for(int k =0;k<arrSize;k++){
                    temp[j][k]=scan.nextInt();
                }
            }
            res.add(temp);
        }
        return res;
    }

    private static int maxTrace(int [][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i< matrix.length;i++){
            max = Math.max(traceWithStart(i,0,matrix),Math.max(traceWithStart(0,i,matrix),max));
        }
        return max;
    }

    private static int traceWithStart(int x, int y, int[][] matrix) {
        int i = x;
        int j = y;
        int sum =0 ;
        while(i<matrix.length && j<matrix.length){
            sum+=matrix[i][j];
            i++;
            j++;
        }
        return sum;
    }
}
