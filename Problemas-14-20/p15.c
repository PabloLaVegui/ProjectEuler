/** 
 * Problema 15. Patrón de rejilla
 *
 * Starting in the top left corner of a 2×2 grid, and only being 
 * able to move to the right and down, there are exactly 6 routes to 
 * the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */

#include<stdio.h>

long double factorial(long double);

int main()
{
    long double n = 40, k = 20;
    long double res;

    res = factorial(n) / (factorial(n-k) * factorial(k));
    printf("\n%.0Lf\n",res);
    return 0;
}

long double factorial(long double n){
  long double i;
  long double res = 1;

    for(i=n; i>1; i--)
	res *= i;
    return res;
}
