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