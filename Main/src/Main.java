import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {
        return Arrays.stream(str.split("(?<=\\s)|(?=\\s+)")).map(word ->
                word.matches("[\\s\\p{Punct}]+") ? word
                        : word.substring(1) + word.charAt(0) + "ay"
        ).collect(Collectors.joining(""));
    }
    }