import java.util.ArrayList;

public class IndexEntry {
  private String words;
  private ArrayList <Integer> numsList;
  
  public IndexEntry (String w) {
    words = w.toUpperCase();
    numsList = new ArrayList <Integer> ();
  }
  
  public void add(int num) {
    if(!numsList.contains(num)) {
      numsList.add(num);
    }
  }
  
  public String getWord() {
    return words;
  }
  
  public String toString() {
    return words + numsList.toString();
  }
    }