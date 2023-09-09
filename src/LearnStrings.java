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
            Ctrl + Alt + V = highlight a number to assign to a variable
         */

        /* ~ String concatenation ~ */
        // ------------------------ //

//        Best for two strings, looks weird with more
        System.out.println(firstWord.concat(" ".concat(secondWord)));

//        Best for three or more strings, memory efficient
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

        System.out.println(firstWord.length());

    }
}
