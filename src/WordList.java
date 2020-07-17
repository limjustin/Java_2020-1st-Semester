/**
 * @author Jaeyoung Lim
 * @studentnumber 201910831
 * @since 20200626
 * FinalTerm201910831
 */

import java.util.ArrayList;

public class WordList {

    private String TotalString;
    private String[] separator;
    private ArrayList wordList = new ArrayList(); // Make the Arraylist by using the Local Variable

    // Constructor
    public WordList(String str, String[] separator) {
        this.TotalString = str;
        this.separator = separator;
    }

    public ArrayList DivideString() {

        // Using For-statement to iterate the Separator array
        for(int i = 0; i < separator.length; i++) {
            SplitStringtoList(separator[i], "String"); // Split the string with separator
        }

        SplitStringtoList("|", "List"); // Split the list with vertical bar

        return wordList; // return wordList
    }

    // Split the words according to given type of character and kind of type
    // String s : Splited by this character
    // String state : Is that "String" or "List"?
    //              String -> splited by separator
    //              List -> splited by "|"(Vertical bar)
    public void SplitStringtoList(String s, String state) {
        int index;
        String newStr = ""; // New string that push the result of split algorithm

        // Using the do-while Statement until there are no separator in the remain string
        do {
            index = TotalString.indexOf(s); // Find the index of separator in string

            if (index == -1) { // If there are no separator in remain string,
                if(state == "String") // Case of "String"
                    newStr += (TotalString); // Push(Add) the remain string in newStr

                if(state == "List") // Case of "List"
                    wordList.add(TotalString); // Add the remain string in wordList

                break; // Finally, break the do-while Statement
            }

            String front = TotalString.substring(0, index); // Split the string in front of the separator

            if(state == "String") // In the case of "String"
                newStr += (front + "|"); // Push(Add) the front string with adding "|(Vertical bar)" behind of the front string

            if(state == "List") { // In the case of "List"
                if(index != 0) // Exception handling : when front string is NULL
                               // for example, in case of "||", there are no word between the both vertical bars.
                    wordList.add(front); // Add the front string in wordList
            }

            String rear = TotalString.substring(index + 1); // Split the string behind the separator (rear is remain string)
            TotalString = rear; // Substitute TotalString with remain string

        } while (index != -1); // Separator searching is end when index is -1

        TotalString = ""; // Initialize
        TotalString = newStr; // Push newStr : result
    }

    // Print the string which is in wordList
    public void PrintList() {
        for(int i = 0; i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
    }
}
