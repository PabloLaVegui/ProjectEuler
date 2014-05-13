/* Problema 17
 *
 * Si escribimos los números del uno al 5 con palabras: one, two, three, four, five,
 * entonces hay 3 + 3 + 5 + 4 + 4 = 19 letras en total.
 *
 * Si escribimos los números del 1 al 1000 incluidos con palabras, ¿cuantas letras
 * hay que usar?
 *
 * NOTA: No contar espacios ni guiones. Por ej, 342 (three hundred and forty-two)
 * contine 23 letras y 115 (one hundred and fifteen) contiene 20 letras. El uso
 * de "and" cuando se escriben números es en convenio con el uso Británico.
 */

#include<stdio.h>

int cuentaLetras(int);

int main()
{
    int i, conta = 0;
    
    for(i = 1; i < 51; i++)
	printf("%d -> %d\n",i, cuentaLetras(i));

    return 0;
}

int cuentaLetras(int n){
    //                 1  2  3  4  5  6  7  8  9 
    int letras[10]={0, 3, 3, 5, 4, 4, 3, 5, 5, 4};
    //                  0 10 20 30 40 50 60 70 80 90
    int constantes[10]={0, 4, 6, 6, 5, 5, 5, 7, 6, 6};
    //                 11 12 13 14 15 16 17 18 19
    int decena1[10]={3, 3, 3, 3, 4, 3, 4, 4, 3, 4};
    int decena = 0, desvio=0;
    int conta = 0;
    int constante = 0;

    while(n >= 10){
	decena++;
	n -= 10;
    }
    if(decena == 1) constantes[1] = decena1[n];
    return constantes[decena] + letras[n];
}
