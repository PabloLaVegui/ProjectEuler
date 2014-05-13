import java.util.ArrayList;

/**
 * Problema 3
 * Los factores primos de 13195 son de 5, 7, 13 y 29.
 * ¿Cuál es el factor primo más grande del número 600851475143?
 * Respuesta sacada de aquí:
 * http://danlaho.wordpress.com/2010/12/16/project-euler-problema-3/
 * despues de probar con la criba de Eratostenes entre otros algoritmos
 * desistí y tuve que buscar una solución en internet, la encontré en 
 * la página citada.
 * @author Pablo Gutiérrez
 */
public class Problema3
{
    public Problema3()
    {
        System.out.println(factorPrimoMayor(600851475143L));
    }

    /**
     * @param n El número del que se quiere saber su factor primo más grande
     * @return El factor primo más grande 
     */
    public long factorPrimoMayor(long n)
    {
        int factor;
        for(factor=2; n > 1; factor++){
            while(n % factor == 0){
                n = n / factor;
            }
        }
        return --factor;
    }
    
    /**
     * Comprueba si un número es primo
     * @param n El número a comprobar
     * @return true Si el número es primo
     */
    private boolean esPrimo(long n)
    {
        boolean primo = true;
        long div = 3;
        while(div < n && primo){
            if(n % div == 0) primo = false;
            div += 2;
        }
        return primo;
    }           
    
    /**
     * Calcula los divisiores primos de un número.
     * Los imprime y devuelve el mayor.
     * @param n El número del que se quieren saber sus factores primos
     * @return El divisor primo más grande del número
     */
    private long cribaEratostenes(long n)
    {
        ArrayList<Long> primos = new ArrayList<Long>();
        long tope = (long)Math.sqrt(n) + 1;
        int pos = 0;
        for(long i=2; i <= tope; i++){
            if(!primos.contains(Long.valueOf(i))){
                for(long j=i; j <= n/i+1; j++)
                    primos.add(Long.valueOf(i*j));
            }
        }
        
        long c = 0;
        long ultimo = 1;
        for(pos = 2; pos < n; pos++){
            if(!primos.contains(Long.valueOf(pos))){
                System.out.println(++c + ": " + pos);
                ultimo = pos;
            }
        }
        return ultimo;
    }
    
    private void cribaEratostenes2(long n)
    {
        long k, pos;
        long numMaxPrimos = (n - 3) / 2;
        long numPrimos = 0;
        
        long[] primos = new long[(int)numMaxPrimos + 1];
        boolean[] esPrimo = new boolean[(int)numMaxPrimos + 1];
        
        for(long i=0; i < numMaxPrimos; i++)
            esPrimo[(int)i] = true;
        
        for(long i=0; i*i < n; i++){
            k = i + 1;
            if(esPrimo[(int)i]){
                for(long p=i+1; (2*k+1)*(2*i+3) <= n; k++){
                    pos = ((2*p+1)*(2*i+3)-3) / 2;
                    esPrimo[(int)pos] = false;
                }
            }
        }
        
        //mostrar los números primos y almacenarlos en vector
        System.out.println("2");
        for(int i=0; i<= numMaxPrimos + 1; i++){
            if(esPrimo[i]){
                numPrimos++;
                primos[(int)numPrimos] = 2 * i + 3;
                System.out.print(" " + primos[(int)numPrimos]);
            }
        }
        
            
        
    }    
    
    /**
     * Devuelve la raiz cuadrada de un número
     * @param n El número
     * @return La parte entera de la raiz cuadrada del número
     */
    private long raizCuadrada(double n)
    {
        return (long)Math.sqrt(n);
    }
}
