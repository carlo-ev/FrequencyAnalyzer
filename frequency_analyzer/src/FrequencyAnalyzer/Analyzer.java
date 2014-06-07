/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;


public class Analyzer {
  
  private String message;
  private int total;
  public Analyzer(String m){
      this.message = m.toLowerCase();
      this.message = this.message.replaceAll("\\s+", "");
      this.total = this.message.length();
  }
  
  public ArrayList<LetterAndFrequency> getFrequencies(){
      ArrayList<LetterAndFrequency> freqs = new ArrayList<LetterAndFrequency>();
      LetterAndFrequency lAF = getLetterWithFrequency();
      while(lAF != null){
          freqs.add(lAF);
          lAF = getLetterWithFrequency();
      }
      return freqs;
  }
  
  public HashMap<String, String> frequencyMapAsString(){
      HashMap<String, String> stringified = new HashMap<String, String>();
      ArrayList<LetterAndFrequency> oh = getFrequencies();
      for (LetterAndFrequency f : oh){
          stringified.put(f.getLetter(), String.valueOf(f.getFrequency()));
      }
      return stringified;
  }
  
  
  //Metodo crasheando
  private LetterAndFrequency getLetterWithFrequency(){
      int count = 0;
      if(!message.isEmpty()){
          String toAnalyze = Character.toString(this.message.charAt(0));
          for(int i = 0; i < this.message.length(); i++){
              if(Character.toString(message.charAt(i)).equals(toAnalyze))
                  count++;
          }
          this.message = this.message.replaceAll(toAnalyze,"");
          return new LetterAndFrequency(toAnalyze, count * 1.0/this.total);
      }
      return null;
  }
  
  
  //Internal class ====== this works well
  private class LetterAndFrequency{
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
  
}
