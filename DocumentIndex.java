import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
  
  public DocumentIndex() {
    super();
  }
  
  public DocumentIndex(int num) {
    super(num);
  }
  
  public void addWord (String word, int num) {
    IndexEntry entry = super.get(foundOrInserted(word));
    entry.add(num);
  }
  
  public void addAllWords(String str, int num) {
    String[] array = str.split("\\W+");
    for (int k = 0; k < array.length; k++) {
      if (str.length() != 0)
        addWord(str, num);
  }}
  
  private int foundOrInserted (String word) {
    if(this.size() == 0) {
      IndexEntry first = new IndexEntry(word);
      this.add(first);
      return 0;
  }
    for (int i = 0; i < this.size(); i++) {
      IndexEntry other = this.get(i);
      String s = other.getWord();
      if (s.compareToIgnoreCase(word) == 0) {
        return i;
      }
      if (s.compareToIgnoreCase(word) < 0) {
        IndexEntry insert = new IndexEntry (word);
        this.add(i, insert);
        return i;
      }
    }
    return this.size() - 2;
  }
}
    