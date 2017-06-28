import java.util.ArrayList;
import java.util.List;

public class PrimeSifter {

  public List<Object> createArray(int countUpTo){
    List<Object> result = new ArrayList<Object>();
    for (int i = 4; i <= countUpTo; i++){
      result.add(i);
    }
    return result;
  }

  public List<Object> findPrimes(ArrayList array) {
    for(int i = 0; i <= array.size(); i++){
      if (i % 2 == 0) {
        array.remove(i);
      }
    }
    return array;
  }

}
