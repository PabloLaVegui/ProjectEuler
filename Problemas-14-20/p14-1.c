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
 * Versión 0.2 Busqueda mejorada.
 */

#include<stdio.h>
#include<math.h>
#include<time.h>

double cuentaTerminosMejorado(double);
double logaritmo(double, double);

int main(){

    clock_t inicio, fin;
    
    double menorque = 1000000;
    double secuenciaMayor = 0, terminoMayor = 0;
    double aux;

    inicio = clock();

    while(menorque > 1){

	aux = cuentaTerminosMejorado(menorque);
	if(aux > secuenciaMayor){
	    secuenciaMayor = aux;
	    terminoMayor = menorque;
	}
	menorque--;
    }
    printf("\n\nEl ter con la sec mayor (%.0lf ters)es: %.0lf", secuenciaMayor, terminoMayor);

    fin = clock();
    printf("\nTiempo de ejec: %.16g mseg", ((double)(fin - inicio)/ CLOCKS_PER_SEC )*1000);
    return 0;
}

/**
 * Cuenta cuantos terminos tiene la secuencia desde el termino inicial
 * que se le pasa.
 * Algoritmo mejorado
 */
double cuentaTerminosMejorado(double n){

    double conta = 1;

    while(n > 1){
	// Si el término es potencia de 2, la secuencia tiene los términos del
	// exponente y termina.
	// Se calcula comprobando que el logaritmo en base 2 del número es entero.
	if(fmod(logaritmo(n, 2), 1)){	// No es potencia de 2
	    if(fmod(n, 2)) n = n * 3 + 1;
	    else n = n / 2;
	    conta++;
	}else{
	    conta += logaritmo(n, 2);
	    n = 1;
	}
    }
    return conta;
}

/**
 * Calcula el logaritmo en base n de un número
 */
double logaritmo(double num, double base){
    return log(num) / log(base);
}
