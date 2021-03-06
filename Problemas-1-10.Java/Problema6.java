
/**
 * La suma de los cuadrados de los primeros diez números naturales es
 * 1^2 + 2^2 + ... + 10^2 = 385
 * El cuadrado de la suma de los primeros diez números naturales es
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Por lo tanto la diferencia entre la suma de los cuadrados de los primeros 
 * diez números naturales y el cuadrado de la suma es 3025 385 = 2640
 * Encuentra la diferencia entre la suma de los cuadrados de los primeros cien 
 * números naturales y el cuadrado de la suma.
 * 
 * @author Pablo Gutiérrez
 */
public class Problema6
{
    public Problema6()
    {
        System.out.println(sumaAlCuadrado(100) - sumaCuadrados(100));    
    }
    
    /**
     * Calcula la suma de los n primeros números naturales
     * @param n Cuantos números
     * @return La suma
     */
    public long sumaCuadrados(int n)
    {
        long suma = 0;
        for(int i=1; i<=n; i++){
            suma += Math.pow(i, 2);
        }
        return suma;
    }
    
    /**
     * Calcula el cuadrado de la suma de los n primeros números naturales
     * @param n Cuantos números
     * @return El cuadrado de la suma
     */
    public long sumaAlCuadrado(int n)
    {
        long suma = 0;
        for(int i=1; i<=n; i++){
            suma += i;
        }
        return (long)Math.pow(suma, 2);
    }
}
