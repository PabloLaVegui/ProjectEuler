
/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * @author Pablo Gutiérrez  
 */
public class Problema9
{
    Problema9()
    {
        System.out.println("Resultado: " + multiplicaTripleta(1000));
    }
    
    /**
     * @param suma Lo que debe sumar la tripleta pitagórica
     * @return El resultado de multiplicar la tripleta pitagórica que cumple la suma
     *         que se le pasa como parámetro
     */
    public double multiplicaTripleta(int suma)
    {
        long start = System.currentTimeMillis();
        int a = 2;
        int b = 1;
        double c = 0;
        boolean encontrado = false;
        while(!encontrado){
            b++;
            if(b == a){
                b = 0;
                a++;
            }
            c = Math.pow(a, 2) + Math.pow(b, 2);
            if(Math.pow(Math.sqrt(c), 2) == c && a + b + Math.sqrt(c) == suma){
                        encontrado = true;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de cálculo: " + (end - start));
        System.out.println(Math.pow(a,2) + "+" + Math.pow(b,2) + "=" + c);
        System.out.println(a + "+" + b + "+" + Math.sqrt(c) + "=" + suma);
        System.out.println(a*b*Math.sqrt(c));
        return a * b * Math.sqrt(c);
    }
    
    /**
     * TODO: Algoritmo con parametrización de tripletas pitagóricas (mirar pdf del
     *  problema)
     */
}
