import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
    }

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