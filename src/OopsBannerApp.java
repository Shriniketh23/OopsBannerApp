class OopsBannerApp{
    public static void main(String [] args){
       String[] lines = {
    String.join(" ", " *** ", " *** ", " **** ", " **** "),
    String.join(" ", "** **", "** **", "**  **", "**   "),
    String.join(" ", "** **", "** **", "**** ", " *** "),
    String.join(" ", "** **", "** **", "**   ", "   **"),
    String.join(" ", "** **", "** **", "**   ", "**  **"),
    String.join(" ", " *** ", " *** ", "**   ", " **** ")
};

// Then use a for-each loop to print each line
for (String line : lines) {
    System.out.println(line);
}
    }
}