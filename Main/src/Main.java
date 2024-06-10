import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));

    }

    public static boolean check(String string) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < string.length(); i++)
        {
            if ('A' <= string.charAt(i) && string.charAt(i) <= 'Z')
                index = string.charAt(i) - 'A';
            else if ('a' <= string.charAt(i) && string.charAt(i) <= 'z')
                index = string.charAt(i) - 'a';
            else
                continue;
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);
        return (true);
    }


    }


