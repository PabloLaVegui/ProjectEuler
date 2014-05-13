
/**
 * Problema 4
 * Un número capicúa se lee igual en ambos sentidos. El mayor palíndromo 
 * hecho a partir del producto de dos números de 2 dígitos es 9009 = 91 * 99.
 * Encuentra el mayor palíndromo hecho a partir del producto de dos números 
 * de 3 dígitos.
 * @author Pablo Gutiérrez
 * @version 1.1
 */
public class Problema4
{    
    public Problema4()
    {
        System.out.println(palindromo(3));
    }
    
    /**
     * Calcula el mayor palíndromo que se puede obtener multiplicando dos
     * números de las cifras indicadas
     * @param c El número de cifras máximo que tienen los multiplicandos
     * @return El mayor palíndromo que se puede obtener
     */
    public double palindromo(int c)
    {
        double mayor = 0;
        int oper1 = 0;
        int oper2 = 0;
        for(double n1 = Math.pow(10, c) - 1; n1 > 1; n1--){                    
            for(double n2 = Math.pow (10, c) - 1; n2 > 1; n2--){
                if(n1 * n2 > mayor){
                    if(compruebaPalindromo(n1 * n2)){
                        if(n1 * n2 > mayor){
                            mayor = n1 * n2;
                            oper1 = (int)n1;
                            oper2 = (int)n2;
                        }
                    }
                }
            }
        }
        System.out.println(oper1 + " * " + oper2 + " = " + mayor);
        return mayor;
    }
    
    /**
     * Comprueba si un número pasado como parámetro es un palíndromo
     * @param El número a comprobar
     * @return true si el número es un palíndromo
     */
    private boolean compruebaPalindromo(double n)
    {
        String cadena = String.valueOf(n);
        int primero = 0;
        int ultimo = cadena.length() - 3;
        boolean igual = true;
        while(igual && ultimo > primero){
            if(cadena.charAt(primero) != cadena.charAt(ultimo))
                igual = false;  
            primero++;
            ultimo--;
        }
        return igual;
    }
            
    private double eleva(int n)
    {
        return Math.pow(10, n) - 1;
    }
    
    private void cadena(double n)
    {
        n--;
        String c = String.valueOf(n);
        System.out.println(c);
        System.out.println(c.charAt(c.length() - 3));
        System.out.println(c.charAt(0));
    }
}
