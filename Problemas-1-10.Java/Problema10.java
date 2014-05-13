
/**
 * Problema 10
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * @author Pablo Gutiérrez
 */

import java.util.ArrayList;

public class Problema10
{
    private long suma = 0;
    
    public Problema10()
    {
        long start = System.currentTimeMillis();
        
        //System.out.println(sumaPrimosFuerzaBruta(2000000));
        
        for(Long primo: eratostenes(2000000)){
            System.out.println(primo);
            suma += primo;
        }
        System.out.println("Suma: " + suma);
        
        long end = System.currentTimeMillis();
        System.out.println("Tiempo de cálculo: " + ((end - start) / 1000) + " s");
    }
    
    /**
     * Comprueba si un número es primo o no
     * @param n El número a comprobar
     */
     private boolean esPrimo(long n)
     {
         boolean primo = true;
         long div = 2;
         while(n > div && primo){
             if(n % div == 0) primo = false;
             div++;
         }
         return primo;
     }
     
     /**
      * Calculo mediante la criba de Eratóstenes      
      * http://es.wikipedia.org/wiki/Criba_de_Eratóstenes
      * @param n Hasta que número se van a buscar primos
      * @return Un array con los primos encontrados menores que el parámetro
      */
     public ArrayList<Long> eratostenes(long n)
     {
         ArrayList<Boolean> array = new ArrayList<Boolean>();
         ArrayList<Long> primos = new ArrayList<Long>();         
         // Inizializar Array
         for(int i=0; i <= n; i++){
             if(i < 2) array.add(true);
             else      array.add(false);
         }
         // Marcar los primos
         for(int i=2; i <= Math.sqrt(n); i++){
             if(!array.get(i)){
                 for(int j=i; j <=  n/i; j++) {
                     array.set(i*j, true);
                 }
             }
         }
         // Crear array con los primos
         for(int i=0; i < n; i++){
             if(!array.get(i)) primos.add((long)i);
         }
         return primos;
     }

     /**
      * TODO
      * pdf Problema 7:
      * Algunos datos útiles:
      * 1 no es primo.
      * Todos los primos excepto 2 son impares.
      * Todos los números primos mayores que 3 se puede escribir en la forma 6k +/- 1.
      * Cualquier número n sólo puede tener un factor primo mayor que raiz de n.
      * La consecuencia para las pruebas de primalidad de un número n es la siguiente: 
      * si no podemos encontrar un número f menor o igual a raiz de n que divide a n, 
      * entonces n es primo: el factor primo de n es n mismo.
      */

}
