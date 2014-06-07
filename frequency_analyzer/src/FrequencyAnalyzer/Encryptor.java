/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;

import java.util.HashMap;

/**
 *
 * @author saulecabrera
 */
public class Encryptor {
    private final HashMap<String, String> substitutionCipher;
    private final String[] alphabet = {"a", "b","c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u", "v","w", "x", "y","z"};
    private final String[] alphabetWithLeftShift = {"x", "y", "z", "a", "b", "c", "d", "e","f", "g", "h", "i", "j", "k", "l","m","n","o", "p", "q", "r", "s", "t", "u", "v", "w"};
    public Encryptor(){
        this.substitutionCipher = new HashMap<String, String>();
        for(int i = 0; i< 26; i++){
            this.substitutionCipher.put(alphabet[i], alphabetWithLeftShift[i]);
        }
    }
    
    public String encrypt(String message){
        message = message.toLowerCase();
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++){
            encryptedMessage += this.substitutionCipher.get(Character.toString(message.charAt(i)));
        }
        return encryptedMessage;
    }
}
