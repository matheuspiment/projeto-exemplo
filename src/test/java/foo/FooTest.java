package foo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FooTest class
 */
public class FooTest {

    /**
     * Testa a exceção do divisor 0.
     *
     * @param a     Dividendo 10.
     * @param b     Divisor 0.
     *
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testInvalidDivider() throws Exception {
        Foo.div(10, 0);
    }

    /**
     * Testa a exceção do divisor 0.
     *
     * @param a Dividendo 10.
     * @param b Divisor 5.
     * @return Resultado da divisão 2.
     *
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */
    @Test
    public void testAdd() throws Exception {
        assertEquals(Foo.div(10, 5), 2);
    }
}
