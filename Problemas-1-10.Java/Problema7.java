
/**
 * Al enumerar los seis primeros números primos: 2, 3, 5, 7, 11 y 13, 
 * podemos ver que el sexto primo es 13.
 * ¿Cuál es el número primo 10001? 
 * 
 * @author Pablo Gutiérrez
 */
public class Problema7
{
    public Problema7()
    {
        System.out.println(primoEnPosicion(10001));
    }
    
    /**
     * Devuelve el enésimo número primo
     * @param n Posición que ocupa el número primo
     * @return El número que ocupa la posición n
     */
    public long primoEnPosicion(int pos)
    {
        int cuentaPrimos = 0;
        long numero = 2;
        while(cuentaPrimos < pos){
            int div = 2;
            if(esPrimo(numero)) cuentaPrimos++;
            numero++;
        }
        return --numero;      
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
}
