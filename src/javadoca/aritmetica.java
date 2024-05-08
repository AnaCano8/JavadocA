
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

    /**
     * Suma el elemento a y b
     * @param a numero a sumar
     * @param b numero b a sumar
     * @return la suma de a+b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

/**
 * Hace una resta de el elemento a y b
 * @param a numero a restar
 * @param b numero a restar
 * @return la resta de a-b
 */
    public int restar(int a, int b) {
        return a - b;
    }
/**
 * multiplica el elemento a y b
 * @param a numero a multiplicar
 * @param b numero a multiplicar
 * @return el resultado de la multiplicacion
 */
    public int multiplicar(int a, int b) {
        return a * b;
    }
/**
 * divide el elemento a y v
 * @param a numero a dividir
 * @param b numero a dividir y no puede ser igual a 0 ya que se generara un error
 * @return regresa el resultado a la division y lo convierte de tipo entero
 */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

