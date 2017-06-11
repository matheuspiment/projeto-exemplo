package foo;

import static org.junit.Assert;
import org.junit.Test;

/**
 * FooTest class.
 */
public class FooTest {

    /**
     * Testa o construtor da classe.
     *
     * @throws IllegalStateException Caso a classe seja instanciada.
     */
    @Test(expected = IllegalStateException.class)
    public void testIllegalState() throws Exception {
        new Foo();
    }
    
    /**
     * Testa a exceção do divisor 0.
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
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */
    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals(Foo.div(10, 5), 2);
    }
}
