/**
 * Problema 14
 * 
 * La siguiente secuencia iterativa se define para el conjunto de los números enteros:
 *	
 *	n -> n / 2 (n es par)
 *	n -> 3n + 1 (n es impar)
 *
 * Usando la regla anterior, empezando por 13 se genera la siguiente secuencia:
 *
 *	13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
 *
 * Esta secuencia contiene 10 terminos.
 *
 * Aunque no está probado (problema de Collatz) se cree que cualquier secuencia termina
 * en 1.
 *
 * ¿Que número menor de 1 millón como inicio produce la sencuencia más larga?
 *
 * NOTA: Una vez que comienza la secuencia a los términos se les permite ser mayores
 * de 1 millón.
 *
 * Ver 0.1 Fuerza Bruta
 */

#include<stdio.h>
#include<time.h>

long int cuentaTerminos(long int);
double logaritmo(double, double);

int main(){

    clock_t inicio, fin;
    
    long int i;
    long int menorque = 100000;
    long int secuenciaMayor = 0, maxTerminos = 0;
    long int aux;

    inicio = clock();

    for(i=1; i < menorque; i++){
	aux = cuentaTerminos(i);
	if(aux > maxTerminos){
	    maxTerminos = aux;
	    secuenciaMayor = i;
	}
    }
    printf("\n\nEl ter. con la secuencia mayor es(%ld ters.): %ld", maxTerminos, secuenciaMayor); 

    fin = clock();
    printf("\nTiempo de ejec: %.16g mseg",((double)((fin - inicio) / CLOCKS_PER_SEC) * 1000));
    return 0;
}
     
/**
 * Cuenta cuantos terminos tiene la secuencia desde el término inicial
 * que se le pasa.
 * Al mismo tiempo imprime los terminos.
 * VERSION FUERZA BRUTA
 */
long int cuentaTerminos(long int n){

    long int conta = 1;
    
    //printf("\n%ld ", n);
    while(n > 1){

	if(n % 2) n = n * 3 + 1;
	else n = n / 2;
	//printf("%ld ", n);
	conta++;
    }
    return conta;
}
