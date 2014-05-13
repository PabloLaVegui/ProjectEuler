
/**
 * 2520 es el número más pequeño que se puede dividir por cada uno de los 
 * números del 1 al 10 sin ningún resto.
 * ¿Cuál es el menor número positivo que es divisible por todos los números del 1 al 20?
 * @author Pablo Gutiérrez
 */
public class Problema5
{
    public Problema5()
    {
        System.out.println(divisiblePorTodos(1, 20));
    }
    
    /**
     * Calcula el número más pequeño que se puede dividir por cada uno de los
     * números de un rango sin ningún resto
     * @param inicio El primer valor del rango
     * @param final  El último valor del rango
     * @return El número más pequeño que se puede dividir por todos los valores
     *         del rango sin ningún resto
     */
    public int divisiblePorTodos(int inicio, int fin)
    {
        int candidato = fin;
        boolean encontrado = false;
        while(!encontrado){
            boolean valido = true;
            int div = fin;
            while(div >= inicio && valido){
                if(candidato % div == 0){
                    div--;
                }else{
                    valido = false;
                    candidato++;
                }
            }
            encontrado = valido;
        }
        return candidato;                
    }
}
