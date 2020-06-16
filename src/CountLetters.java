import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    private String letter; // 받을 문자열
    private Map<String, Integer> letterMap; // Map 변수 선언

    // Constructor
    public CountLetters(String s) {
        letter = s;
    }

    public Map<String, Integer> countDigitsAndLetters() {

        letterMap = new HashMap<String, Integer>();
        char[] letterArr = letter.toCharArray(); // 배열로 분할

        // Iterator
        for(char c : letterArr) {

            // One Case : isDigit
            if(Character.isDigit(c)) {
                if(letterMap.containsKey("Digit")) // if it has already
                    letterMap.put("Digit", letterMap.get("Digit") + 1);
                else
                    letterMap.put("Digit", 1);
            }

            // Another Case : isLetter
            else {
                if(letterMap.containsKey("Letter")) // if it has already
                    letterMap.put("Letter", letterMap.get("Letter") + 1);
                else
                    letterMap.put("Letter", 1);
            }

        }

        return letterMap;
    }

    @Override
    public String toString() {
        return "{LETTERS=" + letterMap.get("Letter") + ", DIGITS=" + letterMap.get("Digit") + "}";
    }
}
