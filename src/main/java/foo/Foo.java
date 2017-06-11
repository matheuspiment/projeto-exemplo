package foo;

/**
 * Foo class
 */
public class Foo {
    
    /**
     * Construtor da classe.
     *
     * @throws IllegalStateException Caso o divisor seja 0.
     */
    private Foo() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a     Dividendo.
     * @param b     Divisor.
     * @return      Resultado da divisão.
     *
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */
    public static int div(int a, int b) {
        if (b == 0) {
            throw new UnsupportedOperationException("Can't divide by zero!");
        }

        return a / b;
    }
}
