// 1
public class PangramChecker {
    public boolean check(String sentence){
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }
}


// 2
import java.util.Arrays;

public class PangramChecker {
    public boolean check(String string) {
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


// 3
public class PangramChecker {
    public boolean check(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}