



public class CaesarCipherApp {
    //String to hold alphabets
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptData(String inStr, int shiftKey)
    {
        //Defining Attributes


        //String to store encrypted data
        String encStr = "";

        //Convert entered string to lowercase
        inStr = inStr.toLowerCase();

        //Loop through all alphabets
        for (int i = 0;i<inStr.length();i++)
        {   //Obtain each character position
            int pos = ALPHABET.indexOf(inStr.charAt(i));
            //Obtain encoded char of each input
            int encPos = (shiftKey + pos) % 26;
            char encChar = ALPHABET.charAt(encPos);
            //ADD encoded character to encoded string
            encStr += encChar;
        }
        return encStr;
    }

    


}
