#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*creem una variable enter amb el time a NULL*/
	int seed = time(NULL);
	
	/*inicialitzem el srand (rand()) amb amb el time NULL (seed) per despres poder utilitzar el rand*/
    srand(seed);
	
	/* crea una variable Integer amb el nom value*/
    int value = 0;
	
	/*Crea un valor random entre 1 a 10 a la variable value.*/
    value =rand()%10+1;
	
	/*Escriu per pantalla "value is" i el valor de value*/
    printf("value is %d\n", value); 
	
	/* Escriu el valor en un fitcher*/
    fprintf(stdout, "%d",value);
	
	/*Comprova si el proces a sortit bé */
    return EXIT_SUCCESS;
}
