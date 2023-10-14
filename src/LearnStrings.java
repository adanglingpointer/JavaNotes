public class LearnStrings {
    public static void main(String[] args) {
        String firstWord = "Apple";
        String secondWord = "Banana";

        /* IntelliJ keyboard commands */
        /*
            Ctrl + Shift + F10 = run
            Shift + Enter = enter line below
            Ctrl + Alt + Enter = enter line above
            Ctrl + Y = delete line
            Ctrl + / = comment out
            Ctrl + D = duplicate line
            Alt + Shift + Down = move line down
            Ctrl + B + click on method = take you to method
            Ctrl + N = brings up search, search for file/class
            Ctrl + O = override
            Ctrl + Alt + V = assign to a variable
            Ctrl + Alt + N = inline a variable
            Shift + F6 = rename all instances of a variable
            Alt + Shift + click = create two cursors to type on two lines
            Ctrl + W = select larger bits of text within an element
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

        System.out.println(gettysburgAddress.lastIndexOf("s"));  // 25

        int fromIndex = 5;
        System.out.println(gettysburgAddress.indexOf("o", fromIndex)); // 7
        //  starting from character 5

        /* ~ Quiz ~ */
        // -------- //
        // How can we parse the area code, exchange, and line number
        //  for a phone number?

        String phoneNumber = "(234) 333-4552";
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

        /* ~ Remove Whitespace ~ */
        // --------------------- //

        String extraSpace = "  Pineapple ";
        System.out.println(extraSpace.strip());  // Pineapple

        /* ~ Split ~ */
        // --------- //

        String multiLine = """
            Here's some text,
            and here's some more text.
            Yet another line of text.
            """;
        String[] split = multiLine.split("\n");
        System.out.println(split.length);  // 3
        System.out.println(split[1]);  // and here's some more text.

        String[] numberWords = split[2].split(" ");
        System.out.println(numberWords[4]);  // text.

        // split's second parameter for limit acts in an unsuspected manner
        String[] splitLimit = multiLine.split("\n", 2);
        System.out.println(splitLimit[1]);
        // and here's some more text.
        // Yet another line of text.

        /* ~ startsWith() & endsWith() ~ */
        // ----------------------------- //

        String filename = "myfile.txt";
        System.out.println(filename.endsWith("txt"));  // true
        System.out.println(filename.startsWith("001"));  // false

        /* ~ contentEquals() ~ */
        // ------------------- //

        System.out.println(firstWord.contentEquals(secondWord));  // false

        System.out.println(firstWord.equals(secondWord));  // false

        // String and StringBuffer are character sequences
        StringBuffer firstText = new StringBuffer("Green");
        String secondText = "Green";

        System.out.println(secondText.contentEquals(firstText));  // true
        System.out.println(secondText.equals(firstText));  // false

    }

    public static String parseAreaCode(String phoneNumber) {
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
        String areaCode = phoneNumber.substring(openParens + 1, closeParens);
        return areaCode;
    }

    public static String parseExchange(String phoneNumber){
        int spaceIndex = phoneNumber.indexOf(" ");
        int hyphenIndex = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIndex + 1, hyphenIndex);
        return exchange;
    }

    public static String parseLineNumber(String phoneNumber){
        int hyphenIndex = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphenIndex + 1);
        return lineNumber;
    }

}
