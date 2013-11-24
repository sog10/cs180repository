import java.io.*
import java.util.*
public class NameGenerator {
  private ArrayList<String> partials1;
  private ArrayList<String> partials2;
  private ArrayList<String> partials3;
  private Random random;
  
  public NameGenerator() {
    partials1 = new ArrayList<String>();
    partials2 = new ArrayList<String>();
    partials3 = new ArrayList<String>();
    random = new Random();
  }
  
  public String nameGenerator() {
    String partial1 = partials1.get(random.nextInt(partials1.size()));
    String partial2 = partials2.get(random.nextInt(partials2.size()));
    String partial3 = partials3.get(random.nextInt(partials3.size()));
    return partial1 + "-" + partial2 + " " + partial3;
  }
  
  
}
