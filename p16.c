/**
 * Power Digit Sum
 *
 * 2^15 = 32768 y la suma de los dígitos es 3 + 2 + 7 + 6 + 8 = 26.
 *
 * ¿Cual es la suma de los dígitos de 2^1000?
 *
 * Se utiliza la libreria GMP (GNU Multiple Precision Arithmetic 
 * Library) para manejar números muy grandes.
 * http://gmplib.org
 */

#include<stdio.h>
#include<gmp.h>

int main()
{
    mpz_t n;
    mpz_t conta;
    mpz_t resto;
    mpz_init(n);
    mpz_init(conta);
    mpz_init(resto);

    mpz_ui_pow_ui(n, 2 , 10);
    mpz_out_str(stdout, 10, n);

    printf("\n");
    mpz_invert(n, dividendo, divisor);
    mpz_out_str(stdout, 10, n);
    
    return 0;
}
