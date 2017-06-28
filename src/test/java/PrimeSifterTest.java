import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class PrimeSifterTest {


  @Test
  public void createArray_countUpToTwo_ArrayList() {
    PrimeSifter testPrimeSifter = new PrimeSifter();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(4);
    assertEquals(expectedOutput, testPrimeSifter.createArray(4));
  }

  @Test
  public void createArray_countUpToGivenNumber_ArrayList() {
   PrimeSifter testPrimeSifter = new PrimeSifter();
   List<Object> expectedOutput = new ArrayList<Object>();
   expectedOutput.add(4);
   expectedOutput.add(5);
   assertEquals(expectedOutput, testPrimeSifter.createArray(5));
  }

  @Test
  public void findPrimes_deletesEvenNumbers_ArrayList() {
    PrimeSifter testPrimeSifter = new PrimeSifter();
    ArrayList firstArray = new ArrayList();
    firstArray.add(4);
    firstArray.add(5);
    ArrayList expectedOutput = new ArrayList();
    expectedOutput.add(5);
    assertEquals(expectedOutput, testPrimeSifter.findPrimes(firstArray));
  }
}
