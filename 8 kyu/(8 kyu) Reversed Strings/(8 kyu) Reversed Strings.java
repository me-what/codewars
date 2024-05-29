// 1
public class Kata {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        return reversedStr;
    }
}

// 2
public class Kata {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

// 3
public class Kata {
    public static String solution(String str) {
        String newcad="";

        for(int i = str.length()-1; i >= 0; i--){
            newcad += str.charAt(i);
        }
        return newcad;
    }
}