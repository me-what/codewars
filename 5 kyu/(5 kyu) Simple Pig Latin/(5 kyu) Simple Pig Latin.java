// 1
import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split("(?<=\\s+)|(?=\\s+)")).map(word ->
                word.matches("[\\s\\p{Punct}]+") ? word
                        : word.substring(1) + word.charAt(0) + "ay"
        ).collect(Collectors.joining(""));
    }
}


// 2
public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}


// 3
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}


// 4
import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(PigLatin::pigify).collect(Collectors.joining(" "));
    }

    private static String pigify(String word){
        return word.length() > 1 || Character.isLetter(word.charAt(0)) ? word.substring(1) + word.charAt(0) + "ay" : word;

    }
}


// 5
import static java.lang.Character.*;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();

        for (String s : str.split(" ")) {
            char firstLetter = s.charAt(0);

            result.append(s, 1, s.length())
                    .append(firstLetter)
                    .append(isAlphabetic(firstLetter) ? "ay" : "")
                    .append(" ");
        }
        return result.substring(0, result.length()-1);
    }
}