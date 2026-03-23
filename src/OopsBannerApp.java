class OopsBannerApp{
    public static void main(String [] args){
      public class OOPSBannerApp {

    static class CharacterPatternMap {
        char ch;
        String[] pattern;

        CharacterPatternMap(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };

        String[] P = {
            "**** ",
            "** **",
            "**** ",
            "**   ",
            "**   ",
            "**   "
        };

        String[] S = {
            " ****",
            "**   ",
            " *** ",
            "   **",
            "** **",
            " ****"
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.ch == ch) {
                return map.pattern;
            }
        }
        return new String[0];
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 6; i++) {
            for (char c : message.toCharArray()) {
                String[] pattern = getCharacterPattern(c, charMaps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Main method - Entry point for the banner display application
     * Initializes the character pattern maps and displays "OOPS" as an ASCII art banner.
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
} 

    }
}