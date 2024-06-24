// 1
public class Multiplication{
    public static int [][] multiplicationTable(int number){
        int[][] arr = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int q = 0; q < number; q++) {
                arr[i][q] = (i + 1) * (q + 1);
            }
        }
        return arr;
    }
}

// 2
import java.util.stream.IntStream;
public class Multiplication{
    public static int [][] multiplicationTable(int n){
        return IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, n).map(j -> i * j).toArray()).toArray(int[][]::new);
    }
}