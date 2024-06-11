public class Main {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean check(String sentence){

        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
    }