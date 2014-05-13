
/**
 *  Problema 2
 *  Cada nuevo término en la secuencia de Fibonacci se genera mediante la adición de 
 *  los dos términos anteriores. 
 *  Al comenzar con 1 y 2, los primeros 10 términos será:
 *  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *  Al considerar los términos de la sucesión de Fibonacci cuyos valores no superan 
 *  los cuatro millones, hallar la suma de los términos impares.
 * 
 *  @author Pablo Gutiérrez
 */
public class Problema2
{
    public Problema2()
    {
        System.out.println(sumaElementosFibonacci(4000000));
    }
    
    /**
     * @param n La serie se suma mientras los elementos sean menores que n
     */
    public int sumaElementosFibonacci(int n)
    {
        int suma = 0;
        int elem = 1;
        while(elementoFibonacci(elem) <= n){
            if(elementoFibonacci(elem) % 2 != 0) suma += elementoFibonacci(elem);
            elem++;
        }
        return suma;
    }
    
    /**
     * Calcula el elemento enésimo de la serie de Fibonacci.1,1,2,3,5,8,13...
     * @param n El número de elemento
     * @return el elemento correspondiente a esa posición.
     */
    private int elementoFibonacci(int n)
    {
         if(n>2){
            return elementoFibonacci(n-1) + elementoFibonacci(n-2);
        }else{
            return 1;
        }      
    }
}
  
