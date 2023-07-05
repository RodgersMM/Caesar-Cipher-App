



public class CaesarCipherApp {
    //String to hold alphabets
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inStr, int shiftKey)
    {


        //String to store encrypted data
        String encString = "";

        //Convert entered string to lowercase
        inStr = inStr.toLowerCase();

        //Loop through all alphabets
        for (int i = 0;i<inStr.length();i++)
        {
            int encPos = (shiftKey + pos) % 26;
            char encChar = ALPHABET.charAt(encPos);
            encString += encChar;
        }
        return encString;
    }
}
