// 1
public class BooleanToString {
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }
}

// 2
public class BooleanToString {
    public static String convert(boolean b){
        return Boolean.toString(b);
    }
}

// 3
public class BooleanToString {
    public static String convert(boolean b){
        return String.valueOf(b);
    }
}

// 4
public class BooleanToString {
    public static String convert(boolean b){
        if(b==true) {
            return "true";
        } else {
            return "false";
        }
    }
}