/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrequencyAnalyzer;


/**
 *
 * @author saulecabrera
 */
public class Analyzer {
    
  private String message;
  private LetterFrequencyMap letterFrequencyMap;
  public Analyzer(String m){
      this.message = m;
      this.letterFrequencyMap = new LetterFrequencyMap();
  }
  
  
    
}
