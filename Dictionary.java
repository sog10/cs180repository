import java.util.*
import java.io.*
public class Dictionary {
  private ArrayList<DictionaryEntry> dictionary;
  
  public Dictionary() {
    dictionary = new ArrayList<DictionaryEntry>();
  }
  
  public void addEntry(DictionaryEntry newDictionaryEntry) {
    dictionary.add(newDictionaryEntry);
  }
  
  public void removeEntry(Dictionaryentry theDictionaryEntry) {
    dictionary.remove(theDictionaryEntry);
  }
  
  public DictionaryEntry searchByPirate(String pirateTranslation) {
    DictionaryEntry returnDictinaryEntry = null;
    for (DictionaryEntry d: dictionary) {
      if (d.getPirateTranslation.equalsIgnoreCase(pirateTranslation) {
        return d;
      }
    }
    return returnDictionaryEntry;
  }
  
  public DictionaryEntry searchByEnglish(String englishTranslation) {
    DictionaryEntry returnDictionaryEntry = null;
    for (DictionaryEntry d: dictionary) {
      if (d.getEnglishTranslation.equalsIgnoreCase(englishTranslation) {
        return d;
      }
    }
    return returnDictionaryEntry;
  }
  
  public void saveDictionary(String fileName) throws IOException {
    PrintWriter outfile = new PrintWriter (new OutputStreamReader (new FileOutputStream(fileName)));
    outfile.println(dictionary.size());
    for (DictionaryEntry d: dictionary) {
      outfile.println(d.getPirateTranslation());
      outfile.println(d.getEnglishTranslation());
    }
    outfile.close();
  }
  
  public void loadDictionary(String fileName)
}
