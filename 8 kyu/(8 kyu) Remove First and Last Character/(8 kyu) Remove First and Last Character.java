// 1
public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }
}

// 2
public class RemoveChars {
    public static String remove(String str) {
        return str.replaceAll("^.|.$", "");
    }
}