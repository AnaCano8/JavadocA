
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {

    
    /**
     * Divide a y b, pero para hacerlo, la variable no puede ser 0
     * @param a numero a dividir
     * @param b divisor y no puede ser 0 ya que generara un  error
     * @return el resultado de la division
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

 /**
  * Calcula el cuadrado de a
  * @param a numero a calcular su cuadrado
  * @return el cuadrado de el numero que has introducido
  */
    public int calcularCuadrado(int a) {
        return a * a;
    }
/**
 * Calcula la raiz cuadrada de a
 * @param a numero a calcular y no puede ser menor que cero, si lo 
 * es generara un error
 * @return la raiz cuadrada de el numero introducido
 */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

