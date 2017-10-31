package foo;

/**
 * Foo class.
 *
 * <p>Implementação de uma classe para divisão de sois números.
 *
 */
public class Foo {
    
    /**
     * Construtor da classe.
     *
     * @throws IllegalStateException Caso a classe seja instaciada.
     */
    protected Foo() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param dividendo     Dividendo.
     * @param divisor       Divisor.
     * @return              Resultado da divisão.
     *
     * @throws UnsupportedOperationException Caso o divisor seja 0.
     */
    public static int div(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new UnsupportedOperationException("Can't divide by zero!");
        }

        return dividendo / divisor;
    }
}
