import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class exerciciLletresRepetides {
    public static void main(String[] args) {
        // Step I: Create a table and make a loop to resort the table
        //         and display each letters in the console
        Character[] letters = new Character[]{'F', 'a', 't','i','m','a','1'};
        int i, j, x;
        for (i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        // Step 2: Change the table for a list, if the letter is a vowel print
        //         "Vocal" otherwise print "Consonante" and if you find a number
        //         display "The name of the people does not contain numbers!

        List<Character> listName = new ArrayList<Character>(Arrays.asList(letters));//function to convert an Array to a List

        for (i = 0; i < listName.size(); i++) {
            if ((listName.get(i) == 'A') || (listName.get(i) == 'a') ||
                    (listName.get(i) == 'E') || (listName.get(i) == 'e') ||
                    (listName.get(i) == 'I') || (listName.get(i) == 'i') ||
                    (listName.get(i) == 'O') || (listName.get(i) == 'o') ||
                    (listName.get(i) == 'U') || (listName.get(i) == 'u')) {
                System.out.println(listName.get(i) + " es Vocal");
            } else if (Character.isDigit(listName.get(i)) == true) { //Character.isDigit(letters[i]) to check if the char is a digit or a letter
                System.out.println(listName.get(i) + " Els noms de persones no contenen números!");
            } else {
                System.out.println(listName.get(i) + " es Consontant");
            }
        }

        // Step 3: Store in a Map List both (letters and number of time that they appear)
        List<Integer> numberOfTime = new ArrayList<Integer>();
        HashMap<Character, Integer> numberOfLetters = new HashMap<>();
        for (i = 0; i < listName.size(); i++) {
            x=0;
            for (j = 0; j < listName.size(); j++) {
                if (listName.get(i) == listName.get(j)) {
                    x=x+1;
                }
            }
            numberOfLetters.put(listName.get(i), x);
        }
        System.out.println(numberOfLetters);

        // Step 4: create a list for surname and merge the name list with the surname list
        //         with a gap in between

        Character[] lastName = new Character[]{'E', 'l', 'i', 'a', 's'};
        List<Character> listLastName = new ArrayList<Character>(Arrays.asList(lastName));
        //I changed this part of the code because the print was not what I wanted
        /*Character[] space = new Character[]{' '};
        List merged = new ArrayList(listName);
        merged.addAll(Arrays.asList(space));
        merged.addAll(Arrays.asList(listLastName));
        System.out.println(merged);
        */
        List fullName = new ArrayList(listName);
        fullName.add(' ');
        for (i = 0; i < listLastName.size() ; i++){
            fullName.add(listLastName.get(i));
            }
        System.out.println(fullName);
    }
}