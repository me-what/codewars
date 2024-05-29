// 1
public class Kata {
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}

// 2
public class Kata {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

// 3
public class Kata {
    public static String evenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}