
/**
 * Problema 1.
 * Si una lista de todos los números naturales por debajo de 10 que son múltiplos de 3 o 5,
 * se obtiene 3, 5, 6 y 9. La suma de estos múltiplos es 23.
 * Encuentra la suma de todos los múltiplos de 3 o 5 por debajo de 1000.
 * @author Pablo Gutiérrez
 */
public class Problema1
{
    Problema1()
    {
        System.out.println(sumaMultiplos3y5(1000));
    }
    
    /**
     * @param n Hasta que número se hace la suma 
     * @return La suma de los números enteros menores que un número que son 
     * múltiplos de 3 o de 5.
     */    
    public int sumaMultiplos3y5(int n)
    {
        int suma=0;
        for(int i=0; i<n; i++){
            if(i%3 == 0 || i%5 == 0){
                suma += i;
            }
        }
        return suma;
    }
}
