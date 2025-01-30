public class StringLength {
    public static void main(String[] args) {
        // Predefined input string
        String input = "Hello, World!";
        
        // Find the length of the string
        int length =StringLength(String);
        
        // Print the original string and its length
        System.out.println("Original string: " + input);
        System.out.println("Length of the string: " + length);
    }
    public static int findStringLength(String str) {
        // Use the length() method of the String class
        return str.length();
    }
}

