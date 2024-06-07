

public class Main {
    public static void main(String[] args) {
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
    }


    public static String spinWords(String sentence) {
        String[] word = sentence.split(" ");
        if (word.length == 0)
            return sentence;

        int i=0;
        for (String string : word) {
            if (word[i].length() >= 5) {
                word[i] = new StringBuilder(string).reverse().toString();
                i++;
            } else {
                word[i] = new StringBuilder(string).toString();
                i++;
            }
        }
        return String.join(" ", word);
    }
}