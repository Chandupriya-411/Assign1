public class VowelsConsonantsCount {
    public static void main(String[] args) {
        String inputString = "Hello World";
        inputString = inputString.toLowerCase(); 

        int vowelsCount = 0;
        int consonantsCount = 0;

        
        String vowels = "aeiou";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            
            if (Character.isLetter(currentChar)) {
                if (vowels.indexOf(currentChar) != -1) {
                   
                    vowelsCount++;
                } else {
                    
                    consonantsCount++;
                }
            }
        }

        System.out.println("Input String: " + inputString);
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
