import javax.swing.JOptionPane;

/**
 * This is an excercise.
 * To write a method which accepts a string and int.
 * Method should return the character at the index
 * defined by the int. 
 */

public class ShowChar {
    public static void main(String[] args) {
        
        // Initialize Variables
        String word;
        int index;
        
        // Get String and integer
        word = JOptionPane.showInputDialog("Enter the string:");
        index = Integer.parseInt(JOptionPane.showInputDialog("Enter the index you wish to view:"));
        

        JOptionPane.showMessageDialog(null, "The character at index " +
                                                            index + " of " + 
                                                            word + " is " + showChar(word, index));

    }

    /**
     * Method takes a string and an integer
     * and returns the character at the index of the integer passed in
     * @param word
     * @param index
     * @return char which is the character at index of word
     */

    public static char showChar(String word, int index) {
        
        // Initialize and return value
        char answer = word.charAt(index);
        
        return answer;
    }
}
