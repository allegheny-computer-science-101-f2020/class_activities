import static org.junit.Assert.assertEquals;

import activitythree.Count;
import org.junit.Test;

/**
 * A JUnit test suite for Count.
 *
 * @author Janyl Jumadinova
 */
public class TestCount {

  @Test
  public void testCount() {
    // check correct count for a simple data set
    String [] input = {"Java ...", "Python ...", "... Java", "jar ..."};
    int result = Count.count(input);
    assertEquals(result, 2);
  }
}
