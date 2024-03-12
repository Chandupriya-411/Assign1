public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String str = "Hello Java";
        int index = 8; 
        char newChar = 'o'; 
        
        String modifiedStr = replaceCharAtIndex(str, index, newChar);
        
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);
    }
    
    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            
            return str;
        }
        
        
        char[] charArray = str.toCharArray();
        charArray[index] = newChar;
        
       
        return new String(charArray);
    }
}
