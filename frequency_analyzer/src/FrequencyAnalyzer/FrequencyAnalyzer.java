/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> test = new Analyzer("Hola").frequencyMapAsString();
        for (Map.Entry<String, String> entry: test.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        Encryptor enx = new Encryptor();
        System.out.println(enx.encrypt("Saul"));
    }
    
}
