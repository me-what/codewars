// 1
public class Kata
{
    public static String greet(String name)
    {
        return "Hello, " + name + " how are you doing today?";
    }
}

// 2
public class Kata
{
    public static String greet(String name)
    {
        return String.format("Hello, %s how are you doing today?", name);
    }
}

// 3
public class Kata {
    public static String greet(String name) {
        if (name == null || name.length() < 1) {
            return "Invalid input.";
        }
        return String.format("Hello, %s how are you doing today?", name);
    }
}

// 4
public class Kata
{
    public static String greet(String name)
    {
        return String.join(" ", new String[]{
                "Hello,", name,
                "how",
                "are",
                "you doing",
                "today?"
        });
    }
}

// 5
import java.util.*;
public class Kata
{
    private static final String REPLACE = "replace";

    public static String greet(String name)
    {
        StringBuilder sb = new StringBuilder();
        List<String> characters = Arrays.asList(
                "H", "e", "l", "l", "o", ",", " ", REPLACE,
                " ", "h", "o", "w", " ", "a", "r", "e", " ",
                "y", "o", "u", " ", "d", "o", "i", "n",
                "g", " ", "t", "o", "d", "a", "y", "?"
        );

        for(String character : characters) {
            if(Utils.equals(character, REPLACE)) {
                character = name;
            }
            sb.append(character);
        }
        return sb.toString();
    }

    /**
     * Utility class
     *
     */
    private static class Utils {
        private void Utils() {
            throw new AssertionError("Instantiating utility class");
        }

        public static boolean equals(String char1, String char2) {
            return char1 == char2;
        }
    }
}