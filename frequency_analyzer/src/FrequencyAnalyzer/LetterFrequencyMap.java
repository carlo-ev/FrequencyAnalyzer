/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;

import java.util.ArrayList;


public class LetterFrequencyMap {
        private final String[] alphabet = {"a", "b", "c","d","e", "f", "g","h","i", "j", "k","l", "m", "n", "o","p"
                + "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        private final double[] freqs = {8.2, 1.5, 2.8, 4.3, 12.7, 2.2, 2.0, 6.1, 7.0, 0.15, 0.8, 4.0, 2.4, 6.7, 7.5, 1.9, 0.10, 6.0, 6.3, 9.1, 2.8, 1.0, 2.4, 0.15, 2.0, 0.007};
        private ArrayList<LetterFrequency> englishLetterFrequencies;
        
        public LetterFrequencyMap(){
            for(int i = 0; i < this.alphabet.length; i++){
                this.englishLetterFrequencies.add(new LetterFrequency(freqs[i], alphabet[i], false));
            }
        }
    
        private class LetterFrequency {

            private double frequency;
            private String letter;
            private boolean usedToSubstitute;

            public LetterFrequency(double f, String l, boolean u){
                this.frequency = f;
                this.letter = l;
                this.usedToSubstitute = u;
            }

            public double getFrequency(){
                return this.frequency;
            }

            public String getLetter(){
                return this.letter;
            }
        }    
}
