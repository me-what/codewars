public class Main {
    public static void main(String[] args) {
        String string = "Eldar";
        System.out.println(string.replaceAll("^.|.$", ""));
    }
}