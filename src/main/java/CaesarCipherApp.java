
import java.util.Scanner;

//Declare CaesarCipherApp class
public class CaesarCipherApp {
    //String to hold alphabets
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encData(String inStr, int shiftKey)
    {
        //Defining Attributes


        //String to store encrypted data
        String encStr = "";

        //Convert entered string to uppercase
        inStr = inStr.toUpperCase();

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

    // Adding Decoding Method decData()
    public static String decData(String inStr, int shiftKey)
    {
        //Empty string to store decoded string
        String decStr = "";
        //Loop through all characters of the inStr
        for (int i=0; i<inStr.length();i++)
        {
            //Obtain position of each alphabet
            int pos = ALPHABET.indexOf(inStr.charAt(i));
            //Obtain decoded char of inStr
            int decPos = (pos - shiftKey)%26;
            //if decoded position is negative
            if(decPos < 0){
                decPos = ALPHABET.length() + decPos;
            }
             char decChar =ALPHABET.charAt(decPos);
            //Add decoded char to decoded string
            decStr += decChar;
        }
        //return decoding string
            return decStr;
    }

    public static void main(String[] args) {
        //create Scanner class instance
        Scanner scn = new Scanner(System.in);

        //Obtain input from the user
        System.out.println("Enter a string of alphabet to cipher");

        //Read the user input
        String inStr = scn.nextLine();

        //Enter integer value you wish to cipher
        System.out.println("Enter integer value");

        //Save user input cipher
        int shiftKey = Integer.valueOf(scn.nextLine());

        //Output encoded and decoded data
        System.out.println("Encoded ==> "+encData(inStr, shiftKey));
        System.out.println("Decoded ==> "+decData(encData(inStr, shiftKey), shiftKey));

        //Close the Scanner class object
        scn.close();
    }

}
