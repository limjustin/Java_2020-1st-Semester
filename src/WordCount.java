/**
 * @author Jaeyoung Lim
 * @studentnumber 201910831
 * @since 20200626
 * FinalTerm201910831
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCount extends WordList { // extends WordList Class

    private String[] stopword;
    private Map<String, Integer> wordMap; // Make the new Map with word(Key) and count(Value)

    // Constructor
    public WordCount(String str, String[] separator, String[] stopword) {
        super(str, separator); // Call the parent class constructor
        this.stopword = stopword;
    }

    public void CountingWords() {

        wordMap = new HashMap<String, Integer>(); // Make the new HashMap

        ArrayList<String> arrayList = DivideString(); // Call the parent class function and return the result(wordList) of function

        for(int i = 0; i < arrayList.size(); i++) { // wordList for-statement

            int state = 0; // When state is 0, word is not in the stopwords
                           // When state is 1, word is in the stopwords

            if((int) arrayList.get(i).charAt(0) >= 65 && (int) arrayList.get(i).charAt(0) <= 90) // In case of capital letter
                arrayList.set(i, toChangeLowerCase(arrayList.get(i))); // change all the capital letter to small letter by toLowerCase function that I made

            for(int j = 0; j < stopword.length; j++) { // stopword for-statement
                // In case of capital letter
                if((int) stopword[j].charAt(0) >= 65 && (int) stopword[j].charAt(0) <= 90)
                    stopword[j] = toChangeLowerCase(stopword[j]); // substitute the array which is all small letter

                if(arrayList.get(i).equals(stopword[j])) // In case of word is in the stopwords
                    state = 1; // set state in 1
            }

            if(isallDigit(arrayList.get(i))) // if arrayList have all number
                state = 1; // set state in 1 -> cannot push into wordMap

            if(state == 0) { // word is not in the stopwords
                if(wordMap.containsKey(arrayList.get(i))) // already have
                    wordMap.put(arrayList.get(i), wordMap.get(arrayList.get(i)) + 1);
                else // or not
                    wordMap.put(arrayList.get(i), 1);
            }
        }
    }

    // Print the result
    public void ShowWords(int num) {
        for(Map.Entry<String, Integer> entry : wordMap.entrySet()) { // Using Entry
            if(entry.getValue() >= num) // Print only value which is bigger than number or same as number
                System.out.printf("%s:%d\n", entry.getKey(), entry.getValue());
        }
    }

    // Change capital letter to small letter
    public String toChangeLowerCase(String s) {
        char[] arr = s.toCharArray();
        String temp = "";

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 65 && arr[i] <= 90) { // In case of capital letter,
                arr[i] = (char) (arr[i] + 32); // change to small letter
                temp += arr[i]; // and push it
            } else { // otherwise
                temp += arr[i]; // push directly
            }
        }
        return temp; // return the modified String
    }

    // Want to know there are number in arrayList
    public boolean isallDigit(String s) {
        char tmp;
        for(int i = 0; i < s.length(); i++) {
            tmp = s.charAt(i);
            if((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z')) { // at least one character type,
                return false; // return false immediately
            }
        }
        return true; // otherwise, return true, this means that there are only numbers in arrayList
    }
}
