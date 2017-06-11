package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test(expected = UnsupportedOperationException.class)
  public void testInvalidDivider() throws Exception {
    Foo.div(10, 0);
  }

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Foo.div(10, 5), 2);
  }
}
