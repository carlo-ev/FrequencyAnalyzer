/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;

/**
 *
 * @author carlo
 */
public class LetterAndFrequency {
      private double frequency;
      private String letter;
      public LetterAndFrequency(String letter, double f){
          this.letter = letter;
          this.frequency = f;
      }
      
      public double getFrequency(){
          return this.frequency;
      }
      
      public String getLetter(){
          return this.letter;
      }
}
