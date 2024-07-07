// 2 Optimized solution
import java.lang.StringBuilder;
public class Reverse {
        System.out.println(reverseWords("Hi! I'm Eldar")); // !iH m'I radlE
}

public static String reverseWords(final String original)
{
    String[] word = original.split(" ");
    if (word.length == 0)
        return original;

    int i = 0;
    for(String string : word){
        word[i] = new StringBuilder(string).reverse().toString();
        i++;
    }
    return String.join(" ", word);
}
}


// 1 Plain solution
import java.*;

public class Kata {
    public static String reverseWords(final String original) {
        String[] array = original.split(" ");
        if (array.length == 0) {
            return original;
        }

        List<String> res = new ArrayList<String>();
        for (String w : array) {
            StringBuilder r = new StringBuilder();
            r.append(w);
            r = r.reverse();
            res.add(r.toString());
        }
        return String.join(" ", res);
    }
}


// 3 Clever solution
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
}