package foo;

import java.util.Random;

/**
 * Programa que realiza a divisão com base 
 * no dividendo e divisor informados.
 */
public final class ProgramaFoo {

    private static final Logger logger =
            LogManager.getLogger(ProgramaFoo.class);

    /**
     * Restringe criação de instância.
     */
    private ProgramaFoo() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     */
    public static void main(final String[] args) {
        
        Random gerador = new Random();
        logger.info("iniciado");
        int dividendo = gerador.nextInt();
        int divisor = gerador.nextInt();
        int resultado = Foo.div(dividendo, divisor);

        System.out.println("O resultado de " + dividendo + " / " + divisor + " é " + resultado);
    }
}
