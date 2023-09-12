public class LearnStrings {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Banana";

        /* IntelliJ keyboard commands */
        /*
            Ctrl + Shift + F10 = run
            Ctrl + Y = delete line
            Ctrl + / = comment out
            Ctrl + D = duplicate line
            Ctrl + B + click on method = take you to method
            Ctrl + N = brings up search, search for file/class
            Ctrl + O = override
            Ctrl + Alt + V = highlight a number/string to assign to a variable
            Shift + F6 = rename all instances of a variable
         */

        /* ~ String concatenation ~ */
        // ------------------------ //

//        Best for two strings, looks weird with more
        System.out.println(firstWord.concat(" ".concat(secondWord)));

//        Best for three or more strings, memory efficient
//        Can add final string length as a parameter
        String finalString = new StringBuilder()
                .append(firstWord)
                .append(" ")
                .append(secondWord)
                .toString();
        System.out.println(finalString);

//        Older method than finalString, used less, better thread security
//        (thread safe)
        String otherFinalString = new StringBuffer()
                .append(firstWord)
                .append(" ")
                .append(secondWord)
                .toString();
        System.out.println(otherFinalString);

//        Another method if you know the number of strings ahead of time
        System.out.format("%s %s\n", firstWord, secondWord);

        // --========================================-- //

        /* ~ String length ~ */
        // ----------------- //

        int stringLength = firstWord.length();
        System.out.println(stringLength);  // 5

        /* ~ Substrings ~ */
        // -------------- //

        String startAtIndex = firstWord.substring(1);
        System.out.println(startAtIndex);  // pple

        String includeCharactersBetween = firstWord.substring(0, 2);
        System.out.println(includeCharactersBetween);  // Ap

        String lowerCaseWord = "apple";
        String upperCaseLetter = lowerCaseWord.substring(0, 1).toUpperCase();
        String upperCaseWord = upperCaseLetter + lowerCaseWord.substring((1));
        System.out.println(upperCaseWord);  // Apple

        /* ~ indexOf ~ */
        // ----------- //

        String gettysburgAddress = "four score and seven years ago";
        System.out.println(gettysburgAddress.indexOf("seven"));  // 15
        System.out.println(gettysburgAddress.indexOf("SEVEN"));  // -1

        System.out.println(gettysburgAddress.indexOf(115));  // 5
        //  115 is the unicode for s

    }
}
