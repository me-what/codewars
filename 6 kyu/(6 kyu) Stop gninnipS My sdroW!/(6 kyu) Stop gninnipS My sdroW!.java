import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
  @Test
  public void test() {
    assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
  }
}

// 1
public class SpinWords {
  public String spinWords(String sentence) {
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


// 2
import java.util.Arrays;

public class SpinWords {
  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}