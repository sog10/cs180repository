public class DictionaryEntry {
  private String pirateTranslation;
  private String englishTranslation;
  
  public DictionaryEntry(String pirate, String english) {
    pirateTranslation = pirate;
    englishTranslation = english;
  }
  
  public getEnglishTranslation() {
    return englishTranslation;
  }
  
  public getPirateTranslation() {
    return pirateTranslation;
  }
  
  public String toString() {
    return pirateTranslation+" = "+englishTranslation;
  }
}
