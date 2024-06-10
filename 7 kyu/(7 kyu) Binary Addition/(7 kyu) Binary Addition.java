// 1
public class Kata{
    public static String binaryAddition(int a, int b){
        int c = a + b;
        String binary = Integer.toBinaryString(c);
        return binary;
    }
}


// 2
public class Kata{
    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }
}


// 3
class Kata {
    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        int bit;
        String result = "";
        while (sum != 0) {
            bit = sum % 2;
            result = bit + result;
            sum = sum / 2;
        }
        return result;
    }
}